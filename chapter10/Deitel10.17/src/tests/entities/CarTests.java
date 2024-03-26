package tests.entities;

import static org.junit.Assert.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import entities.Car;

public class CarTests {

	@Test
	public void constructorShouldCreateObject() {
		Car car = new Car(20);

		assertNotNull(car);
	}

	@Test
	public void getLiterGasolineShouldReturnLiterGasoline() {
		Car car = new Car(20);
		double expected = 20.0;

		double result = car.getLiterGasoline();

		assertEquals(result, expected);
	}

	@Test
	public void setLiterGasolineShouldsetLiterGasoline() {
		Car car = new Car(20);
		double expected = 50.0;

		car.setLiterGasoline(50);
		double result = car.getLiterGasoline();

		assertEquals(result, expected);
	}

	@Test
	public void getCarbonFootprintShouldReturnCarCarbonFootprint() {
		Car car = new Car(20);
		double expected = 46.0;

		double result = car.getCarbonFootprint();

		assertEquals(result, expected);
	}

	@Test
	public void toStringShouldReturnFormattedMessageWithProducedCarCarbonFootprint() {
		Car car = new Car(20);

		String expected = "Your car produces 46,00 kg carbon footprint!";

		assertEquals(car.toString(), expected);
	}

}
