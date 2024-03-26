package entities;

import entities.interfaces.CarbonFootprint;

public class Bicycle implements CarbonFootprint {

	@Override
	public double getCarbonFootprint() {
		return 0;
	}

	@Override
	public String toString() {
		return String.format("%s%.2f%s", "Your bicycle produces ", getCarbonFootprint(), " kg carbon footprint!");
	}

}
