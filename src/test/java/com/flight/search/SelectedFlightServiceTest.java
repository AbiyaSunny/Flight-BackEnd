package com.flight.search;

import static org.assertj.core.api.Assertions.assertThat;
import java.nio.file.Files;
import java.nio.file.Paths;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.amadeus.resources.FlightOfferSearch;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.flight.search.model.SelectedFlightResponseModel;
import com.flight.search.service.SelectedFlightService;
import com.google.gson.Gson;


@SpringBootTest
public class SelectedFlightServiceTest {
	
	@Autowired
	SelectedFlightService selectedFlightService;

	@Test
	public void getTravelersTestPositive() throws Exception {

		String json = Files.readString(Paths.get("C://Users/A-10105/Desktop/egencia-  training/thirdrequest.txt"));
		Gson gson = new Gson();
		FlightOfferSearch offer = gson.fromJson(json, FlightOfferSearch.class);

		SelectedFlightResponseModel flight = selectedFlightService.getTravelers(offer);
		ObjectMapper mapper = new ObjectMapper();
		SelectedFlightResponseModel map = mapper.readValue(
				Paths.get("C://Users/A-10105/Desktop/egencia-  training/thirdactual.json").toFile(),
				SelectedFlightResponseModel.class);
		System.out.println(flight);
		System.out.println(map);
		assertThat(flight).isEqualTo(map);

	}

	@Test
	public void getTravelersTestNegative() throws Exception {
		String json = Files.readString(Paths.get("C://Users/A-10105/Desktop/egencia-  training/thirdrequest.txt"));
		Gson gson = new Gson();
		FlightOfferSearch offer = gson.fromJson(json, FlightOfferSearch.class);

		SelectedFlightResponseModel flight = selectedFlightService.getTravelers(offer);
		ObjectMapper mapper = new ObjectMapper();
		SelectedFlightResponseModel map = mapper.readValue(
				Paths.get("C://Users/A-10105/Desktop/egencia-  training/thirdnegative.json").toFile(),
				SelectedFlightResponseModel.class);
		assertThat(flight).isNotEqualTo(map);

	}

}
