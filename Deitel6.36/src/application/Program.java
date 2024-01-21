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
					System.out.println(wrongMessage());
					System.out.println();
				} else {
					System.out.println(rightMessage());
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

	public static String rightMessage() {

		int number = 1 + randomNumbers.nextInt(4);
		String result = "";

		switch (number) {
		case 1:
			result = "Well done.";
			break;

		case 2:
			result = "Excelent";
			break;

		case 3:
			result = "Excelent";
			break;

		case 4:
			result = "Excelent";
			break;

		}
		return result;
	}

	public static String wrongMessage() {

		int number = 1 + randomNumbers.nextInt(4);
		String result = "";

		switch (number) {
		case 1:
			result = "No. Please, try again.";
			break;

		case 2:
			result = "Wrong. Try one more time.";
			break;

		case 3:
			result = "Dont give up!";
			break;

		case 4:
			result = "No. Keep trying.";
			break;

		}
		return result;
	}

}
