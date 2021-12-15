
package com.flight.search.amadeusconnection;

import org.springframework.stereotype.Component;
import com.amadeus.Amadeus;
import com.amadeus.Params;
import com.amadeus.referenceData.Locations;
import com.amadeus.resources.Airline;
import com.amadeus.resources.CheckinLink;
import com.amadeus.resources.FlightOfferSearch;
import com.amadeus.resources.FlightPrice;
import com.amadeus.resources.Location;
import com.amadeus.exceptions.ResponseException;

@Component
public class AmadeusConnect {

	Amadeus amadeus = Amadeus.builder(System.getenv()).build();

	public Location[] locations(String key) throws ResponseException {
		return amadeus.referenceData.locations.get(Params.with("keyword", key).and("subType", Locations.AIRPORT));
	}

	public FlightOfferSearch[] flights(String origin, String destination, String departDate, int adults,
			String returnDate, String travelClass) throws ResponseException {

		if (returnDate == null) {
			return amadeus.shopping.flightOffersSearch.get(Params.with("originLocationCode", origin)
					.and("destinationLocationCode", destination).and("departureDate", departDate).and("adults", adults)
					.and("max", 5).and("currencyCode", "INR").and("travelClass", travelClass));
		} else {
			return amadeus.shopping.flightOffersSearch
					.get(Params.with("originLocationCode", origin).and("destinationLocationCode", destination)
							.and("departureDate", departDate).and("returnDate", returnDate).and("adults", adults)
							.and("max", 5).and("travelClass", travelClass).and("currencyCode", "INR"));
		}
	}

	public FlightPrice confirm(FlightOfferSearch offer) throws ResponseException {
		return amadeus.shopping.flightOffersSearch.pricing.post(offer);
	}



	public Airline[]  getAirlineName(String code) throws ResponseException {
		return  amadeus.referenceData.airlines.get(Params.with("airlineCodes", code));
		 }

	
}
