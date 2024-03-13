package tests.entities;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.Test;

import entities.Rational;
import tests.factory.RationalFactory;

public class RationalTests {

	@Test
	public void emptyConstructorShouldCreateObject() {
		Rational emptyRational = RationalFactory.emptyRational();

		assertEquals(1, emptyRational.getDenominator());
	}

	@Test
	public void constructorShouldCreateObject() {
		Rational rational = RationalFactory.rational();

		assertEquals(1, rational.getDenominator());
	}

	@Test
	public void constructorShouldThrowExceptionWhenInvalidDenominator() {
		assertThrows(IllegalArgumentException.class, () -> {
			RationalFactory.invalidRational();
		});
	}

	@Test
	public void getNumeratorShouldReturnNumerator() {
		Rational rational = RationalFactory.rational();
		int result = 2;

		int numerator = rational.getNumerator();

		assertEquals(numerator, result);
	}

	@Test
	public void setNumeratorShouldSetNumerator() {
		Rational rational2 = RationalFactory.rational2();
		int result = 5;

		rational2.setNumerator(20);

		assertEquals(rational2.getNumerator(), result);
	}

	@Test
	public void getDenominatorShouldReturnDenominator() {
		Rational rational = RationalFactory.rational();
		int result = 1;

		int numerator = rational.getDenominator();

		assertEquals(numerator, result);
	}

	@Test
	public void setDenominatorShouldSetDenominator() {
		Rational rational2 = RationalFactory.rational2();
		int result = 4;

		rational2.setDenominator(20);

		assertEquals(rational2.getDenominator(), result);
	}

	@Test
	public void setDenominatorShouldThrowExceptionWhenZero() {
		assertThrows(IllegalArgumentException.class, () -> {
			Rational rational2 = RationalFactory.rational2();
			rational2.setDenominator(0);
		});
	}

	@Test
	public void calculateGDCShouldCalculateGdc() {
		int result = 5;

		int gdc = Rational.calculateGDC(5, 15);

		assertEquals(gdc, result);
	}

	@Test
	public void sumShouldReturnTotalWhenTwoRationalAdded() {
		Rational rational2 = RationalFactory.rational2();
		Rational rational3 = RationalFactory.rational3();
		String result = "7/4";

		String sum = Rational.sum(rational2, rational3);

		assertEquals(sum, result);
	}

	@Test
	public void sumShouldReturnTotalWhenTwoRationalAddedWithSameDenominator() {
		Rational rational1 = RationalFactory.rational2();
		Rational rational2 = RationalFactory.rational2();
		String result = "5/2";

		String sum = Rational.sum(rational1, rational2);

		assertEquals(sum, result);
	}

	@Test
	public void subtractShouldReturnTotalWhenTwoRationalSubracted() {
		Rational rational1 = RationalFactory.rational2();
		Rational rational2 = RationalFactory.rational3();
		String result = "3/4";

		String subtract = Rational.subtract(rational1, rational2);

		assertEquals(subtract, result);
	}

	@Test
	public void subtractShouldReturnTotalWhenTwoRationalSubractedWithSameDenominator() {
		Rational rational4 = RationalFactory.rational4();
		Rational rational3 = RationalFactory.rational3();
		String result = "3/2";

		String subtract = Rational.subtract(rational4, rational3);

		assertEquals(subtract, result);
	}

	@Test
	public void multipleShouldMultipleTwoRational() {
		Rational rational4 = RationalFactory.rational4();
		Rational rational3 = RationalFactory.rational3();
		String result = "1/1";

		String multiple = Rational.multiple(rational4, rational3);

		assertEquals(multiple, result);
	}

	@Test
	public void divedeShouldDivedeTwoRational() {
		Rational rational3 = RationalFactory.rational3();
		Rational rational4 = RationalFactory.rational4();
		String result = "1/4";

		String divede = Rational.divede(rational3, rational4);

		assertEquals(divede, result);
	}
	
	@Test
	public void toStringShouldReturnFormattedRational() {
		Rational rational3 = RationalFactory.rational3();

		String result = "1/2";

		assertEquals(rational3.toString(), result);
	}
	
	@Test
	public void toStringShouldReturnFloatRationalWithOnePrecision() {
		Rational rational3 = RationalFactory.rational3();

		String result = "0.5";
		System.out.println(rational3.toStringFloat(1));
		assertEquals(rational3.toStringFloat(1), result);
	}
	
	@Test
	public void toStringShouldReturnFloatRationalWithTwoPrecision() {
		Rational rational3 = RationalFactory.rational3();

		String result = "0.50";
		System.out.println(rational3.toStringFloat(2));
		assertEquals(rational3.toStringFloat(2), result);
	}

}
