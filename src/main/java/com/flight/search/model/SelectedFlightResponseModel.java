
package com.flight.search.model;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class SelectedFlightResponseModel {
	private List<Passenger> travelers = new ArrayList<Passenger>();
	private List<Segment> outBoundSegments = new ArrayList<Segment>();
	private List<Segment> inBoundSegments = new ArrayList<Segment>();
	
	public SelectedFlightResponseModel() {
		super();
	}
	

	public List<Passenger> getTravelers() {
		return travelers;
	}

	public void setTravelers(List<Passenger> travelers) {
		this.travelers = travelers;
	}

	public List<Segment> getOutBoundSegments() {
		return outBoundSegments;
	}

	public void setOutBoundSegments(List<Segment> outBoundSegments) {
		this.outBoundSegments = outBoundSegments;
	}

	public List<Segment> getInBoundSegments() {
		return inBoundSegments;
	}

	public void setInBoundSegments(List<Segment> inBoundSegments) {
		this.inBoundSegments = inBoundSegments;
	}

	
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		SelectedFlightResponseModel other = (SelectedFlightResponseModel) obj;
		return Objects.equals(inBoundSegments, other.inBoundSegments)
				&& Objects.equals(outBoundSegments, other.outBoundSegments)
				&& Objects.equals(travelers, other.travelers);
	}

	@Override
	public String toString() {
		return "SelectedFlightResponseModel [travelers=" + travelers + ", outBoundSegments=" + outBoundSegments
				+ ", inBoundSegments=" + inBoundSegments + "]";
	}
	
	
	
	
	
	
	
	
	
	

}
