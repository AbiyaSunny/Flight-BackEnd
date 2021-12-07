package com.flight.amadeusconnection;

import com.amadeus.Amadeus;
import com.amadeus.Params;

import com.amadeus.resources.FlightOfferSearch;

import com.amadeus.exceptions.ResponseException;

public enum AmadeusConnect {
	INSTANCE;

	private Amadeus amadeus;

	private AmadeusConnect() {
		this.amadeus = Amadeus.builder("jbW4EOdhh7JWFb0jvYiUNAEbjfYMPcwt", "rdALme9RplFAqBex").build();
	}

	public FlightOfferSearch[] flights(String origin, String destination, String departDate, int adults,
			String returnDate, String travelClass) throws ResponseException {
		return amadeus.shopping.flightOffersSearch.get(Params.with("originLocationCode", origin)
				.and("destinationLocationCode", destination).and("departureDate", departDate)
				.and("returnDate", returnDate).and("adults", adults).and("max", 1).and("travelClass", travelClass));
	}
}
