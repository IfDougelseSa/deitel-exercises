package entities;

import consts.GameStatus;
import consts.Pieces;

public class TicTacToe {

	private Pieces[][] board = new Pieces[3][3];
	private GameStatus gameStatus = GameStatus.PLAY;
	private boolean gameException = true;

	public TicTacToe() {
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++)
				board[i][j] = Pieces.EMPTY;
		}
	}

	public Pieces[][] getBoard() {
		return board;
	}

	public GameStatus getGameStatus() {
		return gameStatus;
	}

	public void setGameStatus(GameStatus gameStatus) {
		this.gameStatus = gameStatus;
	}

	public boolean isGameException() {
		return gameException;
	}

	public void setGameException(boolean gameException) {
		this.gameException = gameException;
	}

	public void setO(int position) {
		try {

			switch (position) {
			case 1:
				if (board[0][0] != Pieces.EMPTY) {
					setGameException(true);
					throw new IllegalArgumentException("This space already has a piece");
				}
				setGameException(false);
				board[0][0] = Pieces.O;
				break;
			case 2:
				if (board[0][1] != Pieces.EMPTY) {
					setGameException(true);
					throw new IllegalArgumentException("This space already has a piece");
				}
				board[0][1] = Pieces.O;
				setGameException(false);
				break;
			case 3:
				if (board[0][2] != Pieces.EMPTY) {
					setGameException(true);
					throw new IllegalArgumentException("This space already has a piece");
				}
				board[0][2] = Pieces.O;
				setGameException(false);
				break;
			case 4:
				if (board[1][0] != Pieces.EMPTY) {
					setGameException(true);
					throw new IllegalArgumentException("This space already has a piece");
				}
				board[1][0] = Pieces.O;
				setGameException(false);
				break;
			case 5:
				if (board[1][1] != Pieces.EMPTY) {
					setGameException(true);
					throw new IllegalArgumentException("This space already has a piece");
				}
				board[1][1] = Pieces.O;
				setGameException(false);
				break;
			case 6:
				if (board[1][2] != Pieces.EMPTY) {
					setGameException(true);
					throw new IllegalArgumentException("This space already has a piece");
				}
				board[1][2] = Pieces.O;
				setGameException(false);
				break;
			case 7:
				if (board[2][0] != Pieces.EMPTY) {
					setGameException(true);
					throw new IllegalArgumentException("This space already has a piece");
				}
				board[2][0] = Pieces.O;
				setGameException(false);
				break;
			case 8:
				if (board[2][1] != Pieces.EMPTY) {
					setGameException(true);
					throw new IllegalArgumentException("This space already has a piece");
				}
				board[2][1] = Pieces.O;
				setGameException(false);
				break;
			case 9:
				if (board[2][2] != Pieces.EMPTY) {
					setGameException(true);
					throw new IllegalArgumentException("This space already has a piece");
				}
				board[2][2] = Pieces.O;
				setGameException(false);
				break;
			}

		} catch (Exception e) {
			System.out.println(e);
		}
		board();

	}

	public void setX(int position) {
		try {

			switch (position) {
			case 1:
				if (board[0][0] != Pieces.EMPTY) {
					setGameException(true);
					throw new IllegalArgumentException("This space already has a piece");
				}
				board[0][0] = Pieces.X;
				setGameException(false);
				break;
			case 2:
				if (board[0][1] != Pieces.EMPTY) {
					setGameException(true);
					throw new IllegalArgumentException("This space already has a piece");
				}
				board[0][1] = Pieces.X;
				setGameException(false);
				break;
			case 3:
				if (board[0][2] != Pieces.EMPTY) {
					setGameException(true);
					throw new IllegalArgumentException("This space already has a piece");
				}
				board[0][2] = Pieces.X;
				setGameException(false);
				break;
			case 4:
				if (board[1][0] != Pieces.EMPTY) {
					setGameException(true);
					throw new IllegalArgumentException("This space already has a piece");
				}
				board[1][0] = Pieces.X;
				setGameException(false);
				break;
			case 5:
				if (board[1][1] != Pieces.EMPTY) {
					setGameException(true);
					throw new IllegalArgumentException("This space already has a piece");
				}
				board[1][1] = Pieces.X;
				setGameException(false);
				break;
			case 6:
				if (board[1][2] != Pieces.EMPTY) {
					setGameException(true);
					throw new IllegalArgumentException("This space already has a piece");
				}
				board[1][2] = Pieces.X;
				setGameException(false);
				break;
			case 7:
				if (board[2][0] != Pieces.EMPTY) {
					setGameException(true);
					throw new IllegalArgumentException("This space already has a piece");
				}
				board[2][0] = Pieces.X;
				setGameException(false);
				break;
			case 8:
				if (board[2][1] != Pieces.EMPTY) {
					setGameException(true);
					throw new IllegalArgumentException("This space already has a piece");
				}
				board[2][1] = Pieces.X;
				setGameException(false);
				break;
			case 9:
				if (board[2][2] != Pieces.EMPTY) {
					setGameException(true);
					throw new IllegalArgumentException("This space already has a piece");
				}
				board[2][2] = Pieces.X;
				setGameException(false);
				break;
			}

		} catch (Exception e) {
			System.out.println(e);
		}
		board();

	}

	public void board() {
		System.out.println();
		System.out.println();
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				if (board[i][j] == Pieces.EMPTY) {
					System.out.print(" ");
				} else if (board[i][j] == Pieces.X) {
					System.out.print("X");
				} else {
					System.out.print("O");
				}
				if (j != 2)
					System.out.print(" | ");
			}
			if (i != 2) {
				System.out.println();
				System.out.print("----------");
				System.out.println();
			}

		}

		System.out.println();
		System.out.println();

	}

	public void verifyWin() {
		if (board[0][0] == Pieces.X && board[0][1] == Pieces.X && board[0][2] == Pieces.X) {
			setGameStatus(GameStatus.WIN);
			System.out.println("The winner is X!");
		} else if (board[0][0] == Pieces.X && board[1][0] == Pieces.X && board[2][0] == Pieces.X) {
			setGameStatus(GameStatus.WIN);
			System.out.println("The winner is X!");
		} else if (board[2][0] == Pieces.X && board[2][1] == Pieces.X && board[2][2] == Pieces.X) {
			setGameStatus(GameStatus.WIN);
			System.out.println("The winner is X!");
		} else if (board[0][2] == Pieces.X && board[1][2] == Pieces.X && board[2][2] == Pieces.X) {
			setGameStatus(GameStatus.WIN);
			System.out.println("The winner is X!");
		} else if (board[1][0] == Pieces.X && board[1][1] == Pieces.X && board[1][2] == Pieces.X) {
			setGameStatus(GameStatus.WIN);
			System.out.println("The winner is X!");
		} else if (board[0][0] == Pieces.X && board[1][1] == Pieces.X && board[2][2] == Pieces.X) {
			setGameStatus(GameStatus.WIN);
			System.out.println("The winner is X!");
		} else if (board[0][2] == Pieces.X && board[1][1] == Pieces.X && board[2][0] == Pieces.X) {
			setGameStatus(GameStatus.WIN);
			System.out.println("The winner is X!");
		} else if (board[0][0] == Pieces.O && board[0][1] == Pieces.O && board[0][2] == Pieces.O) {
			setGameStatus(GameStatus.WIN);
			System.out.println("The winner is O!");
		} else if (board[0][0] == Pieces.O && board[1][0] == Pieces.O && board[2][0] == Pieces.O) {
			setGameStatus(GameStatus.WIN);
			System.out.println("The winner is O!");
		} else if (board[2][0] == Pieces.O && board[2][1] == Pieces.O && board[2][2] == Pieces.O) {
			setGameStatus(GameStatus.WIN);
			System.out.println("The winner is O!");
		} else if (board[0][2] == Pieces.O && board[1][2] == Pieces.O && board[2][2] == Pieces.O) {
			setGameStatus(GameStatus.WIN);
			System.out.println("The winner is O!");
		} else if (board[1][0] == Pieces.O && board[1][1] == Pieces.O && board[1][2] == Pieces.O) {
			setGameStatus(GameStatus.WIN);
			System.out.println("The winner is O!");
		} else if (board[0][0] == Pieces.O && board[1][1] == Pieces.O && board[2][2] == Pieces.O) {
			setGameStatus(GameStatus.WIN);
			System.out.println("The winner is O!");
		} else if (board[0][2] == Pieces.O && board[1][1] == Pieces.O && board[2][0] == Pieces.O) {
			setGameStatus(GameStatus.WIN);
			System.out.println("The winner is O!");
		} else if (board[0][0] != Pieces.EMPTY && board[0][1] != Pieces.EMPTY && board[0][2] != Pieces.EMPTY
				&& board[1][0] != Pieces.EMPTY && board[1][1] != Pieces.EMPTY && board[1][2] != Pieces.EMPTY
				&& board[2][0] != Pieces.EMPTY && board[2][1] != Pieces.EMPTY && board[2][2] != Pieces.EMPTY) {
			setGameStatus(GameStatus.TIE);
			System.out.println("Its a tie!");
		}

	}

}
