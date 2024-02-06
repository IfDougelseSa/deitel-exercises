package application;

import java.security.SecureRandom;
import java.util.Scanner;

public class Program {

	private static final SecureRandom randomNumbers = new SecureRandom();

	public static void main(String[] args) {

		int answer = 1 + randomNumbers.nextInt(1000);
		Scanner sc = new Scanner(System.in);
		int number = 0;
		char play = 'y';

		while (play != 'n') {

			while (number != answer) {

				System.out.print("Enter a number: ");
				number = sc.nextInt();

				if (number - answer < 0) {
					System.out.println("Too low");
				} else if (number - answer > 0) {
					System.out.println("Too high");
				}

			}

			System.out.println("Congratulations! You guessed the number.");
			System.out.print("Do you wanna play again? Press n to quit or any key to continue: ");
			play = sc.next().charAt(0);
			answer = 1 + randomNumbers.nextInt(1000);

		}

		sc.close();

	}

}
