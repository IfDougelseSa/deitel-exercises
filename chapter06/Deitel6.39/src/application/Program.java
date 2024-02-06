package application;

import java.security.SecureRandom;
import java.util.Scanner;

public class Program {

	private static final SecureRandom randomNumbers = new SecureRandom();

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int attempt = -50;
		int countRight = 0;
		int percentage;
		char test = 'y';
		int level = 0;
		int a = 0;
		int b = 0;
		int arithmetic = 0;
		int answer = 0;

		while (test != 'n') {

			System.out.print("Enter the difficulty level (1, 2, 3): ");
			level = sc.nextInt();

			System.out.print(
					"select the arithmetic problem (1 - addition , 2 - subtract, 3 - multiplication, 4 - division and 5 - all): ");
			arithmetic = sc.nextInt();
			for (int i = 1; i <= 10; i++) {

				switch (level) {
				case 1:
					a = randomNumbers.nextInt(11);
					b = randomNumbers.nextInt(11);
					break;
				case 2:
					a = 10 + randomNumbers.nextInt(11);
					b = 10 + randomNumbers.nextInt(11);
					break;
				case 3:
					a = 100 + randomNumbers.nextInt(11);
					b = 100 + randomNumbers.nextInt(11);
					break;
				default:
					a = randomNumbers.nextInt(11);
					b = randomNumbers.nextInt(11);

				}

				switch (arithmetic) {

				case 1:
					answer = a + b;
					System.out.print(question(a, b, arithmetic));
					break;
				case 2:
					answer = a - b;
					System.out.print(question(a, b, arithmetic));
					break;
				case 3:
					answer = a * b;
					System.out.print(question(a, b, arithmetic));
					break;
				case 4:
					if (b == 0) {
						b = 1;
					}
					answer = a / b;
					System.out.print(question(a, b, arithmetic));
					break;
				case 5:
					int random = 1 + randomNumbers.nextInt(4);
					switch (random) {
					case 1:
						answer = a + b;
						System.out.print(question(a, b, 1));
						break;
					case 2:
						answer = a - b;
						System.out.print(question(a, b, 2));
						break;
					case 3:
						answer = a * b;
						System.out.print(question(a, b, 3));
						break;
					case 4:
						answer = a / b;
						System.out.print(question(a, b, 4));
						break;
					}
					break;
				default:
					answer = a + b;
					System.out.print(question(a, b, arithmetic));
				}

				attempt = sc.nextInt();

				if (attempt != answer) {
					System.out.println(wrongMessage());
					System.out.println();
				} else {
					System.out.println(rightMessage());
					System.out.println();
					countRight++;
				}

				attempt = -50;

			}

			percentage = countRight * 10;

			if (percentage < 75)
				System.out.println("Ask your teacher for extra help.");
			else
				System.out.println("Congratulations, you are ready to advance to the next level!");

			System.out.println();
			System.out.print("Another student wants to play? (n to quit or any key to continue) ");
			countRight = 0;
			test = sc.next().charAt(0);

		}

		sc.close();

	}

	public static String question(int a, int b, int arithmetic) {

		String question = "";

		switch (arithmetic) {
		case 1:
			question = "How much is " + a + " added " + b + "? ";
			break;
		case 2:
			question = "How much is " + a + " subtracted " + b + "? ";
			break;
		case 3:
			question = "How much is " + a + " multiplied " + b + "? ";
			break;
		case 4:
			question = "How much is " + a + " divided " + b + "? ";
			break;
		}

		return question;
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
