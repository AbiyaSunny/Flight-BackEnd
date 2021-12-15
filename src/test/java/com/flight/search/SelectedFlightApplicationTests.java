package com.flight.search;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.flight.search.controller.SelectedFlightController;
import com.flight.search.service.SelectedFlightService;

@SpringBootTest
class SelectedFlightApplicationTests {

	@Autowired
	SelectedFlightController controller;



	@Test
	void contextLoads() {
		assertThat(controller).isNotNull();
	}

}
