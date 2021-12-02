
package com.flight.search;

import com.amadeus.Amadeus;
import com.amadeus.Params;
import com.amadeus.referenceData.Locations;
import com.amadeus.resources.FlightOfferSearch;
import com.amadeus.resources.FlightPrice;
import com.amadeus.resources.Location;
import com.amadeus.exceptions.ResponseException;
enum AmadeusConnect {
	INSTANCE;
    private Amadeus amadeus;
    private AmadeusConnect() {
        this.amadeus = Amadeus
            .builder("cL5aA7A71mbV8PwYKEREY2JFwGSP4ouK ", "t7KAGfvpu5x2TTm4")
            .build();
    }
    
    public Location[] locations(String key) throws ResponseException {
        return amadeus.referenceData.locations.get(Params
            .with("keyword", key)
            .and("subType", Locations.AIRPORT));
    }
} 