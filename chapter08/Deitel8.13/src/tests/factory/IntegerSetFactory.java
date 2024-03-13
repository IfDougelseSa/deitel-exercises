package tests.factory;

import entities.IntegerSet;

public class IntegerSetFactory {

	public static IntegerSet createEmptyIntegerSet() {

		return new IntegerSet();

	}

	public static IntegerSet createFullIntegerSet() {

		boolean[] set = new boolean[101];

		for (int i = 0; i < 101; i++) {
			set[i] = true;

		}
		return new IntegerSet(set);
	}

	public static IntegerSet createPairIntegerSet() {

		boolean[] set = new boolean[101];

		for (int i = 0; i < 101; i++) {
			if (i % 2 == 0) {
				set[i] = true;
			}

		}

		return new IntegerSet(set);

	}

	public static IntegerSet createOddIntegerSet() {

		boolean[] set = new boolean[101];

		for (int i = 0; i < 101; i++) {
			if (i % 2 != 0) {
				set[i] = true;
			}

		}

		return new IntegerSet(set);

	}

	public static IntegerSet createMultipleThreeIntegerSet() {

		boolean[] set = new boolean[101];

		for (int i = 0; i < 101; i++) {
			if (i % 3 == 0) {
				set[i] = true;
			}

		}

		return new IntegerSet(set);

	}

	public static IntegerSet createMultipleFiveIntegerSet() {

		boolean[] set = new boolean[101];

		for (int i = 0; i < 101; i++) {
			if (i % 5 == 0) {
				set[i] = true;
			}

		}

		return new IntegerSet(set);

	}

}
