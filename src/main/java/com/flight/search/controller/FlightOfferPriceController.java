package com.flight.search.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.amadeus.exceptions.ResponseException;
import com.amadeus.resources.FlightOfferSearch;
import com.amadeus.resources.FlightPrice;
import com.flight.search.amadeusconnection.AmadeusConnect;
import com.flight.search.model.FlightOfferPricingsResponseModel;

@RestController
public class FlightOfferPriceController {
	
	@PostMapping("/confirm")
	public FlightPrice confirm(@RequestBody(required = true) FlightOfferSearch search) throws ResponseException {
		return AmadeusConnect.INSTANCE.confirm(search);
	}

	
	@PostMapping("/confirms")
	public FlightOfferPricingsResponseModel location(@RequestBody(required = true) FlightOfferSearch search)
	throws ResponseException {
	RestTemplate restTemplate = new RestTemplate();
	FlightOfferPricingsResponseModel loc = restTemplate.postForObject("http://localhost:8080/confirm",search, FlightOfferPricingsResponseModel.class);
	System.out.println(loc);
	return loc;
	}
	}
	


