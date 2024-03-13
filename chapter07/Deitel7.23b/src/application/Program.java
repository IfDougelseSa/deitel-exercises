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
	static int[] total = new int [1000];
	static int countTotal = 0;

	public static void main(String[] args) {

		for (int i = 0; i < 1000; i++) {

			currentRow = randomNumbers.nextInt(8);

			currentColumn = randomNumbers.nextInt(8);

			board[currentRow][currentColumn] = 1;

			while (true) {

				try {

					switch (1 + randomNumbers.nextInt(8)) {
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
					System.out.println("Total legal moves: " + count);
					total[countTotal] = count;
					countTotal++;
					count = 0;
					cleanBoard();
					break;
				}
				System.out.println();

			}

		}
		
		for (int i: total) {
			System.out.println(i);
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

	public static void cleanBoard() {

		for (int i = 0; i < board.length; i++) {
			for (int j = 0; j < board[i].length; j++) {
				board[i][j] = 0;
			}
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

}
