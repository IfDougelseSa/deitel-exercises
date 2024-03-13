package entities;

import java.util.Locale;

public class Rational {

	private int numerator;
	private int denominator;

	public Rational() {

		this.denominator = 1;
	}

	public Rational(int numerator, int denominator) {

		if (denominator == 0) {
			throw new IllegalArgumentException("Denominator cannot be 0.");
		}

		int result = calculateGDC(numerator, denominator);
		this.numerator = numerator / result;
		this.denominator = denominator / result;
	}

	public int getNumerator() {
		return numerator;
	}

	public void setNumerator(int numerator) {
		int result = calculateGDC(numerator, denominator);
		this.numerator = numerator / result;
		this.denominator = denominator / result;
	}

	public int getDenominator() {
		return denominator;
	}

	public void setDenominator(int denominator) {
		if (denominator == 0) {
			throw new IllegalArgumentException("Denominator cannot be 0.");
		}
		int result = calculateGDC(numerator, denominator);
		this.numerator = numerator / result;
		this.denominator = denominator / result;
	}

	public static String sum(Rational number1, Rational number2) {
		int numerator;
		int denominator;
		int result;

		if (number1.getDenominator() == number2.getDenominator()) {
			numerator = number1.getNumerator() + number1.getNumerator();
			denominator = number1.getDenominator();
			result = calculateGDC(numerator, denominator);
			numerator /= result;
			denominator /= result;

			return String.format("%d/%d", numerator, denominator);
		} else {
			int mmc = calcularMMC(number1.getDenominator(), number2.getDenominator());
			int division1 = mmc / number1.getDenominator();
			int division2 = mmc / number2.getDenominator();
			int numeratorResult1 = number1.getNumerator() * division1;
			int numeratorResult2 = number2.getNumerator() * division2;
			numerator = numeratorResult1 + numeratorResult2;
			denominator = mmc;
			result = calculateGDC(numerator, denominator);

			return String.format("%d/%d", numerator, denominator);

		}

	}

	public static String subtract(Rational number1, Rational number2) {
		int numerator;
		int denominator;
		int result;

		if (number1.getDenominator() == number2.getDenominator()) {
			numerator = number1.getNumerator() - number1.getNumerator();
			denominator = number1.getDenominator();
			result = calculateGDC(numerator, denominator);
			numerator /= result;
			denominator /= result;

			return String.format("%d/%d", numerator, denominator);
		} else {
			int mmc = calcularMMC(number1.getDenominator(), number2.getDenominator());
			int division1 = mmc / number1.getDenominator();
			int division2 = mmc / number2.getDenominator();
			int numeratorResult1 = number1.getNumerator() * division1;
			int numeratorResult2 = number2.getNumerator() * division2;
			numerator = numeratorResult1 - numeratorResult2;
			denominator = mmc;
			result = calculateGDC(numerator, denominator);

			return String.format("%d/%d", numerator, denominator);

		}

	}

	public static String multiple(Rational number1, Rational number2) {
		int numerator = number1.getNumerator() * number2.getNumerator();
		int denominator = number1.getDenominator() * number2.getDenominator();
		int result = calculateGDC(numerator, denominator);
		numerator /= result;
		denominator /= result;

		return String.format("%d/%d", numerator, denominator);
	}

	public static String divede(Rational number1, Rational number2) {
		int numerator = number1.getNumerator() * number2.getDenominator();
		int denominator = number1.getDenominator() * number2.getNumerator();
		int result = calculateGDC(numerator, denominator);
		numerator /= result;
		denominator /= result;

		return String.format("%d/%d", numerator, denominator);
	}

	public static int calculateGDC(int numerator, int denominator) {

		int aux;
		while (denominator != 0) {

			aux = denominator;
			denominator = numerator % denominator;
			numerator = aux;

		}

		return numerator;
	}

	public static int calcularMMC(int num1, int num2) {
		int mmc = 1;
		int maior = Math.max(num1, num2);

		for (int i = 1; i <= maior; i++) {
			if (num1 % i == 0 && num2 % i == 0) {
				mmc *= i;
				num1 /= i;
				num2 /= i;
			}
		}

		if (num1 > 1)
			mmc *= num1;
		if (num2 > 1)
			mmc *= num2;

		return mmc;
	}

	@Override
	public String toString() {
		return String.format("%d/%d", getNumerator(), getDenominator());
	}

	public String toStringFloat(int precision) {
		Locale.setDefault(Locale.US);
		double result = (double) getNumerator() / getDenominator();

		switch (precision) {
		case 1:
			return String.format("%.1f", result);
		case 2:
			return String.format("%.2f", result);
		case 3:
			return String.format("%.3f", result);
		default:
			return String.format("%.4f", result);
		}

	}

}
