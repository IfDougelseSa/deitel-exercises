package application;

import java.util.Scanner;

public class Program {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.print("Enter a number to calculate your factorial: ");
		int number = sc.nextInt();

		System.out.print("Enter the numbers of e terms: ");
		int terms = sc.nextInt();

		System.out.print("Enter the numbers of e^x terms: ");
		int terms2 = sc.nextInt();

		System.out.print("Enter x value: ");
		int x = sc.nextInt();
		sc.close();

		System.out.println();
		System.out.println("Factorial is " + Factorial(number));
		System.out.println("e is " + e(terms));
		System.out.println("eˆx is " + ex(terms2, x));

	}

	public static int Factorial(int number) {
		int count = 1;
		if (number == 0) {
			return 1;
		} else {
			int total = number;

			while (count < total) {
				number *= (total - count);
				count++;
			}

			return number;

		}
	}

	public static double e(int terms) {
		int count = 1;
		int total = terms;
		double conta = 1;

		while (count <= total) {

			conta += (1.0 / Factorial(count));
			count++;
		}
		return conta;
	}

	public static double ex(int terms, int x) {
		int count = 1;
		int total = terms;
		double conta = 1;

		while (count <= total) {

			conta += (Math.pow(x, count) / Factorial(count));
			count++;
		}
		return conta;
	}

}
