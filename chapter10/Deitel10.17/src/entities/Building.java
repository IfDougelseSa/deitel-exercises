package entities;

import entities.interfaces.CarbonFootprint;

public class Building implements CarbonFootprint {

	private double energyEmission;
	private int constructionMaterials;
	private double transportMaterials;

	// Fictitious values
	private final static double CARBON_PER_ENERGY_EMISSION = 1.0;
	private final static double CARBON_PER_CONSTRUCTION_MATERIAL = 3.0;
	private final static double CARBON_PER_TRANSPORT_MATERIAL = 4.0;

	public Building(double energyEmission, int constructionMaterials, double transportMaterials) {
		this.energyEmission = energyEmission;
		this.constructionMaterials = constructionMaterials;
		this.transportMaterials = transportMaterials;
	}

	public double getEnergyEmission() {
		return energyEmission;
	}

	public void setEnergyEmission(double energyEmission) {
		this.energyEmission = energyEmission;
	}

	public int getConstructionMaterials() {
		return constructionMaterials;
	}

	public void setConstructionMaterials(int constructionMaterials) {
		this.constructionMaterials = constructionMaterials;
	}

	public double getTransportMaterials() {
		return transportMaterials;
	}

	public void setTransportMaterials(double transportMaterials) {
		this.transportMaterials = transportMaterials;
	}

	@Override
	public double getCarbonFootprint() {
		// fictitious values
		return CARBON_PER_ENERGY_EMISSION * getEnergyEmission()
				+ CARBON_PER_CONSTRUCTION_MATERIAL * getConstructionMaterials()
				+ CARBON_PER_TRANSPORT_MATERIAL * getTransportMaterials();
	}

	@Override
	public String toString() {
		return String.format("%s%.2f%s", "Your building produces ", getCarbonFootprint(), " kg carbon footprint!");
	}

}
