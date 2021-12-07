package com.flight.service;

import com.amadeus.exceptions.ResponseException;
import com.amadeus.resources.FlightOfferSearch;
import com.flight.amadeusconnection.AmadeusConnect;
import com.flight.model.FlightOfferRequestModel;

public class FlightOfferService {

	public static FlightOfferSearch[] getDataFromAmadeus(FlightOfferRequestModel request) throws ResponseException {

		return AmadeusConnect.INSTANCE.flights(request.getOrigin(), request.getDestination(), request.getDepartDate(),
				request.getAdults(), request.getReturnDate(), request.getTravelClass());

	}
}
