package com.flight.search.service;

import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.client.RestTemplate;
import com.amadeus.exceptions.ResponseException;
import com.amadeus.resources.Location;
import com.flight.search.amadeusconnection.AmadeusConnect;
import com.flight.search.model.LocationSearchResponseModel;

public class LocationSearchService {

	public static Location[] getLocationsFromAmadeus(String keyword) throws ResponseException {
		return AmadeusConnect.INSTANCE.locations(keyword);
	}

	

	public static LocationSearchResponseModel[] getLocations(@RequestParam(required = true) String keyword)
			throws ResponseException {
		RestTemplate restTemplate = new RestTemplate();
		LocationSearchResponseModel[] locationSearchResponseModel = restTemplate.getForObject(
				"http://localhost:8080/locations?keyword=" + keyword, LocationSearchResponseModel[].class);
		return locationSearchResponseModel ;
	}
	
	

}
