
package com.flight.search;

import org.junit.jupiter.api.Test;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;
import java.nio.file.Files;
import java.nio.file.Paths;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;

@SpringBootTest
@AutoConfigureMockMvc

public class SelectedFlightControllerTest {
	@Autowired
	private MockMvc mockMvc;

	@Test
	public void shouldReturnSuccess() throws Exception {

		String json = Files.readString(Paths.get("C://Users/A-10105/Desktop/egencia-  training/thirdrequest.txt"));
		this.mockMvc.perform(
				post("/confirm").contentType(MediaType.APPLICATION_JSON).content(json).characterEncoding("utf-8"))
				.andExpect(status().isOk());
	}

	@Test
	public void shouldReturnNotFound() throws Exception {
		String json = Files.readString(Paths.get("C://Users/A-10105/Desktop/egencia-  training/thirdrequest.txt"));
		this.mockMvc
				.perform(post("/conf").contentType(MediaType.APPLICATION_JSON).content(json).characterEncoding("utf-8"))
				.andExpect(status().isNotFound());
	}
}
