package application;

import entities.Rational;

public class Program {

	public static void main(String[] args) {

		Rational rational = new Rational();
		Rational rational2 = new Rational(1, 2);
		Rational rational3 = new Rational(5, 4);

		System.out.printf("Fraction form%nRational 1: %s%nRational 2: %s%nRational 3: %s%n%n", rational, rational2,
				rational3);

		System.out.printf("Float form with one precision%nRational 1: %s%nRational 2: %s%nRational 3: %s%n%n",
				rational.toStringFloat(1), rational2.toStringFloat(1), rational3.toStringFloat(1));

		System.out.printf("Float form with two precision%nRational 1: %s%nRational 2: %s%nRational 3: %s%n%n",
				rational.toStringFloat(2), rational2.toStringFloat(2), rational3.toStringFloat(2));

		System.out.printf("Sum Rational 2 + Rational 3: %s%n%n", Rational.sum(rational2, rational3));
		System.out.printf("Subtract Rational 3 - Rational 2: %s%n%n", Rational.subtract(rational3, rational2));
		System.out.printf("Multiple Rational 2 * Rational 3: %s%n%n", Rational.multiple(rational2, rational3));
		System.out.printf("Divide Rational 2 / Rational 3: %s%n%n", Rational.divede(rational2, rational3));

	}

}