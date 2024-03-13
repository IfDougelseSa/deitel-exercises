package tests.factory;

import entities.HugeInteger;

public class HugeIntegerFactory {

	public static HugeInteger emptyHugeInteger() {
		return new HugeInteger();
	}

	public static HugeInteger hugeInteger() {
		int[] array = { 1, 2, 3, 4, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0,
				0, 0, 0, 0, 0, 0, 0, 0 };

		return new HugeInteger(array);
	}
	
	public static HugeInteger hugeInteger2() {
		int[] array = { 1, 2, 3, 4, 5, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0,
				0, 0, 0, 0, 0, 0, 0, 0 };

		return new HugeInteger(array);
	}

}
