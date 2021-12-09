
package com.flight.search.controller;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import com.amadeus.exceptions.ResponseException;
import com.flight.search.model.LocationSearchResponseModel;
import com.flight.search.service.LocationSearchService;

@RestController
public class LocationSearchController {

	@GetMapping("/locations")
	public List<LocationSearchResponseModel> getLocation(@RequestParam(required = true) String keyword)
			throws ResponseException {
		return LocationSearchService.getLocations(keyword);
	}

}