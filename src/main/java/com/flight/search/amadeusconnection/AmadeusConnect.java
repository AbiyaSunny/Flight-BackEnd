
package com.flight.search.amadeusconnection;



import org.springframework.http.RequestEntity;
import org.springframework.web.client.RestTemplate;

import com.amadeus.Amadeus;
import com.amadeus.Params;
import com.amadeus.referenceData.Locations;
import com.amadeus.resources.FlightOfferSearch;
import com.amadeus.resources.FlightPrice;
import com.amadeus.resources.Location;
import com.flight.search.model.LocationSearchResponseModel;
import com.amadeus.exceptions.ResponseException;

public enum AmadeusConnect {
	INSTANCE;

	private Amadeus amadeus;

	private AmadeusConnect() {
		this.amadeus = Amadeus.builder("cL5aA7A71mbV8PwYKEREY2JFwGSP4ouK", "t7KAGfvpu5x2TTm4").build();
	
	}
	
	public Location[] locations(String key) throws ResponseException {
		return amadeus.referenceData.locations.get(Params.with("keyword", key).and("subType", Locations.AIRPORT));

	}

	public FlightOfferSearch[] flights(String clientId, String clientSecret, String origin, String destination,
			String departDate, int adults, String returnDate, String travelClass) throws ResponseException {

		this.amadeus = Amadeus.builder(clientId, clientSecret).build();

		if (returnDate == null) {
			return amadeus.shopping.flightOffersSearch.get(Params.with("originLocationCode", origin)
					.and("destinationLocationCode", destination).and("departureDate", departDate).and("adults", adults)
					.and("max", 3).and("currencyCode", "INR").and("travelClass", travelClass));
		} else {
			return amadeus.shopping.flightOffersSearch
					.get(Params.with("originLocationCode", origin).and("destinationLocationCode", destination)
							.and("departureDate", departDate).and("returnDate", returnDate).and("adults", adults)
							.and("max", 3).and("travelClass", travelClass).and("currencyCode", "INR"));
		}
	}

	public FlightPrice confirm(FlightOfferSearch offer) throws ResponseException {
		return amadeus.shopping.flightOffersSearch.pricing.post(offer);
	}

}
