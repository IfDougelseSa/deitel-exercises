package application;

import java.security.SecureRandom;
import java.util.Scanner;

public class Program {

	private static final SecureRandom randomNumbers = new SecureRandom();

	private enum Coin {
		HEADS, TAILS
	};

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		String game = " ";

		System.out.print("Type Toss coin to flip. Type anything to quit.");
		game = sc.nextLine();

		int totalHeads = 0;
		int totalTails = 0;
		Coin result;

		while (game.equals("Toss coin")) {

			result = flip();
			if (result == Coin.HEADS) {
				totalHeads++;
			} else {
				totalTails++;
			}
			System.out.println(result);
			System.out.print("Type Toss coin to flip. Type anything to quit.");
			game = sc.nextLine();
		}

		sc.close();

		System.out.println();
		System.out.print("Total heads: " + totalHeads + " | Total tails: " + totalTails);

	}

	public static Coin flip() {

		int result = randomNumbers.nextInt(2);

		if (result == 1) {
			return Coin.HEADS;
		} else {
			return Coin.TAILS;
		}

	}

}
