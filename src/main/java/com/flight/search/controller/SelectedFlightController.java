
package com.flight.search.controller;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import com.amadeus.exceptions.ResponseException;
import com.amadeus.resources.FlightOfferSearch;
import com.amadeus.resources.FlightPrice;
import com.flight.search.amadeusconnection.AmadeusConnect;
import com.flight.search.model.SelectedFlightResponseModel;
import com.flight.search.service.SelectedFlightService;

@RestController
public class SelectedFlightController {

	@CrossOrigin(origins = "http://localhost:3000")
	@PostMapping("/confirm")
	public SelectedFlightResponseModel confirm(@RequestBody(required = true) FlightOfferSearch search)
			throws ResponseException {

		return SelectedFlightService.getTravelers(search);
	}

}
