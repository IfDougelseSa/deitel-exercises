package application;

import java.util.Scanner;

public class Program {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.print("Press any key to continue: ");

		while (sc.hasNext()) {
			sc.next();
			System.out.print("Enter a number: ");
			squareOfAsterisks(sc.nextInt());
			System.out.println();
			System.out.print("Press any key to continue or press ctrl + d to quit: ");
		}

		sc.close();

	}

	public static void squareOfAsterisks(int side) {
		System.out.println();
		for (int i = 1; i <= side; i++) {
			for (int j = 1; j <= side; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

}
