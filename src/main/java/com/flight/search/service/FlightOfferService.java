package com.flight.search.service;

import com.amadeus.exceptions.ResponseException;
import com.amadeus.resources.FlightOfferSearch;
import com.flight.search.amadeusconnection.AmadeusConnect;
import com.flight.search.model.FlightOfferRequestModel;

public class FlightOfferService {

	public static FlightOfferSearch[] getDataFromAmadeus(FlightOfferRequestModel request) throws ResponseException {
		
		FlightOfferSearch[] flights = AmadeusConnect.INSTANCE.flights(request.getClientId(), request.getClientSecret(),
				request.getOrigin(), request.getDestination(), request.getDepartDate(), request.getAdults(),
				request.getReturnDate(), request.getTravelClass());
		return flights;
	}
}
