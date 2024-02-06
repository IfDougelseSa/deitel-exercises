package application;

import java.util.Scanner;

public class Program {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		double number = 0;

		for (int i = 1; i <= 5; i++) {
			System.out.println("Enter a number: ");

			number = sc.nextDouble();

			roundToInteger(number);

			System.out.println("Original number " + number);
			System.out.println("Rounded number " + roundToInteger(number));
			System.out.println("Rounded number tenthts " + roundToTenths(number));
			System.out.println("Rounded number Hundredths " + roundToHundredths(number));
			System.out.println("Rounded number Thousandths " + roundToThousandths(number));
		}

		sc.close();

	}

	public static double roundToInteger(double number) {

		return Math.floor(number + 0.5);
	}

	public static double roundToTenths(double number) {

		return Math.floor(number * 10 + 0.5) / 10;
	}

	public static double roundToHundredths(double number) {

		return Math.floor(number * 100 + 0.5) / 100;
	}

	public static double roundToThousandths(double number) {

		return Math.floor(number * 1000 + 0.5) / 1000;
	}

}
