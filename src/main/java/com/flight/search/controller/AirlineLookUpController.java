package com.flight.search.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import com.amadeus.exceptions.ResponseException;
import com.flight.search.service.AirlineLookUpService;

@CrossOrigin(origins = "http://localhost:3000")
@RestController
public class AirlineLookUpController {

	@Autowired
	AirlineLookUpService airlineLookUpService;

	@GetMapping("/airline/{code}")
	public List<String> getLocation(@PathVariable String code) throws ResponseException {
		return airlineLookUpService.getBusinessName(code);
	}

}