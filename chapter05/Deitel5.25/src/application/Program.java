package application;

import java.util.Scanner;

public class Program {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int number = 0;

		while (number <= 0 || number > 19 || number % 2 == 0) {
			System.out.print("Enter losang lines (1 to 19 odd): ");
			number = sc.nextInt();
		}

		for (int i = 1; i < number; i += 2) {
			for (int k = number; k >= i; k -= 2) {
				System.out.print(" ");
			}
			for (int j = 1; j <= i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}

		for (int i = 1; i <= number; i += 2) {
			for (int k = 1; k <= i; k += 2) {
				System.out.print(" ");
			}
			for (int j = number; j >= i; j--) {
				System.out.print("*");
			}
			System.out.println();
		}

		sc.close();

	}

}
