package tests.entities;

import static org.junit.Assert.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import entities.Complex;

public class ComplexTests {

	@Test
	public void toStringShouldReturnFormattedNegativeString() {

		Complex number1 = new Complex(3.0, -5.0);
		String result = "3.0 -5.0i";

		number1.toString();

		assertEquals(number1.toString(), result);

	}

	@Test
	public void toStringShouldReturnFormattedString() {

		Complex number1 = new Complex(3.0, 5.0);
		String result = "3.0 + 5.0i";

		number1.toString();

		assertEquals(number1.toString(), result);

	}

	@Test
	public void getIShouldReturnI() {

		Complex number = new Complex();

		String getI = number.getI();

		assertEquals(getI, "i");

	}

	@Test
	public void emptyComplexConstructorShouldCreateAnObject() {

		Complex number = new Complex();

		assertNotNull(number);
	}

	@Test
	public void setRealPartShouldSetNewValue() {

		Complex number = new Complex();
		double result = 4.0;

		number.setRealPart(4.0);

		assertEquals(number.getRealPart(), result);

	}

	@Test
	public void setImaginaryPartShouldSetNewValue() {

		Complex number = new Complex();
		double result = 4.0;

		number.setImaginaryPart(4.0);

		assertEquals(number.getImaginaryPart(), result);

	}

	@Test
	public void complexConstructorShouldCreateAnObject() {
		Complex number = new Complex(2.0, 4.0);

		assertNotNull(number);
	}

	@Test
	public void sumComplexShouldSumTwoComplexNumbers() {

		Complex number1 = new Complex(2.0, 4.0);
		Complex number2 = new Complex(3.0, 5.0);
		String result = "5.0 + 9.0i";

		String total = Complex.sum(number1, number2);

		assertEquals(total, result);

	}

	@Test
	public void subtractComplexShouldSumTwoComplexNumbers() {

		Complex number1 = new Complex(2.0, 4.0);
		Complex number2 = new Complex(3.0, 5.0);
		String result = "-1.0 -1.0i";

		String total = Complex.subtract(number1, number2);

		assertEquals(total, result);

	}

	@Test
	public void sumComplexShouldSumTwoComplexNumbersNegative() {

		Complex number1 = new Complex(2.0, 4.0);
		Complex number2 = new Complex(3.0, -5.0);
		String result = "5.0 -1.0i";

		String total = Complex.sum(number1, number2);

		assertEquals(total, result);

	}

	@Test
	public void subtractComplexShouldSumTwoComplexNumbersPositive() {

		Complex number1 = new Complex(5.0, 6.0);
		Complex number2 = new Complex(3.0, 5.0);
		String result = "2.0 + 1.0i";

		String total = Complex.subtract(number1, number2);

		assertEquals(total, result);

	}

}
