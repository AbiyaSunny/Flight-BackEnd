
package com.flight.search.model;

import java.util.Objects;

public class Segment {

	private Airport departure = new Airport();
	private Airport arrival = new Airport();
	private String carrierCode;
	private String number;
	private String duration;
	private int weight;
	private String weightUnit;

	public Airport getArrival() {
		return arrival;
	}

	public void setArrival(Airport arrival) {
		this.arrival = arrival;
	}

	public Airport getDeparture() {
		return departure;
	}

	public void setDeparture(Airport departure) {
		this.departure = departure;
	}

	public String getCarrierCode() {
		return carrierCode;
	}

	public void setCarrierCode(String carrierCode) {
		this.carrierCode = carrierCode;
	}

	public String getNumber() {
		return number;
	}

	public void setNumber(String number) {
		this.number = number;
	}

	public String getDuration() {
		return duration;
	}

	public void setDuration(String duration) {
		this.duration = duration;
	}

	public int getWeight() {
		return weight;
	}

	public void setWeight(int weight) {
		this.weight = weight;
	}

	public String getWeightUnit() {
		return weightUnit;
	}

	public void setWeightUnit(String weightUnit) {
		this.weightUnit = weightUnit;
	}

	@Override
	public String toString() {
		return "Segment [departure=" + departure + ", arrival=" + arrival + ", carrierCode=" + carrierCode + ", number="
				+ number + ", duration=" + duration + ", weight=" + weight + ", weightUnit=" + weightUnit + "]";
	}



	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Segment other = (Segment) obj;
		return Objects.equals(arrival, other.arrival) && Objects.equals(carrierCode, other.carrierCode)
				&& Objects.equals(departure, other.departure) && Objects.equals(duration, other.duration)
				&& Objects.equals(number, other.number) && weight == other.weight
				&& Objects.equals(weightUnit, other.weightUnit);
	}
	
	

}
