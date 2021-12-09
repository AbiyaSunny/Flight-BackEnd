package com.flight.amadeusconnection;

import com.amadeus.Amadeus;
import com.amadeus.Params;

import com.amadeus.resources.FlightOfferSearch;

import com.amadeus.exceptions.ResponseException;

public class AmadeusConnect {

	private Amadeus amadeus;

	public FlightOfferSearch[] flights(String clientId, String clientSecret, String origin, String destination,
			String departDate, int adults, String returnDate, String travelClass) throws ResponseException {

		this.amadeus = Amadeus.builder(clientId, clientSecret).build();

		if (returnDate == null) {
			return amadeus.shopping.flightOffersSearch.get(Params.with("originLocationCode", origin)
					.and("destinationLocationCode", destination).and("departureDate", departDate).and("adults", adults)
					.and("max", 1).and("travelClass", travelClass));
		} else {
			return amadeus.shopping.flightOffersSearch.get(Params.with("originLocationCode", origin)
					.and("destinationLocationCode", destination).and("departureDate", departDate)
					.and("returnDate", returnDate).and("adults", adults).and("max", 1).and("travelClass", travelClass));
		}
	}
}
