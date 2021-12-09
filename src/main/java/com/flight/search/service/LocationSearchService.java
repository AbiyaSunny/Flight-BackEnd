package com.flight.search.service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import com.amadeus.exceptions.ResponseException;
import com.amadeus.resources.Location;
import com.flight.search.amadeusconnection.AmadeusConnect;
import com.flight.search.model.LocationSearchResponseModel;

public class LocationSearchService {

	private static Location[] getLocationsFromAmadeus(String keyword) throws ResponseException {
		return AmadeusConnect.INSTANCE.locations(keyword);
	}

	private static List<LocationSearchResponseModel> locationToLocationSearchResponseConverter(Location[] location) {
		List<LocationSearchResponseModel> locationResponseModel=new ArrayList<LocationSearchResponseModel>();
		
		
		LocationSearchResponseModel[] locationModel = new LocationSearchResponseModel[location.length];
		
		for (Location locationObject : location) {
			locationResponseModel.add(new LocationSearchResponseModel(locationObject.getName(),
					locationObject.getDetailedName(), locationObject.getIataCode(),
					locationObject.getAddress().getCityName(), locationObject.getAddress().getCountryName()));
		
		}
		return locationResponseModel;

		/*
		 * for (int i = 0; i < location.length; i++) { LocationSearchResponseModel obj =
		 * new LocationSearchResponseModel(); obj.setName(location[i].getName());
		 * obj.setDetailedName(location[i].getDetailedName());
		 * obj.setIataCode(location[i].getIataCode());
		 * obj.setCityname(location[i].getAddress().getCityName());
		 * obj.setCountryName(location[i].getAddress().getCountryName());
		 * locationModel[i] = obj; }
		 */
	}

	public static List<LocationSearchResponseModel>  getLocations(String keyword) throws ResponseException {
		return locationToLocationSearchResponseConverter(getLocationsFromAmadeus(keyword));
	}

}
