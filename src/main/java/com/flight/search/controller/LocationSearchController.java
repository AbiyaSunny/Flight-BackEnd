
package com.flight.search.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import com.amadeus.exceptions.ResponseException;
import com.flight.search.model.LocationSearchResponseModel;
import com.flight.search.service.LocationSearchService;

@CrossOrigin(origins = "http://localhost:3000")
@RestController
public class LocationSearchController {

	@Autowired
	LocationSearchService locationSearchService;

	@GetMapping("/locations/{keyword}")
	public List<LocationSearchResponseModel> getLocation(@PathVariable String keyword) throws ResponseException {
		return locationSearchService.getLocations(keyword);
	}

}