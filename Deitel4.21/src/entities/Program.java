package entities;

import java.util.Scanner;

public class Program {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int count = 1;
		int number = 0;
		int largest = 0;

		while (count <= 10) {
			System.out.print("Enter " + count + " number: ");
			number = sc.nextInt();

			if (number > largest) {
				largest = number;
			}

			count++;
		}

		sc.close();

		System.out.println("The largest number is: " + largest);

	}

}
