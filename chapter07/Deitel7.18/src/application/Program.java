package application;

import java.security.SecureRandom;

import utils.GameStatus;

public class Program {

	// e) no

	private static final SecureRandom randomNumbers = new SecureRandom();

	private static final int SNAKE_EYES = 2;
	private static final int TREY = 3;
	private static final int SEVEN = 7;
	private static final int YO_LEVEN = 11;
	private static final int BOX_CARS = 12;
	private static int[] winsRoll = new int[21];
	private static int[] loseRoll = new int[21];
	private static final int TOTAL_GAMES = 1000000;

	public static void main(String[] args) {

		int count = 1;
		int sumWins = 0;
		int sumLoses = 0;
		int average = 0;
		int total = 1;
		int sum = 0;

		for (int i = 0; i < TOTAL_GAMES; i++) {
			game();
		}

		System.out.println("WINS");

		for (int i : winsRoll) {
			if (count == 21) {
				System.out.print("Wins in the 21 or plus roll(s): ");
			} else {
				System.out.print("Wins in the " + count + " roll(s): ");
			}

			System.out.println(i);
			count++;
			sumWins += i;
		}
		System.out.println("Total wins: " + sumWins);
		count = 1;

		System.out.println("-------------------------------------------------");
		System.out.println("-------------------------------------------------");

		System.out.println("LOSES");
		for (int i : loseRoll) {
			if (count == 21) {
				System.out.print("Loses in the 21 or plus roll(s): ");
			} else {
				System.out.print("Loses in the " + count + " roll(s): ");
			}

			System.out.println(i);
			count++;
			sumLoses += i;
		}
		System.out.println("Total loses: " + sumLoses);
		System.out.println("-------------------------------------------------");
		System.out.println("-------------------------------------------------");
		System.out.println("Probability to win in 1000000 games: " + ((double) sumWins) / TOTAL_GAMES);

		count = 1;
		for (int i : winsRoll) {
			total = count * i;
			average += total;
			count++;
		}
		sum = average;
		total = 0;
		average = 1;
		count = 1;
		for (int i : loseRoll) {
			total = count * i;
			average += total;
			count++;
		}
		sum += average;
		System.out.println("The average length of a game of craps is: " + ((double) sum / TOTAL_GAMES) + " rolls");

	}

	public static void game() {
		int count = 0;
		int myPoint = 0;
		GameStatus gameStatus;

		int sumOfDice = rollDice();

		switch (sumOfDice) {
		case SEVEN, YO_LEVEN:
			winsRoll[0]++;
			gameStatus = GameStatus.WON;
			break;
		case SNAKE_EYES, TREY, BOX_CARS:
			loseRoll[0]++;
			gameStatus = GameStatus.LOST;
			break;
		default:
			gameStatus = GameStatus.CONTINUE;
			myPoint = sumOfDice;
//			System.out.printf("Point is %d%n", myPoint);
			break;
		}

		while (gameStatus == GameStatus.CONTINUE) {
			sumOfDice = rollDice();
			count++;
			if (sumOfDice == myPoint) {
				if (count >= 21) {
					winsRoll[20]++;
				} else {
					winsRoll[count]++;
				}

				gameStatus = GameStatus.WON;
			} else if (sumOfDice == SEVEN) {
				if (count >= 21) {
					loseRoll[20]++;
				} else {
					loseRoll[count]++;
				}
				gameStatus = GameStatus.LOST;
			}
		}

//		if (gameStatus == GameStatus.WON) {
//			System.out.println("Player wins");
//
//		} else {
//			System.out.println("Player loses");
//		}
	}

	public static int rollDice() {
		int die1 = 1 + randomNumbers.nextInt(6);
		int die2 = 1 + randomNumbers.nextInt(6);
		int sum = die1 + die2;
//		System.out.printf("Player rolled %d + %d = %d%n", die1, die2, sum);

		return sum;
	}

}
