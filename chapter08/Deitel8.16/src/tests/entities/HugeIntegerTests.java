package tests.entities;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.math.BigInteger;

import org.junit.jupiter.api.Test;

import entities.HugeInteger;
import tests.factory.HugeIntegerFactory;

public class HugeIntegerTests {

	@Test
	public void emptyConstructorShouldInstantiateObject() {
		HugeInteger emptyHugeInteger = HugeIntegerFactory.emptyHugeInteger();

		assertNotNull(emptyHugeInteger);
	}

	@Test
	public void constructorShouldInstantiateObject() {
		HugeInteger hugeInteger = HugeIntegerFactory.hugeInteger();

		assertNotNull(hugeInteger);
	}

	@Test
	public void getHugeIntegerShouldGetArray() {
		HugeInteger hugeInteger = HugeIntegerFactory.hugeInteger();
		int[] result = { 1, 2, 3, 4, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0,
				0, 0, 0, 0, 0, 0, 0, 0 };

		assertArrayEquals(result, hugeInteger.getHugeInteger());
	}

	@Test
	public void setHugeIntegerShouldSetArray() {
		HugeInteger hugeInteger = HugeIntegerFactory.hugeInteger();
		int[] array = { 1, 2, 3, 4, 5, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0,
				0, 0, 0, 0, 0, 0, 0, 0 };

		hugeInteger.setHugeInteger(array);

		assertArrayEquals(array, hugeInteger.getHugeInteger());
	}

	@Test
	public void parseShouldCaptureExceptionWhenInvalidString() {
		HugeInteger emptyHugeInteger = HugeIntegerFactory.emptyHugeInteger();

		try {
			emptyHugeInteger.parse("1234s");
		} catch (Exception e) {

			assertTrue(e instanceof IllegalArgumentException);
			assertEquals(
					"java.lang.IllegalArgumentException: Exception: String should contain only numbers characters.",
					e.toString());
		}
	}

	@Test
	public void parseShouldReceiveStringAndConvertToArray() {
		HugeInteger emptyHugeInteger = HugeIntegerFactory.emptyHugeInteger();
		int[] result = { 1, 2, 3, 4, 5, 6, 7, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0,
				0, 0, 0, 0, 0, 0, 0, 0 };

		emptyHugeInteger.parse("1234567");

		assertArrayEquals(result, emptyHugeInteger.getHugeInteger());
	}

	@Test
	public void isValidShouldThrowExceptionWhenInvalidString() {

		assertThrows(IllegalArgumentException.class, () -> {
			HugeInteger.isValid("1234s");
		});
	}

	@Test
	public void toStringShouldReturnFormattedString() {
		HugeInteger hugeInteger = HugeIntegerFactory.hugeInteger();
		String result = "1234000000000000000000000000000000000000";

		assertEquals(result, hugeInteger.toString());
	}

	@Test
	public void addShouldSumTwoHugeIntegers() {
		HugeInteger hugeInteger = HugeIntegerFactory.hugeInteger();
		HugeInteger hugeInteger2 = HugeIntegerFactory.hugeInteger();
		BigInteger result = new BigInteger("2468000000000000000000000000000000000000");

		BigInteger sum = HugeInteger.sum(hugeInteger, hugeInteger2);

		assertEquals(result, sum);
	}

	@Test
	public void subtractShouldSubractTwoHugeIntegers() {
		HugeInteger hugeInteger = HugeIntegerFactory.hugeInteger();
		HugeInteger hugeInteger2 = HugeIntegerFactory.hugeInteger();
		BigInteger result = new BigInteger("0000000000000000000000000000000000000000");

		BigInteger subtract = HugeInteger.subtract(hugeInteger, hugeInteger2);

		assertEquals(result, subtract);
	}

	@Test
	public void isEqualToShouldCompareTwoHugeIntegersAndReturnTrue() {

		HugeInteger hugeInteger = HugeIntegerFactory.hugeInteger();
		HugeInteger hugeInteger2 = HugeIntegerFactory.hugeInteger();

		boolean result = HugeInteger.isEqualTo(hugeInteger, hugeInteger2);

		assertEquals(true, result);
	}

	@Test
	public void isEqualToShouldCompareTwoHugeIntegersAndReturnFalse() {

		HugeInteger hugeInteger = HugeIntegerFactory.hugeInteger();
		HugeInteger emptyHugeInteger = HugeIntegerFactory.emptyHugeInteger();

		boolean result = HugeInteger.isEqualTo(hugeInteger, emptyHugeInteger);

		assertEquals(false, result);
	}

	@Test
	public void isNotEqualToShouldCompareTwoHugeIntegersAndReturnFalse() {

		HugeInteger hugeInteger = HugeIntegerFactory.hugeInteger();
		HugeInteger hugeInteger2 = HugeIntegerFactory.hugeInteger();

		boolean result = HugeInteger.isNotEqualTo(hugeInteger, hugeInteger2);

		assertEquals(false, result);
	}

	@Test
	public void isNotEqualToShouldCompareTwoHugeIntegersAndReturnTrue() {

		HugeInteger hugeInteger = HugeIntegerFactory.hugeInteger();
		HugeInteger emptyHugeInteger = HugeIntegerFactory.emptyHugeInteger();

		boolean result = HugeInteger.isNotEqualTo(hugeInteger, emptyHugeInteger);

		assertEquals(true, result);
	}

	@Test
	public void isGreaterThenShouldCompareTwoHugeIntegersAndReturnTrue() {

		HugeInteger hugeInteger = HugeIntegerFactory.hugeInteger();
		HugeInteger hugeInteger2 = HugeIntegerFactory.hugeInteger2();

		boolean result = HugeInteger.isGreaterThan(hugeInteger2, hugeInteger);

		assertEquals(true, result);
	}

	@Test
	public void isGreaterThenShouldCompareTwoHugeIntegersAndReturnFalse() {

		HugeInteger hugeInteger = HugeIntegerFactory.hugeInteger();
		HugeInteger hugeInteger2 = HugeIntegerFactory.hugeInteger2();

		boolean result = HugeInteger.isGreaterThan(hugeInteger, hugeInteger2);

		assertEquals(false, result);
	}

	@Test
	public void isLessThenShouldCompareTwoHugeIntegersAndReturnTrue() {

		HugeInteger hugeInteger = HugeIntegerFactory.hugeInteger();
		HugeInteger hugeInteger2 = HugeIntegerFactory.hugeInteger2();

		boolean result = HugeInteger.isLessThan(hugeInteger, hugeInteger2);

		assertEquals(true, result);
	}

	@Test
	public void isLessThenShouldCompareTwoHugeIntegersAndReturnFalse() {

		HugeInteger hugeInteger = HugeIntegerFactory.hugeInteger();
		HugeInteger hugeInteger2 = HugeIntegerFactory.hugeInteger2();

		boolean result = HugeInteger.isLessThan(hugeInteger2, hugeInteger);

		assertEquals(false, result);
	}

	@Test
	public void isGreaterThanOrEqualToShouldCompareTwoHugeIntegersAndReturnTrue() {

		HugeInteger hugeInteger = HugeIntegerFactory.hugeInteger();
		HugeInteger hugeInteger2 = HugeIntegerFactory.hugeInteger2();

		boolean result = HugeInteger.isGreaterThanOrEqualTo(hugeInteger2, hugeInteger);

		assertEquals(true, result);
	}

	@Test
	public void isGreaterThanOrEqualToShouldCompareTwoHugeIntegersAndReturnFalse() {

		HugeInteger hugeInteger = HugeIntegerFactory.hugeInteger();
		HugeInteger hugeInteger2 = HugeIntegerFactory.hugeInteger2();

		boolean result = HugeInteger.isGreaterThanOrEqualTo(hugeInteger, hugeInteger2);

		assertEquals(false, result);
	}

	@Test
	public void isLessThanOrEqualToShouldCompareTwoHugeIntegersAndReturnFalse() {

		HugeInteger hugeInteger = HugeIntegerFactory.hugeInteger();
		HugeInteger hugeInteger2 = HugeIntegerFactory.hugeInteger2();

		boolean result = HugeInteger.isLessThanOrEqualTo(hugeInteger2, hugeInteger);

		assertEquals(false, result);
	}

	@Test
	public void isLessThanOrEqualTonShouldCompareTwoHugeIntegersAndReturnTrue() {

		HugeInteger hugeInteger = HugeIntegerFactory.hugeInteger();
		HugeInteger hugeInteger2 = HugeIntegerFactory.hugeInteger2();

		boolean result = HugeInteger.isLessThanOrEqualTo(hugeInteger, hugeInteger2);

		assertEquals(true, result);
	}

	@Test
	public void isZeroShouldReturnTrueWhenHugeIntegerIsZero() {
		HugeInteger emptyHugeInteger = HugeIntegerFactory.emptyHugeInteger();

		boolean result = HugeInteger.isZero(emptyHugeInteger);

		assertEquals(true, result);
	}

	@Test
	public void isZeroShouldReturnFalseWhenHugeIntegerIsNotZero() {

		HugeInteger hugeInteger = HugeIntegerFactory.hugeInteger();

		boolean result = HugeInteger.isZero(hugeInteger);

		assertEquals(false, result);
	}

}
