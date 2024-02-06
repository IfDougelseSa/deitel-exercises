package application;

import java.util.Scanner;

public class Program {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		for (int i = 1; i <= 3; i++) {

			System.out.println(hypotenuse(sc.nextDouble(), sc.nextDouble()));
		}

		sc.close();

	}

	private static double hypotenuse(double side1, double side2) {

		return Math.sqrt(Math.pow(side1, 2) + Math.pow(side2, 2));
	}

}
