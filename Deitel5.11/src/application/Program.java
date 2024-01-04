package application;

import java.util.Scanner;

public class Program {

	public static void main(String[] args) {

		System.out.print("Enter the total of numbers to be read: ");

		Scanner sc = new Scanner(System.in);
		int i = sc.nextInt();
		int higherNumber = 0;
		int newNumber = 0;

		for (int count = 1; count <= i; count++) {

			System.out.println("Enter " + count + " number: ");
			newNumber = sc.nextInt();

			if (newNumber > higherNumber) {
				higherNumber = newNumber;
			}
		}

		System.out.println();
		System.out.println("High number is: " + higherNumber);

		sc.close();

	}

}
