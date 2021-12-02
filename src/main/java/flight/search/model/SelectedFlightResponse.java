package flight.search.model;

public class SelectedFlightResponse {
	private int baggageWeight;
	private String weightUnit;
	private int baggageQuantity;
	private float basePrice;
	private float taxAndSurcharges;

	public SelectedFlightResponse(int baggageWeight, String weightUnit, int baggageQuantity, float basePrice,
			float taxAndSurcharges) {
		super();
		this.baggageWeight = baggageWeight;
		this.weightUnit = weightUnit;
		this.baggageQuantity = baggageQuantity;
		this.basePrice = basePrice;
		this.taxAndSurcharges = taxAndSurcharges;
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

	public float getBasePrice() {
		return basePrice;
	}

	public void setBasePrice(float basePrice) {
		this.basePrice = basePrice;
	}

	public float getTaxAndSurcharges() {
		return taxAndSurcharges;
	}

	public void setTaxAndSurcharges(float taxAndSurcharges) {
		this.taxAndSurcharges = taxAndSurcharges;
	}

}
