package com.flight.model;

public class FlightOfferSearchResponse {
	private int id;
	private String originIataCode;
	private String destinationIataCode;
	private String departureDate;
	private String returnDate;
	private int adults;
	private String travelClass;
	private String departureTime;
	private String arrivalTime;
	private String carrierName;
	private String duration;
	private float basePrice;
	private int numberOfStops;
	private int baggageWeight;
	private String weightUnit;
	private int baggageQuantity;

	public FlightOfferSearchResponse(int id, String originIataCode, String destinationIataCode, String departureDate,
			String returnDate, int adults, String travelClass, String departureTime, String arrivalTime,
			String carrierName, String duration, float basePrice, int numberOfStops, int baggageWeight,
			String weightUnit, int baggageQuantity) {
		super();
		this.id = id;
		this.originIataCode = originIataCode;
		this.destinationIataCode = destinationIataCode;
		this.departureDate = departureDate;
		this.returnDate = returnDate;
		this.adults = adults;
		this.travelClass = travelClass;
		this.departureTime = departureTime;
		this.arrivalTime = arrivalTime;
		this.carrierName = carrierName;
		this.duration = duration;
		this.basePrice = basePrice;
		this.numberOfStops = numberOfStops;
		this.baggageWeight = baggageWeight;
		this.weightUnit = weightUnit;
		this.baggageQuantity = baggageQuantity;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getOriginIataCode() {
		return originIataCode;
	}

	public void setOriginIataCode(String originIataCode) {
		this.originIataCode = originIataCode;
	}

	public String getDestinationIataCode() {
		return destinationIataCode;
	}

	public void setDestinationIataCode(String destinationIataCode) {
		this.destinationIataCode = destinationIataCode;
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

	public String getDepartureTime() {
		return departureTime;
	}

	public void setDepartureTime(String departureTime) {
		this.departureTime = departureTime;
	}

	public String getArrivalTime() {
		return arrivalTime;
	}

	public void setArrivalTime(String arrivalTime) {
		this.arrivalTime = arrivalTime;
	}

	public String getCarrierName() {
		return carrierName;
	}

	public void setCarrierName(String carrierName) {
		this.carrierName = carrierName;
	}

	public String getDuration() {
		return duration;
	}

	public void setDuration(String duration) {
		this.duration = duration;
	}

	public float getBasePrice() {
		return basePrice;
	}

	public void setBasePrice(float basePrice) {
		this.basePrice = basePrice;
	}

	public int getNumberOfStops() {
		return numberOfStops;
	}

	public void setNumberOfStops(int numberOfStops) {
		this.numberOfStops = numberOfStops;
	}

	public int getBaggageWeight() {
		return baggageWeight;
	}

	public void setBaggageWeight(int baggageWeight) {
		this.baggageWeight = baggageWeight;
	}

	public String getWeightUnit() {
		return weightUnit;
	}

	public void setWeightUnit(String weightUnit) {
		this.weightUnit = weightUnit;
	}

	public int getBaggageQuantity() {
		return baggageQuantity;
	}

	public void setBaggageQuantity(int baggageQuantity) {
		this.baggageQuantity = baggageQuantity;
	}

}
