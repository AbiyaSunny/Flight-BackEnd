package com.flight.search;

import org.junit.jupiter.api.Test;


import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.web.servlet.MockMvc;

@SpringBootTest
@AutoConfigureMockMvc



public class LocationSearchControllerTest {
	@Autowired
    private MockMvc mockMvc;

    @Test
    public void shouldReturnSuccess() throws Exception {
        this.mockMvc.perform(get("/locations?keyword=LON"))
                .andDo(print()).andExpect(status().isOk());
    }
	
	
    @Test
    public void shouldReturnNotFound() throws Exception {
        this.mockMvc.perform(get(
                "/api/"))
                .andDo(print()).andExpect(status().isNotFound());
    }
}
	
	
	
	
	
