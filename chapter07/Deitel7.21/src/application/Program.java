package application;

import java.util.Scanner;

public class Program {

	public static int[][] floor = new int[20][20];
	public static int x = 0, y = 0;
	public static int lastValue = 0;
	public static int avance = 0;
	public static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {

		int value = 0;

		while (value != 9) {

			while (value != 1 && value != 2 && value != 3 && value != 4 && value != 5 && value != 9) {
				System.out.printf("Enter 1 to go up; Enter 2 to go down; Enter 3 to go right; "
						+ "%nEnter 4 to go left; Enter 5 to choose how many spaces do you wanna advance; "
						+ "Enter 9 to quit and show your way: ");
				value = sc.nextInt();
			}

			if (value == 1) {
				lastValue = 1;
				up();
				value = 0;
			}

			if (value == 2) {
				lastValue = 2;
				down();
				value = 0;
			}

			if (value == 3) {
				lastValue = 3;
				right();
				value = 0;
			}

			if (value == 4) {
				lastValue = 4;
				left();
				value = 0;
			}

			if (value == 5) {
				avance();
				value = 0;
			}

		}
		System.out.println();
		System.out.println("Your graph walk!");
		showGraph();
	}

	public static void up() {

		x--;
		try {
			floor[x][y] = 1;
			System.out.println("going up!");
		} catch (ArrayIndexOutOfBoundsException e) {
			x++;
			System.out.println("Its not possible to go up.");
		}

	}

	public static void down() {
		x++;
		try {
			floor[x][y] = 1;
			System.out.println("going down!");
		} catch (ArrayIndexOutOfBoundsException e) {
			x--;
			System.out.println("Its not possible to go down.");
		}

	}

	public static void right() {

		y++;
		try {
			floor[x][y] = 1;
			System.out.println("going right!");
		} catch (ArrayIndexOutOfBoundsException e) {
			y--;
			System.out.println("Its not possible to go right.");
		}

	}

	public static void left() {

		y--;
		try {
			floor[x][y] = 1;
			System.out.println("going left!");
		} catch (ArrayIndexOutOfBoundsException e) {
			y++;
			System.out.println("Its not possible to go left.");
		}

	}

	public static void avance() {

		while (avance < 1 || avance > 10) {
			System.out.print("Enter the value that you want to avance (1 to 10): ");
			avance = sc.nextInt();

		}

		if (lastValue == 0) {
			while (lastValue != 2 && lastValue != 3) {
				System.out.print("Enter 2 to go down or 3 to go right: ");
				lastValue = sc.nextInt();
			}
		}

		switch (lastValue) {
		case 1:

			for (int i = 0; i < avance; i++) {
				try {
					up();
				} catch (ArrayIndexOutOfBoundsException e) {
					break;
				}
			}
			break;
		case 2:

			for (int i = 0; i < avance; i++) {
				try {
					down();
				} catch (ArrayIndexOutOfBoundsException e) {
					break;
				}
			}
			break;
		case 3:

			for (int i = 0; i < avance; i++) {
				try {
					right();
				} catch (ArrayIndexOutOfBoundsException e) {
					break;
				}
			}
			break;
		case 4:

			for (int i = 0; i < avance; i++) {
				try {
					left();
				} catch (ArrayIndexOutOfBoundsException e) {
					break;
				}
			}
			break;

		}
		avance = 0;
	}

	public static void showGraph() {

		for (int i = 0; i < floor.length; i++) {
			for (int j = 0; j < floor[i].length; j++) {
				if (floor[i][j] == 1) {
					System.out.print("*");
				} else {
					System.out.print("-");
				}
			}
			System.out.println();
		}
	}

}
