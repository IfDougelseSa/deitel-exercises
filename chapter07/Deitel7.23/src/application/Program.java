package application;

import java.security.SecureRandom;
import java.util.Scanner;

import exceptions.SamePosition;

public class Program {

	private static final SecureRandom randomNumbers = new SecureRandom();
	static Scanner sc = new Scanner(System.in);
	static int[][] board = new int[8][8];
	static int[] horizontal = { 2, 1, -1, -2, -2, -1, 1, 2 };
	static int[] vertical = { -1, -2, -2, -1, 1, 2, 2, 1 };
	static int currentRow = -1;
	static int currentColumn = -1;
	static int count = 0;
	static int[][] accessibility = { { 2, 3, 4, 4, 4, 4, 3, 2 }, { 3, 4, 6, 6, 6, 6, 4, 3 }, { 4, 6, 8, 8, 8, 8, 6, 4 },
			{ 4, 6, 8, 8, 8, 8, 6, 4 }, { 4, 6, 8, 8, 8, 8, 6, 4 }, { 4, 6, 8, 8, 8, 8, 6, 4 },
			{ 3, 4, 6, 6, 6, 6, 4, 3 }, { 2, 3, 4, 4, 4, 4, 3, 2 } };
	static int newCurrentRow = -1;
	static int newCurrentColumn = -1;

	public static void main(String[] args) {

		int sentinel = 0;

		System.out.println("Where would you like your horse to start?");
		while (currentRow < 0 || currentRow > 7) {
			System.out.print("Enter the row number: ");
			currentRow = sc.nextInt();
		}

		while (currentColumn < 0 || currentColumn > 7) {
			System.out.print("Enter the column number: ");
			currentColumn = sc.nextInt();
		}

		board[currentRow][currentColumn] = 1;
		accessibility[currentRow][currentColumn] = 10;
		newCurrentRow = currentRow;
		newCurrentColumn = currentColumn;

		printBoard();

		while (true) {
			System.out.println(verifyBestMove());

			sentinel = 1 + randomNumbers.nextInt(8);

			try {

				switch (sentinel) {
				case 1:
					twoRightOneUp();
					break;
				case 2:
					twoUpOneRight();
					break;
				case 3:
					twoUpOneLeft();
					break;
				case 4:
					twoLeftOneUp();
					break;
				case 5:
					twoLeftOneDown();
					break;
				case 6:
					twoDownOneLeft();
					break;
				case 7:
					twoDownOneRight();
					break;
				case 8:
					twoRightOneDown();
					break;

				}

				accessibility[currentRow][currentColumn] = 10;

				System.out.println();
				System.out.println("BOARD");
				printBoard();

				verifyHeuristic();

				newCurrentRow = currentRow;
				newCurrentColumn = currentColumn;

				System.out.println();
				System.out.println();
				System.out.println("Heuristic");
				printHeuristic();
				System.out.println();

				System.out.println("Total legal moves: " + count);

			} catch (ArrayIndexOutOfBoundsException e) {
				System.out.println();
				System.out.println("Invalid move!");
			} catch (SamePosition e) {
				System.out.println();
				System.out.println(e);
			}

			if (verifyAllMoves()) {
				System.out.println("There is more moves");
			} else {
				System.out.println(" NO MORE MOVES");
				break;
			}
			System.out.println();

		}

	}

	public static void twoRightOneUp() {

		attempts(vertical[0], horizontal[0]);
		currentRow--;
		currentColumn += 2;
		count++;

	}

	public static void twoUpOneRight() {

		attempts(vertical[1], horizontal[1]);
		currentRow -= 2;
		currentColumn++;
		count++;

	}

	public static void twoUpOneLeft() {

		attempts(vertical[2], horizontal[2]);
		currentRow -= 2;
		currentColumn--;
		count++;

	}

	public static void twoLeftOneUp() {

		attempts(vertical[3], horizontal[3]);
		currentRow--;
		currentColumn -= 2;
		count++;

	}

	public static void twoLeftOneDown() {

		attempts(vertical[4], horizontal[4]);
		currentRow++;
		currentColumn -= 2;
		count++;

	}

	public static void twoDownOneLeft() {

		attempts(vertical[5], horizontal[5]);
		currentRow += 2;
		currentColumn--;
		count++;

	}

	public static void twoDownOneRight() {

		attempts(vertical[6], horizontal[6]);
		currentRow += 2;
		currentColumn++;
		count++;

	}

	public static void twoRightOneDown() {

		attempts(vertical[7], horizontal[7]);
		currentRow++;
		currentColumn += 2;
		count++;

	}

	public static void attempts(int row, int column) {
		row += currentRow;
		column += currentColumn;
		try {
			board[row][column]++;
			if (board[row][column] == 2) {
				board[row][column]--;
				throw new SamePosition("Same position!");
			}

		} catch (ArrayIndexOutOfBoundsException e) {
			throw e;
		}
	}

	public static String verifyBestMove() {

		int row = currentRow;
		int column = currentColumn;

		int[] bestMove = new int[8];
		int countMove = 0;
		int highMove = 0;

		for (int i = 0; i < 8; i++) {
			row += vertical[i];
			column += horizontal[i];

			if (row >= 0 && row < 8 && column >= 0 && column < 8) {

				if (accessibility[row][column] != 10) {
					bestMove[countMove] = accessibility[row][column];
					countMove++;

				}

			}
			row -= vertical[i];
			column -= horizontal[i];
		}

		for (int i : bestMove) {
			if (i > highMove) {
				highMove = i;
			}
		}
		return "Best move is: " + highMove;

	}

	public static void verifyHeuristic() {

		int row = newCurrentRow;
		int column = newCurrentColumn;

		for (int i = 0; i < 8; i++) {
			row += vertical[i];
			column += horizontal[i];

			if (row >= 0 && row < 8 && column >= 0 && column < 8) {

				if (accessibility[row][column] != 10) {
					accessibility[row][column]--;

				}

			}
			row -= vertical[i];
			column -= horizontal[i];
		}

	}

	public static boolean verifyAllMoves() {

		int row = currentRow;
		int column = currentColumn;

		for (int i = 0; i < 8; i++) {
			row += vertical[i];
			column += horizontal[i];

			if (row >= 0 && row < 8 && column >= 0 && column < 8) {

				board[row][column]++;
				if (board[row][column] == 1) {
					board[row][column]--;
					return true;
				}
				board[row][column]--;

			}
			row -= vertical[i];
			column -= horizontal[i];
		}
		return false;

	}

	public static void printHeuristic() {
		for (int i = 0; i < accessibility.length; i++) {
			for (int j = 0; j < accessibility[i].length; j++) {
				if (accessibility[i][j] == 10) {
					System.out.print("*");
				} else {
					System.out.print(accessibility[i][j]);
				}
			}
			System.out.println();
		}
	}

	public static void printBoard() {

		for (int i = 0; i < board.length; i++) {
			for (int j = 0; j < board[i].length; j++) {
				if (board[i][j] == 1) {
					System.out.print("*");
				} else {
					System.out.print("-");
				}
			}
			System.out.println();
		}
	}

}
