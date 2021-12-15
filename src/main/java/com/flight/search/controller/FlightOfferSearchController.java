package com.flight.search.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import com.amadeus.exceptions.ResponseException;
import com.amadeus.resources.FlightOfferSearch;
import com.flight.search.model.FlightOfferRequestModel;
import com.flight.search.service.FlightOfferService;

@CrossOrigin(origins = { "*" }, allowedHeaders = "*")
@RestController
public class FlightOfferSearchController {

	@Autowired
	FlightOfferService flightOfferService;

	@PostMapping("/flights")
	public FlightOfferSearch[] getFlights(@RequestBody FlightOfferRequestModel inpData) throws ResponseException {
		return flightOfferService.getDataFromAmadeus(inpData);
	}
}