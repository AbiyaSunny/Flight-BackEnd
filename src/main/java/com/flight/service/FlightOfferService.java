package com.flight.service;

import com.amadeus.exceptions.ResponseException;
import com.amadeus.resources.FlightOfferSearch;
import com.flight.amadeusconnection.AmadeusConnect;
import com.flight.model.FlightOfferRequestModel;

public class FlightOfferService {

	// wrapper function for calling amadeus api
	public static FlightOfferSearch[] getDataFromAmadeus(FlightOfferRequestModel request) throws ResponseException {
		AmadeusConnect amd = new AmadeusConnect();
		FlightOfferSearch[] flights = amd.flights(request.getClientId(), request.getClientSecret(), request.getOrigin(),
				request.getDestination(), request.getDepartDate(), request.getAdults(), request.getReturnDate(),
				request.getTravelClass());
		return flights;
	}
}
