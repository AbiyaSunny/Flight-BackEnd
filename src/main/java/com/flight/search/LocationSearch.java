


package com.flight.search;


import org.springframework.web.bind.annotation.GetMapping;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import org.springframework.web.bind.annotation.RestController;

import com.amadeus.exceptions.ResponseException;
import com.amadeus.resources.Location;



@RestController
@RequestMapping("/api")
public class LocationSearch {

 
	@GetMapping("/")
	public String home() {
		return "Hello World!";
	}

    @GetMapping("/locations")
    public Location [] locations(@RequestParam(required=true) String keyword) throws ResponseException {
        return AmadeusConnect.INSTANCE.locations(keyword);
    }
}