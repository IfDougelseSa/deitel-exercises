package application;

import java.util.Scanner;

public class Program {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Convert fahrenheit to celsius type a. Covert celsius to fahrenheit type b.");
		char scale = sc.next().charAt(0);

		if (scale == 'a') {
			System.out.print("Enter the temperature: ");
			System.out.println("Temperatue convert: " + celsius(sc.nextDouble()));

		} else if (scale == 'b') {
			System.out.print("Enter the temperature: ");
			System.out.println("Temperatue convert: " + fahrenheit(sc.nextDouble()));
		} else {
			System.out.println("Invalid keyword");
		}

		sc.close();

	}

	public static double celsius(double fahrenheit) {

		return 5.0 / 9.0 * (fahrenheit - 32);
	}

	public static double fahrenheit(double celsius) {

		return 9.0 / 5.0 * celsius + 32;
	}

}
