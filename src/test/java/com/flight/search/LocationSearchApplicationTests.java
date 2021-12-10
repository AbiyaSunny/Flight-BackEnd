package com.flight.search;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.flight.search.controller.LocationSearchController;

@SpringBootTest
class LocationSearchApplicationTests {

	@Autowired
	LocationSearchController controller;
	
	@Test
	void contextLoads() {
		assertThat(controller).isNotNull();
        
	}

}
