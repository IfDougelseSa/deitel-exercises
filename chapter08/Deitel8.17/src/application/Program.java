package application;

import java.util.Scanner;

import consts.GameStatus;
import entities.TicTacToe;

public class Program {

	public static void main(String[] args) {

		TicTacToe ticTacToe = new TicTacToe();
		ticTacToe.board();

		Scanner sc = new Scanner(System.in);

		while (ticTacToe.getGameStatus() == GameStatus.PLAY) {

			while (ticTacToe.isGameException()) {
				System.out.printf("Player X type a place %n1 2 3%n4 5 6%n7 8 9: ");
				ticTacToe.setX(sc.nextInt());
				System.out.println();
			}

			ticTacToe.verifyWin();
			ticTacToe.setGameException(true);

			if (ticTacToe.getGameStatus() == GameStatus.PLAY) {
				while (ticTacToe.isGameException()) {
					System.out.printf("Player O type a place %n1 2 3%n4 5 6%n7 8 9: ");
					ticTacToe.setO(sc.nextInt());
				}
				ticTacToe.setGameException(true);
				ticTacToe.verifyWin();
			}

		}

		sc.close();

	}

}
