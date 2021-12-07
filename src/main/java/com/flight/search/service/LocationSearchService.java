package com.flight.search.service;

import org.springframework.web.bind.annotation.RequestParam;

import com.amadeus.exceptions.ResponseException;
import com.amadeus.resources.Location;
import com.flight.search.amadeusconnection.AmadeusConnect;

public class LocationSearchService {
	
	
	public static Location[] getLocationsFromAmadeus(String keyword) throws ResponseException {
		return AmadeusConnect.INSTANCE.locations(keyword);
	}
}
