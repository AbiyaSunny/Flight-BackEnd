package com.flight.search;


import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import java.nio.file.Paths;
import java.util.List;

import org.assertj.core.util.Arrays;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.flight.search.model.LocationSearchResponseModel;
import com.flight.search.service.LocationSearchService;



@SpringBootTest

public class LocationSearchServiceTest {
	
	@Test
	public void getLocationsTestPositive() throws Exception {
		List<LocationSearchResponseModel> locationsList = LocationSearchService.getLocations("COK");
		ObjectMapper mapper = new ObjectMapper();
		LocationSearchResponseModel[] map=mapper.readValue(Paths.get("C://Users/A-10105/Desktop/egencia-  training/actual.json").toFile(),
				 LocationSearchResponseModel[].class);
	assertThat(locationsList.toArray()).isEqualTo(map);	
}


@Test
public void getLocationsTestNegative() throws Exception {
	List<LocationSearchResponseModel> locationsList = LocationSearchService.getLocations("COK");
	ObjectMapper mapper = new ObjectMapper();
	LocationSearchResponseModel[] map=mapper.readValue(Paths.get("C://Users/A-10105/Desktop/egencia-  training/negativecase.json").toFile(),
			 LocationSearchResponseModel[].class);
assertThat(locationsList.toArray()).isEqualTo(map);	
}

}
