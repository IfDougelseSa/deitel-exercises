package entities;

import entities.interfaces.CarbonFootprint;

public class Car implements CarbonFootprint {

	private double literGasoline;
	private static final double CARBON_PER_LITER = 2.3;

	public Car(double literGasoline) {
		this.literGasoline = literGasoline;
	}

	public double getLiterGasoline() {
		return literGasoline;
	}

	public void setLiterGasoline(double literGasoline) {
		this.literGasoline = literGasoline;
	}

	@Override
	public double getCarbonFootprint() {
		return CARBON_PER_LITER * getLiterGasoline();
	}

	@Override
	public String toString() {
		return String.format("%s%.2f%s", "Your car produces ", getCarbonFootprint(), " kg carbon footprint!");
	}

}
