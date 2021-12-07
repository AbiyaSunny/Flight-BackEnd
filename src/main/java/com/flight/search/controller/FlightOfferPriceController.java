package com.flight.search.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import com.amadeus.exceptions.ResponseException;
import com.amadeus.resources.FlightOfferSearch;
import com.amadeus.resources.FlightPrice;
import com.flight.search.amadeusconnection.AmadeusConnect;

@RestController
public class FlightOfferPriceController {
	@PostMapping("/confirm")
	public FlightPrice confirm(@RequestBody(required = true) FlightOfferSearch search) throws ResponseException {
		return AmadeusConnect.INSTANCE.confirm(search);
	}

}
