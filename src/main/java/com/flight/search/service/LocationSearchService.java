package com.flight.search.service;

import java.util.ArrayList;
import java.util.List;

import com.amadeus.exceptions.ResponseException;
import com.amadeus.resources.Location;
import com.flight.search.amadeusconnection.AmadeusConnect;
import com.flight.search.model.LocationSearchResponseModel;

public class LocationSearchService {

	public static Location[] getLocationsFromAmadeus(String keyword) throws ResponseException {
		return AmadeusConnect.INSTANCE.locations(keyword);
	}

	public static List<LocationSearchResponseModel> locationToLocationSearchResponseConverter(Location[] location) {

		List<LocationSearchResponseModel> locationResponseModelList = new ArrayList<LocationSearchResponseModel>();
		for (Location locationObject : location) {
			LocationSearchResponseModel locationSearchresponseModel= new LocationSearchResponseModel(locationObject.getName(),
					locationObject.getDetailedName(), locationObject.getIataCode(),
					locationObject.getAddress().getCityName(), locationObject.getAddress().getCountryName());
			locationResponseModelList.add(locationSearchresponseModel);
		}
		return locationResponseModelList;
	}

	public static List<LocationSearchResponseModel> getLocations(String keyword) throws ResponseException {
		return locationToLocationSearchResponseConverter(getLocationsFromAmadeus(keyword));
	}

}
