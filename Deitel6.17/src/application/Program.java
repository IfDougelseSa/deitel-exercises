package application;

import java.util.Scanner;

public class Program {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.print("Press any key to start: ");

		while (sc.hasNext()) {
			sc.next();
			System.out.print("Enter a number to know if its even (true) or odd (false): ");
			System.out.println(isEven(sc.nextInt()));
			System.out.print("Enter any key to continue or type ctrl + d to quit: ");
		}

		sc.close();

	}

	private static boolean isEven(int number) {
		if (number % 2 == 0) {
			return true;
		} else {
			return false;
		}
	}

}
