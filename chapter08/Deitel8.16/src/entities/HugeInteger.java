package entities;

import java.math.BigInteger;

public class HugeInteger {

	private int[] hugeInteger = new int[40];

	public HugeInteger() {

	}

	public HugeInteger(int[] hugeInteger) {
		this.hugeInteger = hugeInteger;
	}

	public int[] getHugeInteger() {
		return hugeInteger;
	}

	public void setHugeInteger(int[] hugeInteger) {
		this.hugeInteger = hugeInteger;
	}

	public void parse(String hugeInteger) {

		try {
			isValid(hugeInteger);
		} catch (Exception e) {
			System.out.println(e);
		}
		int[] aux = new int[40];
		for (int i = 0; i < hugeInteger.length(); i++) {
			aux[i] = hugeInteger.charAt(i) - '0';
		}

		setHugeInteger(aux);
	}

	public static void isValid(String hugeInteger) {

		try {
			Integer.valueOf(hugeInteger);
		} catch (Exception e) {
			throw new IllegalArgumentException("Exception: String should contain only numbers characters.");
		}
	}

	public static BigInteger sum(HugeInteger num1, HugeInteger num2) {
		int[] arrayNum1 = num1.getHugeInteger();
		int[] arrayNum2 = num2.getHugeInteger();

		String auxNum1 = "";
		String auxNum2 = "";

		for (int i = 0; i < num1.getHugeInteger().length; i++) {
			auxNum1 += arrayNum1[i];
		}

		for (int i = 0; i < num2.getHugeInteger().length; i++) {
			auxNum2 += arrayNum2[i];
		}

		BigInteger bigNum1 = new BigInteger(auxNum1);
		BigInteger bigNum2 = new BigInteger(auxNum2);

		BigInteger result = bigNum1.add(bigNum2);

		return result;
	}

	public static BigInteger subtract(HugeInteger num1, HugeInteger num2) {
		int[] arrayNum1 = num1.getHugeInteger();
		int[] arrayNum2 = num2.getHugeInteger();

		String auxNum1 = "";
		String auxNum2 = "";

		for (int i = 0; i < num1.getHugeInteger().length; i++) {
			auxNum1 += arrayNum1[i];
		}

		for (int i = 0; i < num2.getHugeInteger().length; i++) {
			auxNum2 += arrayNum2[i];
		}

		BigInteger bigNum1 = new BigInteger(auxNum1);
		BigInteger bigNum2 = new BigInteger(auxNum2);

		BigInteger result = bigNum1.subtract(bigNum2);

		return result;
	}

	public static boolean isEqualTo(HugeInteger num1, HugeInteger num2) {

		int[] arrayNum1 = num1.getHugeInteger();
		int[] arrayNum2 = num2.getHugeInteger();

		for (int i = 0; i < num1.getHugeInteger().length; i++) {
			if (arrayNum1[i] != arrayNum2[i])
				return false;
		}

		return true;
	}

	public static boolean isNotEqualTo(HugeInteger num1, HugeInteger num2) {

		int[] arrayNum1 = num1.getHugeInteger();
		int[] arrayNum2 = num2.getHugeInteger();

		for (int i = 0; i < num1.getHugeInteger().length; i++) {
			if (arrayNum1[i] != arrayNum2[i])
				return true;
		}

		return false;
	}

	public static boolean isGreaterThan(HugeInteger num1, HugeInteger num2) {
		int[] arrayNum1 = num1.getHugeInteger();
		int[] arrayNum2 = num2.getHugeInteger();

		String auxNum1 = "";
		String auxNum2 = "";

		for (int i = 0; i < num1.getHugeInteger().length; i++) {
			auxNum1 += arrayNum1[i];
		}

		for (int i = 0; i < num2.getHugeInteger().length; i++) {
			auxNum2 += arrayNum2[i];
		}

		BigInteger bigNum1 = new BigInteger(auxNum1);
		BigInteger bigNum2 = new BigInteger(auxNum2);

		int result = bigNum1.compareTo(bigNum2);

		if (result > 0) {
			return true;
		} else {
			return false;
		}

	}

	public static boolean isLessThan(HugeInteger num1, HugeInteger num2) {
		int[] arrayNum1 = num1.getHugeInteger();
		int[] arrayNum2 = num2.getHugeInteger();

		String auxNum1 = "";
		String auxNum2 = "";

		for (int i = 0; i < num1.getHugeInteger().length; i++) {
			auxNum1 += arrayNum1[i];
		}

		for (int i = 0; i < num2.getHugeInteger().length; i++) {
			auxNum2 += arrayNum2[i];
		}

		BigInteger bigNum1 = new BigInteger(auxNum1);
		BigInteger bigNum2 = new BigInteger(auxNum2);

		int result = bigNum1.compareTo(bigNum2);

		if (result > 0) {
			return false;
		} else {
			return true;
		}
	}

	public static boolean isGreaterThanOrEqualTo(HugeInteger num1, HugeInteger num2) {

		int[] arrayNum1 = num1.getHugeInteger();
		int[] arrayNum2 = num2.getHugeInteger();

		String auxNum1 = "";
		String auxNum2 = "";

		for (int i = 0; i < num1.getHugeInteger().length; i++) {
			auxNum1 += arrayNum1[i];
		}

		for (int i = 0; i < num2.getHugeInteger().length; i++) {
			auxNum2 += arrayNum2[i];
		}

		BigInteger bigNum1 = new BigInteger(auxNum1);
		BigInteger bigNum2 = new BigInteger(auxNum2);

		int result = bigNum1.compareTo(bigNum2);

		if (result > 0 || result == 0) {
			return true;
		} else {
			return false;
		}
	}

	public static boolean isLessThanOrEqualTo(HugeInteger num1, HugeInteger num2) {

		int[] arrayNum1 = num1.getHugeInteger();
		int[] arrayNum2 = num2.getHugeInteger();

		String auxNum1 = "";
		String auxNum2 = "";

		for (int i = 0; i < num1.getHugeInteger().length; i++) {
			auxNum1 += arrayNum1[i];
		}

		for (int i = 0; i < num2.getHugeInteger().length; i++) {
			auxNum2 += arrayNum2[i];
		}

		BigInteger bigNum1 = new BigInteger(auxNum1);
		BigInteger bigNum2 = new BigInteger(auxNum2);

		int result = bigNum1.compareTo(bigNum2);

		if (result > 0 || result == 0) {
			return false;
		} else {
			return true;
		}
	}

	public static boolean isZero(HugeInteger num1) {

		int[] aux = num1.getHugeInteger();
		for (int i = 0; i < num1.getHugeInteger().length; i++) {
			if (aux[i] != 0)
				return false;
		}
		return true;
	}

	@Override
	public String toString() {
		String aux = "";
		int[] array = getHugeInteger();
		for (int i = 0; i < getHugeInteger().length; i++) {
			aux += (array[i]);

		}

		return aux;
	}

}
