package com.flight.search;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import org.springframework.web.bind.annotation.RestController;

import com.amadeus.exceptions.ResponseException;
import com.amadeus.resources.FlightOfferSearch;
import com.amadeus.resources.FlightPrice;
import com.amadeus.resources.Location;



@RestController
@RequestMapping("/api")
public class FlightOfferPrice {
   
@PostMapping("/confirm")
public FlightPrice confirm(@RequestBody(required=true) FlightOfferSearch search) throws ResponseException {
    return AmadeusConnect.INSTANCE.confirm(search);
}
    

    
    
    

}

