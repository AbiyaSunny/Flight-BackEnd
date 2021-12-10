package com.flight.search;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.assertj.core.api.Assert;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;

import com.amadeus.exceptions.ResponseException;
import com.amadeus.resources.Location;
import com.flight.search.model.LocationSearchResponseModel;
import com.flight.search.service.LocationSearchService;

@SpringBootTest

public class LocationSearchServiceTest {

	
	
	
	
	
	
	@Test
	public void getLocationFromAmadeusTest() throws ResponseException {
		Location act[] = LocationSearchService.getLocationsFromAmadeus("COK");
		assertTrue(act.length!=0);
		}

	
	@Test
	public void locationToLocationSearchResponseConverterTest() throws Exception {
		Location actual[] = LocationSearchService.getLocationsFromAmadeus("COK");
		List<LocationSearchResponseModel> objList = LocationSearchService
				.locationToLocationSearchResponseConverter(actual);
		System.out.println(objList.isEmpty());
		assertFalse(objList.isEmpty());
	}

	
	@Test
	public void getLocationsTest() throws Exception {
		List<LocationSearchResponseModel> locationsList = LocationSearchService.getLocations("LON");
		assertFalse(locationsList.isEmpty());
	}

}
