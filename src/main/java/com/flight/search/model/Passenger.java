
package com.flight.search.model;

import java.util.Objects;

public class Passenger {
	private String id;
	private String travelerType;
	private Double basePrice;
	private Double total;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getTravelerType() {
		return travelerType;
	}

	public void setTravelerType(String travelerType) {
		this.travelerType = travelerType;
	}

	public Double getBasePrice() {
		return basePrice;
	}

	public void setBasePrice(Double basePrice) {
		this.basePrice = basePrice;
	}

	public Double getTotal() {
		return total;
	}

	public void setTotal(Double total) {
		this.total = total;
	}

	@Override
	public String toString() {
		return "Passenger [id=" + id + ", travelerType=" + travelerType + ", basePrice=" + basePrice + ", total="
				+ total + "]";
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Passenger other = (Passenger) obj;
		return Objects.equals(basePrice, other.basePrice) && Objects.equals(id, other.id)
				&& Objects.equals(total, other.total) && Objects.equals(travelerType, other.travelerType);
	}

}
