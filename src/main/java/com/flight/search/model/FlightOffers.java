package com.flight.search.model;




public class FlightOffers {

private String source;
private Price price;
public Price getPrice() {
	return price;
}

public void setPrice(Price price) {
	this.price = price;
}

public String getSource() {
	return source;
}

public void setSource(String source) {
	this.source = source;
}

@Override
public String toString() {
	return "FlightOffers [source=" + source + ", price=" + price + "]";
}


}