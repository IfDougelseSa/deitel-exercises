package application;

import java.util.Scanner;

public class Program {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter two numbers separated with space");

		System.out.println(integerPower(sc.nextInt(), sc.nextInt()));
		System.out.println();
		sc.close();

	}

	private static int integerPower(int base, int exponent) {
		int count = 1;
		int number = 1;
		while (count <= exponent) {
			number *= base;
			count++;
		}
		return number;
	}

}
