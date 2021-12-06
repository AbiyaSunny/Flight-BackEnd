package com.flight.search.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown=true)
public class LocationSearchResponseModel {
	
	private String name;
	private String detailedName;
	private String iataCode;
	private Address address;
	
	public Address getAddress() {
		return address;
	}
	public void setAddress(Address address) {
		this.address = address;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDetailedName() {
		return detailedName;
	}
	public void setDetailedName(String detailedName) {
		this.detailedName = detailedName;
	}

	public String getIataCode() {
		return iataCode;
	}
	public void setIataCode(String iataCode) {
		this.iataCode = iataCode;
	}
	@Override
	public String toString() {
		return "[name=" + name + ", detailedName=" + detailedName + ", iataCode=" + iataCode + "," + address + "]";
	}

	
	
}
