package application;

import java.security.SecureRandom;

import utils.GameStatus;

public class Program {

	private static final SecureRandom randomNumbers = new SecureRandom();

	private static final int SNAKE_EYES = 2;
	private static final int TREY = 3;
	private static final int SEVEN = 7;
	private static final int YO_LEVEN = 11;
	private static final int BOX_CARS = 12;

	public static void main(String[] args) {

		int myPoint = 0;
		GameStatus gameStatus;

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
			sumOfDice = rollDice();

			if (sumOfDice == myPoint) {
				gameStatus = GameStatus.WON;
			} else if (sumOfDice == SEVEN) {
				gameStatus = GameStatus.LOST;
			}
		}
		
		if (gameStatus == GameStatus.WON) {
			System.out.println("Player wins");
			
		} else {
			System.out.println("Player loses");
		}

	}

	public static int rollDice() {
		int die1 = 1 + randomNumbers.nextInt(6);
		int die2 = 1 + randomNumbers.nextInt(6);
		int sum = die1 + die2;
		System.out.printf("Player rolled %d + %d = %d%n", die1, die2, sum);

		return sum;
	}

}
