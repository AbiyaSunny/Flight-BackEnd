package com.flight.test;


import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.web.servlet.MockMvc;

@SpringBootTest
@AutoConfigureMockMvc

public class WebApplicationTest {
	@Autowired
    private MockMvc mockMvc;

    @Test
    public void shouldReturnSuccess() throws Exception {
        this.mockMvc.perform(get(
                "/api/flights?origin=COK&destination=LON&departDate=2022-01-25&adults=3&returnDate=2022-01-27&travelClass=ECONOMY"))
                .andDo(print()).andExpect(status().isOk());
    }

    @Test
    public void shouldReturnNotFound() throws Exception {
        this.mockMvc.perform(get(
                "/api/"))
                .andDo(print()).andExpect(status().isNotFound());
    }
}


