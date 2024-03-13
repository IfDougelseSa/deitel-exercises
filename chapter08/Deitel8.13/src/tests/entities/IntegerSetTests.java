package tests.entities;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import entities.IntegerSet;
import tests.factory.IntegerSetFactory;

public class IntegerSetTests {

	private String result;

	@BeforeEach
	void setUp() throws Exception {

		result = "0 1 2 3 4 5 6 7 8 9 10 11 12 13 14 15 16 17 18 19 20 "
				+ "21 22 23 24 25 26 27 28 29 30 31 32 33 34 35 36 37 38 39 40 "
				+ "41 42 43 44 45 46 47 48 49 50 51 52 53 54 55 56 57 58 59 60 "
				+ "61 62 63 64 65 66 67 68 69 70 71 72 73 74 75 76 77 78 79 80 "
				+ "81 82 83 84 85 86 87 88 89 90 91 92 93 94 95 96 97 98 99 100";
	}

	@Test
	public void unionShouldCreateASet() {
		IntegerSet pairSet = IntegerSetFactory.createPairIntegerSet();
		IntegerSet oddSet = IntegerSetFactory.createOddIntegerSet();

		String union = IntegerSet.union(pairSet, oddSet);

		assertEquals(union, result);
	}

	@Test
	public void intersecionShouldCreateASet() {

		IntegerSet multipleThreeSet = IntegerSetFactory.createMultipleThreeIntegerSet();
		IntegerSet multipleFiveSet = IntegerSetFactory.createMultipleFiveIntegerSet();
		String result = "0 15 30 45 60 75 90";

		String intersection = IntegerSet.intersection(multipleThreeSet, multipleFiveSet);

		assertEquals(intersection, result);
	}

	@Test
	public void insertElementShouldInsertAnElement() {

		IntegerSet emptySet = IntegerSetFactory.createEmptyIntegerSet();
		boolean[] array = emptySet.getArrayInteger();

		emptySet.insertElement(4);

		assertTrue(array[4]);
	}

	@Test
	public void deleteElementShouldDeleteElement() {

		IntegerSet emptySet = IntegerSetFactory.createFullIntegerSet();
		boolean[] array = emptySet.getArrayInteger();

		emptySet.deleteElement(4);

		assertFalse(array[4]);
	}

	@Test
	public void toStringShouldReturnSetWhenElementIsPresent() {
		IntegerSet emptySet = IntegerSetFactory.createFullIntegerSet();

		String toString = emptySet.toString();

		assertEquals(toString, result);
	}

	@Test
	public void toStringShouldReturnEmptySetWhenElementeIsNotPresent() {
		IntegerSet emptySet = IntegerSetFactory.createEmptyIntegerSet();
		String result = "---";

		String toString = emptySet.toString();

		assertEquals(toString, result);
	}

	@Test
	public void isEqualToShouldCompareTwoSets() {
		IntegerSet multipleFiveSet = IntegerSetFactory.createMultipleFiveIntegerSet();
		IntegerSet multipleFiveSet2 = IntegerSetFactory.createMultipleFiveIntegerSet();
		
		boolean result = IntegerSet.isEqualTo(multipleFiveSet, multipleFiveSet2);
		
		assertTrue(result);
		
	}

}
