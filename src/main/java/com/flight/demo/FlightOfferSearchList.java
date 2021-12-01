package com.flight.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.amadeus.exceptions.ResponseException;
import com.amadeus.resources.FlightOfferSearch;



@RestController
@RequestMapping("/api")
public class FlightOfferSearchList {
	@GetMapping("/flights")
	public FlightOfferSearch[] flights(@RequestParam(required = true) String origin,
			@RequestParam(required = true) String destination, @RequestParam(required = true) String departDate,
			@RequestParam(required = true) String adults, @RequestParam(required = false) String returnDate, @RequestParam(required = true) String travelClass)
			throws ResponseException {
		return AmadeusConnect.INSTANCE.flights(origin, destination, departDate, adults, returnDate,travelClass);
	}

}



