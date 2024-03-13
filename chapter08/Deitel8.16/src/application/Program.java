package application;

import entities.HugeInteger;

public class Program {

	public static void main(String[] args) {

		HugeInteger num1 = new HugeInteger();
		HugeInteger num2 = new HugeInteger();

		num1.parse("1234");
		num2.parse("12345");

		HugeInteger.sum(num1, num2);

		System.out.printf(
				"Parse number 1: %s%nParse number 2: %s%nSum : %d%nSubtract: %d%nIs equal to: %b%nIs not equal to: %b%nIs greater than: %b%nIs less than: %b%nIs greater than or equal to: %b%nIs less than or equal to: %b%nIs zero: %b",
				num1, num2, HugeInteger.sum(num1, num2), HugeInteger.subtract(num1, num2),
				HugeInteger.isEqualTo(num1, num2), HugeInteger.isNotEqualTo(num1, num2),
				HugeInteger.isGreaterThan(num1, num2), HugeInteger.isLessThan(num1, num2),
				HugeInteger.isGreaterThanOrEqualTo(num1, num2), HugeInteger.isLessThanOrEqualTo(num1, num2),
				HugeInteger.isZero(num1));

	}

}
