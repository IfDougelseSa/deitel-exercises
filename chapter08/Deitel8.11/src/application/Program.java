package application;

import java.util.Locale;

import entities.Complex;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		
		Complex number1 = new Complex(2.0, 4.0);
		Complex number2 = new Complex(3.0, 5.0);
	
		
		System.out.println(Complex.sum(number1, number2));
		System.out.println(Complex.subtract(number1, number2));

	}

}
