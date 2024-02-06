package application;

import java.security.SecureRandom;
import java.util.Scanner;

import utils.GameStatus;

public class Program {

	private static final SecureRandom randomNumbers = new SecureRandom();

	private static final int SNAKE_EYES = 2;
	private static final int TREY = 3;
	private static final int SEVEN = 7;
	private static final int YO_LEVEN = 11;
	private static final int BOX_CARS = 12;

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int myPoint = 0;
		double bankBalance = 1000;
		double wager = 1500;
		GameStatus gameStatus;

		while (wager > bankBalance) {
			System.out.print("Enter an wager: ");
			wager = sc.nextDouble();
		}

		sc.close();

		int sumOfDice = rollDice();

		switch (sumOfDice) {
		case SEVEN, YO_LEVEN:
			gameStatus = GameStatus.WON;
			break;
		case SNAKE_EYES, TREY, BOX_CARS:
			gameStatus = GameStatus.LOST;
			break;
		default:
			gameStatus = GameStatus.CONTINUE;
			myPoint = sumOfDice;
			System.out.printf("Point is %d%n", myPoint);
			break;
		}

		while (gameStatus == GameStatus.CONTINUE) {
			System.out.println(message());
			sumOfDice = rollDice();

			if (sumOfDice == myPoint) {
				gameStatus = GameStatus.WON;
			} else if (sumOfDice == SEVEN) {
				gameStatus = GameStatus.LOST;

			}
		}

		if (gameStatus == GameStatus.WON) {
			System.out.println("Player wins");
			System.out.println("Bank balance: " + (bankBalance + wager));

		} else {
			System.out.println("Player loses");
			bankBalance -= wager;
			if (bankBalance == 0) {
				System.out.println("Sorry. You busted!");
			} else {
				System.out.println("Bank balance: " + bankBalance);
			}
		}

	}

	public static int rollDice() {
		int die1 = 1 + randomNumbers.nextInt(6);
		int die2 = 1 + randomNumbers.nextInt(6);
		int sum = die1 + die2;
		System.out.printf("Player rolled %d + %d = %d%n", die1, die2, sum);

		return sum;
	}

	public static String message() {

		int random = randomNumbers.nextInt(3);

		if (random == 0) {
			return "Oh, you're going for broke, huh?";
		} else if (random == 1) {
			return "Aw c'mon, take a chance!";
		} else {
			return "You're up big. Now's the time to cash in your chips!";
		}

	}

}
