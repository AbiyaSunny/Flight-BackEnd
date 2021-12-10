package com.flight.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;

import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.bind.annotation.RestController;

import com.amadeus.exceptions.ResponseException;
import com.amadeus.resources.FlightOfferSearch;
import com.flight.model.FlightOfferRequestModel;
import com.flight.service.FlightOfferService;

@CrossOrigin(origins = { "*" }, allowedHeaders = "*")
@RestController
@RequestMapping("api")
public class FlightOfferSearchController {

	@Value("${secrets.clientId}")
	public String clientID;

	@Value("${secrets.clientSecret}")
	public String clientSecret;

	private static final Logger LOGGER = LoggerFactory.getLogger(FlightOfferSearchController.class);

	@GetMapping("/flights")
	public FlightOfferSearch[] getFlights(FlightOfferRequestModel inpData) throws ResponseException {

		inpData.setClientId(clientID);
		inpData.setClientSecret(clientSecret);

		LOGGER.info("Url Inputs {}, {}, {}, {}, {}, and {}", inpData.getAdults(), inpData.getOrigin(),
				inpData.getDepartDate(), inpData.getDestination(), inpData.getReturnDate(), inpData.getTravelClass());

		return FlightOfferService.getDataFromAmadeus(inpData);
	}
}
