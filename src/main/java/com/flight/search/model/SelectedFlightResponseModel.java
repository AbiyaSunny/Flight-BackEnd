package com.flight.search.model;

import java.util.ArrayList;
import java.util.List;

public class SelectedFlightResponseModel {
	private List<Passenger> travelers = new ArrayList<Passenger>();
	private List<Segment> outBoundSegments = new ArrayList<Segment>();
	private List<Segment> inBoundSegments = new ArrayList<Segment>();

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

}
