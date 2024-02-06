package application;

import java.util.Scanner;

public class Program {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.print("Enter first int: ");
		int a = sc.nextInt();
		System.out.print("Enter second int: ");
		int b = sc.nextInt();

		System.out.println("Whole part:  " + integerResult(a, b));
		System.out.println("Rest part: " + restResult(a, b));
		System.out.println("Display digits: " + displayDigits(4562));
		sc.close();

	}

	@SuppressWarnings("null")
	public static int integerResult(int a, int b) {

		if (b == 0) {
			System.out.println("Divider cannot be 0");
			return (Integer) null;
		} else {
			return a / b;
		}
	}

	@SuppressWarnings("null")
	public static int restResult(int a, int b) {

		if (b == 0) {
			System.out.println("Divider cannot be 0");
			return (Integer) null;
		} else {
			return a % b;
		}

	}

	public static String displayDigits(int a) {

		int guardNumber;
		String test = "";
		while (a != 0) {

			guardNumber = a % 10;
			a /= 10;
			test += " " + guardNumber;

		}

		return new StringBuilder(test).reverse().toString();

	}
}
