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
		int count = 0;

		while (play != 'n') {

			while (number != answer) {

				System.out.print("Enter a number: ");
				number = sc.nextInt();

				if (number - answer < 0) {
					System.out.println("Too low");
				} else if (number - answer > 0) {
					System.out.println("Too high");
				}
				
				count++;

			}

			System.out.println("Congratulations! You guessed the number.");
			if (count < 10) {
				System.out.println("Either you know the secret or you got lucky!");
			} else if (count == 10) {
				System.out.println("Aha! You know the secret!");
			} else {
				System.out.println("You should be able to do better!");
			}
			System.out.print("Do you wanna play again? Press n to quit or any key to continue: ");
			play = sc.next().charAt(0);
			answer = 1 + randomNumbers.nextInt(1000);
			count = 0;

		}

		sc.close();

	}

}
