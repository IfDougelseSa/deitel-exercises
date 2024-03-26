package tests.entities;

import static org.junit.Assert.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import entities.Building;
import entities.Car;

public class BuildingTests {

	@Test
	public void constructorShouldCreateBuildingObject() {
		Building building = new Building(20, 40, 50);

		assertNotNull(building);
	}

	@Test
	public void getEnergyEmissionShouldReturnEnergyEmission() {
		Building building = new Building(20, 40, 50);
		double expected = 20;

		double result = building.getEnergyEmission();

		assertEquals(expected, result);
	}

	@Test
	public void getConstructionMaterialsShouldReturnConstructionMaterials() {
		Building building = new Building(20, 40, 50);
		double expected = 40;

		double result = building.getConstructionMaterials();

		assertEquals(expected, result);
	}

	@Test
	public void getTransportMaterialsShouldReturnTransportMaterials() {
		Building building = new Building(20, 40, 50);
		double expected = 50;

		double result = building.getTransportMaterials();

		assertEquals(expected, result);
	}

	@Test
	public void setEnergyEmissionShouldSetNewEnergyEmissionValue() {
		Building building = new Building(20, 40, 50);
		double expected = 30;

		building.setEnergyEmission(30);
		double result = building.getEnergyEmission();

		assertEquals(expected, result);
	}

	@Test
	public void setConstructionMaterialsShouldSetNewConstructionMaterialsValue() {
		Building building = new Building(20, 40, 50);
		double expected = 60;

		building.setConstructionMaterials(60);
		double result = building.getConstructionMaterials();

		assertEquals(expected, result);
	}

	@Test
	public void setTransportMaterialsShouldSetNewTransportMaterialsValue() {
		Building building = new Building(20, 40, 50);
		double expected = 90;

		building.setTransportMaterials(90);
		double result = building.getTransportMaterials();

		assertEquals(expected, result);
	}

	@Test
	public void getCarbonFootprintShouldReturnTotalCarbonFootprint() {
		Building building = new Building(20, 40, 50);
		double expected = 340;

		double result = building.getCarbonFootprint();

		assertEquals(expected, result);
	}

	@Test
	public void toStringShouldReturnFormattedMessageWithProducedCarCarbonFootprint() {
		Building building = new Building(20, 40, 50);

		String expected = "Your building produces 340,00 kg carbon footprint!";

		assertEquals(building.toString(), expected);
	}

}
