package application;

import java.util.Scanner;

public class Program {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		System.out.print("Press any key to start: ");

		while (sc.hasNext()) {
			sc.next();
			System.out.print("Enter two number separeted by space: ");
			System.out.println(isMultiple(sc.nextInt(), sc.nextInt()));
			System.out.print("Press any key to continue or ctrl + d to quit: ");

		}

		sc.close();

	}

	private static boolean isMultiple(int number1, int number2) {

		if (number2 % number1 == 0) {
			return true;
		} else {
			return false;
		}

	}

}
