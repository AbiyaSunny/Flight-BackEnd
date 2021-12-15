package com.flight.search;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.flight.search.controller.FlightOfferSearchController;

@SpringBootTest
class FlightOfferSearchApplicationTests {

	@Autowired
	private FlightOfferSearchController controller;

	@Test
	void contextLoads() throws Exception {
		assertThat(controller).isNotNull();
	}


}