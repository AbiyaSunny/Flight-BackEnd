package com.flight.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;

import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.bind.annotation.RestController;

import com.amadeus.exceptions.ResponseException;
import com.amadeus.resources.FlightOfferSearch;
import com.flight.model.FlightOfferRequestModel;
import com.flight.service.FlightOfferService;

@RestController
@RequestMapping("api")
public class FlightOfferSearchController {

	// get application.properties values
	@Value("${secrets.clientId}")
	public String clientID;

	@Value("${secrets.clientSecret}")
	public String clientSecret;

	// initializing logger
	private static final Logger LOGGER = LoggerFactory.getLogger(FlightOfferSearchController.class);

	// Handler function for getting the list of flights
	@GetMapping("/flights")
	public FlightOfferSearch[] getFlights(FlightOfferRequestModel inpData) throws ResponseException {

		// setting secret credentials into the model class
		inpData.setClientId(clientID);
		inpData.setClientSecret(clientSecret);

		LOGGER.info("Url Inputs {}, {}, {}, {}, {}, and {}", inpData.getAdults(), inpData.getOrigin(),
				inpData.getDepartDate(), inpData.getDestination(), inpData.getReturnDate(), inpData.getTravelClass());

		// calling service layer method
		return FlightOfferService.getDataFromAmadeus(inpData);
	}
}
