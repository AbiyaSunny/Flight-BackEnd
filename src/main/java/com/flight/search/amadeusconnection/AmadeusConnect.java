
package com.flight.search.amadeusconnection;



import org.springframework.stereotype.Component;
import com.amadeus.Amadeus;
import com.amadeus.Params;
import com.amadeus.referenceData.Locations;
import com.amadeus.resources.Location;
import com.amadeus.exceptions.ResponseException;

@Component
public class AmadeusConnect {

	Amadeus amadeus = Amadeus.builder(System.getenv()).build();

	public Location[] locations(String key) throws ResponseException {
		return amadeus.referenceData.locations.get(Params.with("keyword", key).and("subType", Locations.AIRPORT));
	}
}
