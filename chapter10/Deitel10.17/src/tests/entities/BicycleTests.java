package tests.entities;

import static org.junit.Assert.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import entities.Bicycle;

public class BicycleTests {

	@Test
	public void emptyConstructorShouldCreateEmptyObject() {
		Bicycle bicycle = new Bicycle();

		assertNotNull(bicycle);
	}

	@Test
	public void toStringShouldReturnFormattedStringBasedOnCarbonFootprint() {
		Bicycle bicycle = new Bicycle();
		String result = "Your bicycle produces 0,00 kg carbon footprint!";

		assertEquals(result, bicycle.toString());
	}

	@Test
	public void getCarbonFootprintShouldReturnTotalCarbonFootprintProducesByBicycle() {
		Bicycle bicycle = new Bicycle();
		double expected = 0.00;

		double result = bicycle.getCarbonFootprint();

		assertEquals(result, expected);
	}

}
