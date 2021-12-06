package com.flight.search.model;

public class Address {
	private String cityName;
	private String countryName;

	public String getCityName() {
		return cityName;
	}

	public void setCityName(String cityName) {
		this.cityName = cityName;
	}

	public String getCountryName() {
		return countryName;
	}

	public void setCountryName(String countryName) {
		this.countryName = countryName;
	}

	@Override
	public String toString() {
		return "Address [cityName=" + cityName + ", countryName=" + countryName + "]";
	}

}
