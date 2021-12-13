package com.flight.search.service;

import java.util.ArrayList;
import java.util.List;

import com.amadeus.exceptions.ResponseException;
import com.amadeus.resources.FlightOfferSearch;
import com.amadeus.resources.FlightOfferSearch.FareDetailsBySegment;
import com.amadeus.resources.FlightOfferSearch.Itinerary;
import com.amadeus.resources.FlightOfferSearch.SearchSegment;
import com.amadeus.resources.FlightOfferSearch.TravelerPricing;
import com.amadeus.resources.FlightPrice;
import com.flight.search.amadeusconnection.AmadeusConnect;
import com.flight.search.model.Passenger;
import com.flight.search.model.Segment;
import com.flight.search.model.SelectedFlightResponseModel;

public class SelectedFlightService {

	public static SelectedFlightResponseModel getTravelers(FlightOfferSearch search) throws ResponseException {

		FlightPrice amadeusResponse = AmadeusConnect.INSTANCE.confirm(search);
		SelectedFlightResponseModel response = new SelectedFlightResponseModel();
		System.out.println("in service");
		TravelerPricing[] travelerPricings = amadeusResponse.getFlightOffers()[0].getTravelerPricings();
		System.out.println("read traveller pricings");
		Itinerary[] itineraries = amadeusResponse.getFlightOffers()[0].getItineraries();
		System.out.println("read itenerary");
		getPriceDetails(response, travelerPricings);

		List<Segment> outBoundSegments = getBaggageDetails(travelerPricings, itineraries[0].getSegments());
		System.out.println("got outbounds");

		List<Segment> inBoundSegments = null;
		if (itineraries.length > 1) {
			inBoundSegments = getBaggageDetails(travelerPricings, itineraries[1].getSegments());
		}
		System.out.println("got inBounds");
		response.setInBoundSegments(inBoundSegments);
		response.setOutBoundSegments(outBoundSegments);

		return response;
	}

	// To get pricing details of all passengers
	private static void getPriceDetails(SelectedFlightResponseModel response, TravelerPricing[] travelerPricings) {

		for (TravelerPricing pricing : travelerPricings) {
			Passenger passenger = new Passenger();
			passenger.setId(pricing.getTravelerId());
			passenger.setBasePrice(pricing.getPrice().getBase());
			passenger.setTotal(pricing.getPrice().getTotal());
			passenger.setTravelerType(pricing.getTravelerType());

			response.getTravelers().add(passenger);
		}
	}

	// To get baggage details by segment
	private static List<Segment> getBaggageDetails(TravelerPricing[] travelerPricings, SearchSegment[] segments) {

		List<Segment> responseSegments = new ArrayList<Segment>();

		for (SearchSegment segment : segments) {
			Segment item = new Segment();

			item.getDeparture().setIataCode(segment.getDeparture().getIataCode());
			item.getDeparture().setTerminal(segment.getDeparture().getTerminal());
			item.getDeparture().setAt(segment.getDeparture().getAt());

			item.getArrival().setIataCode(segment.getArrival().getIataCode());
			item.getArrival().setTerminal(segment.getArrival().getTerminal());
			item.getArrival().setAt(segment.getArrival().getAt());

			item.setCarrierCode(segment.getCarrierCode());
			item.setDuration(segment.getDuration());
			item.setNumber(segment.getNumber());

			TravelerPricing outboundPrice = travelerPricings[0];
			for (FareDetailsBySegment detail : outboundPrice.getFareDetailsBySegment()) {
				if (detail.getSegmentId().equals(segment.getId())) {
					item.setWeight(detail.getIncludedCheckedBags().getWeight());
					item.setWeightUnit(detail.getIncludedCheckedBags().getWeightUnit());
				}
			}

			responseSegments.add(item);
		}

		return responseSegments;

	}
}
