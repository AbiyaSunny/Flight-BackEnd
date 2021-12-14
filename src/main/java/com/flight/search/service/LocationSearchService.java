package com.flight.search.service;

import java.util.ArrayList;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import com.amadeus.exceptions.ResponseException;
import com.amadeus.resources.Location;
import com.flight.search.amadeusconnection.AmadeusConnect;
import com.flight.search.model.LocationSearchResponseModel;

@Component
public class LocationSearchService {

	@Autowired
	AmadeusConnect ama;

	public Location[] getLocationsFromAmadeus(String keyword) throws ResponseException {
		return ama.locations(keyword);
	}

	public List<LocationSearchResponseModel> locationToLocationSearchResponseConverter(Location[] location) {

		List<LocationSearchResponseModel> locationResponseModelList = new ArrayList<LocationSearchResponseModel>();
		for (Location locationObject : location) {
			LocationSearchResponseModel locationSearchresponseModel = new LocationSearchResponseModel(
					locationObject.getName(), locationObject.getDetailedName(), locationObject.getIataCode(),
					locationObject.getAddress().getCityName(), locationObject.getAddress().getCountryName());
			locationResponseModelList.add(locationSearchresponseModel);
		}
		return locationResponseModelList;
	}

	public List<LocationSearchResponseModel> getLocations(String keyword) throws ResponseException {
		return locationToLocationSearchResponseConverter(getLocationsFromAmadeus(keyword));
	}

}
