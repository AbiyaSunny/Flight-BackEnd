
package com.flight.search.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.amadeus.exceptions.ResponseException;
import com.amadeus.resources.Location;
import com.flight.search.AmadeusConnect;
import com.flight.search.model.LocationSearchResponseModel;

@RestController
public class LocationSearchController {

	@GetMapping("/locations")
	public Location[] locations(@RequestParam(required = true) String keyword) throws ResponseException {
		return AmadeusConnect.INSTANCE.locations(keyword);
	}

	@GetMapping("/location")
	public LocationSearchResponseModel[] location(@RequestParam(required = true) String keyword)
			throws ResponseException {
		RestTemplate restTemplate = new RestTemplate();
		LocationSearchResponseModel[] locationSearchResponseModel = restTemplate.getForObject(
				"http://localhost:8080/locations?keyword=" + keyword, LocationSearchResponseModel[].class);
		return locationSearchResponseModel ;
	}

}