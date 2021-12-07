
package com.flight.search.controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import com.amadeus.exceptions.ResponseException;
import com.amadeus.resources.Location;

import com.flight.search.service.LocationSearchService;

@RestController
public class LocationSearchController {

	
	@GetMapping("/locations")
	public Location[] getLocations(@RequestParam(required = true) String keyword) throws ResponseException {
		return LocationSearchService.getLocationsFromAmadeus(keyword);			
	}

	
}