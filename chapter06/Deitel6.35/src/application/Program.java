package application;

import java.security.SecureRandom;
import java.util.Scanner;

public class Program {

	private static final SecureRandom randomNumbers = new SecureRandom();

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int attempt = -50;

		for (int i = 1; i <= 3; i++) {

			int a = randomNumbers.nextInt(11);
			int b = randomNumbers.nextInt(11);
			int answer = a * b;

			while (attempt != answer) {

				System.out.print(question(a, b));
				attempt = sc.nextInt();


				if (attempt != answer) {
					System.out.println("No. Please, try again.");
					System.out.println();
				} else {
					System.out.println("Well done.");
					System.out.println();
				}
			}
			attempt = -50;

		}
		sc.close();

	}

	public static String question(int a, int b) {

		return "How much is " + a + " multiple " + b + "? ";
	}

}
