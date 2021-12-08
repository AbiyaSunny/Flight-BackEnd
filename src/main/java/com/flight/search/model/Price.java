package com.flight.search.model;

public class Price {

	private String currency;

	public String getCurrency() {
		return currency;
	}

	public void setCurrency(String currency) {
		this.currency = currency;
	}

	@Override
	public String toString() {
		return "Price [currency=" + currency + "]";
	}
	
	
	
	
}
