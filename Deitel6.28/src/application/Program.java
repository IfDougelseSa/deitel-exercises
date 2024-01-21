package application;

import java.util.Scanner;

public class Program {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.print("Enter your average: ");

		System.out.println("Points: " + qualityPoints(sc.nextInt()));

		sc.close();

	}

	public static int qualityPoints(int average) {

		if (average >= 90) {
			return 4;
		} else if (average >= 80) {
			return 3;
		} else if (average >= 70) {
			return 2;
		} else if (average >= 60) {
			return 1;
		} else {
			return 0;
		}

	}

}
