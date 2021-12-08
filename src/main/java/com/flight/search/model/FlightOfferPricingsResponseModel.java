package com.flight.search.model;

import java.util.Arrays;


import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class FlightOfferPricingsResponseModel {
	

	private String type;
	private FlightOffers[] flightOffers;
	
	public FlightOffers[] getFlightOffers() {
		return flightOffers;
	}

	public void setFlightOffers(FlightOffers[] flightOffers) {
		this.flightOffers = flightOffers;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	@Override
	public String toString() {
		return "FlightOfferPricingsResponseModel [type=" + type + ", flightOffers=" + Arrays.toString(flightOffers)
				+ "]";
	}

	
	
	
}