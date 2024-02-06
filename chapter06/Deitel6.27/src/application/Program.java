package application;

import java.util.Scanner;

public class Program {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("MDC");
		System.out.println();

		System.out.print("Enter the high number: ");
		int a = sc.nextInt();

		System.out.print("Enter the other number: ");
		int b = sc.nextInt();

		System.out.println();
		System.out.println("MDC is: " + mdc(a, b));
		sc.close();

	}

	public static int mdc(int a, int b) {

		int rest;

		while (a != 0 && b != 0) {

			rest = a % b;

			a = b;
			b = rest;

		}

		return a;
	}

}
