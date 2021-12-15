package com.flight.search.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import com.amadeus.exceptions.ResponseException;
import com.amadeus.resources.Airline;
import com.amadeus.resources.Location;
import com.flight.search.amadeusconnection.AmadeusConnect;
import com.flight.search.model.LocationSearchResponseModel;


@Component
public class AirlineLookUpService {

	@Autowired
	AmadeusConnect ama;

	private Airline[] getAirlineNameFromAmadeus(String code) throws ResponseException {
		return ama.getAirlineName(code);
	}
	
	
	public List<String> getBusinessName(String code) throws ResponseException {
		Airline[] airline= getAirlineNameFromAmadeus(code);
		
		List<String> businessName=new ArrayList<String>();
	    for (Airline air : airline ) {
		businessName.add(air.getBusinessName());
		}
		return businessName;
	}
	
	
}
