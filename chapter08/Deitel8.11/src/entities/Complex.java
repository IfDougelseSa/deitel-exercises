package entities;

import java.util.Locale;

public class Complex {

	private final String I = "i";

	private double realPart;
	private double imaginaryPart;

	public Complex() {

	}

	public Complex(double realPart, double imaginaryPart) {
		this.realPart = realPart;
		this.imaginaryPart = imaginaryPart;
	}

	public double getRealPart() {
		return realPart;
	}

	public void setRealPart(double realPart) {
		this.realPart = realPart;
	}

	public double getImaginaryPart() {
		return imaginaryPart;
	}

	public void setImaginaryPart(double imaginaryPart) {
		this.imaginaryPart = imaginaryPart;
	}

	public String getI() {
		return I;
	}

	public String toString() {
		Locale.setDefault(Locale.US);
		return String.format("%.1f%s%s", realPart, imaginaryPart < 0 ? " " + imaginaryPart : " + " + imaginaryPart, I);
	}

	public static String sum(Complex num1, Complex num2) {
		Locale.setDefault(Locale.US);
		double resultRealPart = num1.getRealPart() + num2.getRealPart();
		double resultImaginaryPart = num1.getImaginaryPart() + num2.getImaginaryPart();

		return String.format("%.1f%si", resultRealPart,
				resultImaginaryPart < 0 ? " " + resultImaginaryPart : " + " + resultImaginaryPart);
	}

	public static String subtract(Complex num1, Complex num2) {
		Locale.setDefault(Locale.US);
		double resultRealPart = num1.getRealPart() - num2.getRealPart();
		double resultImaginaryPart = num1.getImaginaryPart() - num2.getImaginaryPart();

		return String.format("%.1f%si", resultRealPart,
				resultImaginaryPart < 0 ? " " + resultImaginaryPart : " + " + resultImaginaryPart);
	}

}
