package com.flight.model;

public class FlightOfferSearchRequest {
	private String originLocationCode;
	private String destinationLocationCode;
	private String departureDate;
	private String returnDate;
	private int adults;
	private String travelClass;

	public FlightOfferSearchRequest(String originLocationCode, String destinationLocationCode, String departureDate,
			String returnDate, int adults, String travelClass) {
		super();
		this.originLocationCode = originLocationCode;
		this.destinationLocationCode = destinationLocationCode;
		this.departureDate = departureDate;
		this.returnDate = returnDate;
		this.adults = adults;
		this.travelClass = travelClass;
	}

	public String getOriginLocationCode() {
		return originLocationCode;
	}

	public void setOriginLocationCode(String originLocationCode) {
		this.originLocationCode = originLocationCode;
	}

	public String getDestinationLocationCode() {
		return destinationLocationCode;
	}

	public void setDestinationLocationCode(String destinationLocationCode) {
		this.destinationLocationCode = destinationLocationCode;
	}

	public String getDepartureDate() {
		return departureDate;
	}

	public void setDepartureDate(String departureDate) {
		this.departureDate = departureDate;
	}

	public String getReturnDate() {
		return returnDate;
	}

	public void setReturnDate(String returnDate) {
		this.returnDate = returnDate;
	}

	public int getAdults() {
		return adults;
	}

	public void setAdults(int adults) {
		this.adults = adults;
	}

	public String getTravelClass() {
		return travelClass;
	}

	public void setTravelClass(String travelClass) {
		this.travelClass = travelClass;
	}

	@Override
	public String toString() {
		return "FlightOfferSearchRequest [originLocationCode=" + originLocationCode + ", destinationLocationCode="
				+ destinationLocationCode + ", departureDate=" + departureDate + ", returnDate=" + returnDate
				+ ", adults=" + adults + ", travelClass=" + travelClass + "]";
	}

}
