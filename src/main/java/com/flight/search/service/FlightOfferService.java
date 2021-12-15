package com.flight.search.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.amadeus.exceptions.ResponseException;
import com.amadeus.resources.FlightOfferSearch;
import com.flight.search.amadeusconnection.AmadeusConnect;
import com.flight.search.model.FlightOfferRequestModel;

@Component
public class FlightOfferService {


	@Autowired
	AmadeusConnect ama;
	
	public  FlightOfferSearch[] getDataFromAmadeus(FlightOfferRequestModel request) throws ResponseException {
		
		FlightOfferSearch[] flights = ama.flights(request.getOriginLocationCode(),
				request.getDestinationLocationCode(), request.getDepartureDate(), request.getAdults(), request.getReturnDate(),
				request.getTravelClass());
		return flights;
	}
}