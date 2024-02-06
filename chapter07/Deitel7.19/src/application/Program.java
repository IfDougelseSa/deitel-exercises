package application;

import java.util.Scanner;

public class Program {

	public static boolean[] array = new boolean[10];
	public static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int classType = 0;

		System.out.print("Do you wanna reserve a seat for a passenger? (press any key to yes or crtl + d to quit): ");
		while (sc.hasNext()) {
			sc.next();

			if (verifyAllClass() == false) {
				System.out.println("There are no more seats!");
			} else {
				while (classType != 1 && classType != 2) {

					System.out.print("Please type 1 for First Class e Please type 2 for Economy: ");
					classType = sc.nextInt();
				}
				chooseClass(classType);
			}

			sc.close();

			classType = 0;

			System.out.print(
					"Do you wanna reserve a seat for one more passenger? (press any key to yes or crtl + d to quit): ");
		}
	}

	public static void chooseClass(int classType) {
		char economySeat = 'n';
		switch (classType) {
		case 1:
			if (verifyFirstClass()) {
				seatFirstClass();
			} else if (verifyEconomyClass()) {
				System.out.print("There are no more seats. Do you wanna a seat in economy class? (y/n): ");
				economySeat = sc.next().charAt(0);
				if (economySeat == 'y') {
					seatEconomyClass();
				} else {
					System.out.println("Next flight leaves in 3 hours");
				}
			} else {
				System.out.println("There are no more seats!");
			}
			break;

		case 2:
			if (verifyEconomyClass()) {
				seatEconomyClass();
			} else if (verifyFirstClass()) {
				System.out.print("There are no more seats. Do you wanna a seat in first class? (y/n): ");
				economySeat = sc.next().charAt(0);
				if (economySeat == 'y') {
					seatFirstClass();
				} else {
					System.out.println("Next flight leaves in 3 hours");
				}
			} else {
				System.out.println("There are no more seats!");
			}
			break;

		}

	}

	public static boolean verifyAllClass() {
		boolean verify = false;
		for (boolean i : array) {
			if (i == false) {
				verify = true;
			}
		}
		return verify;
	}

	public static boolean verifyFirstClass() {

		boolean verify = false;
		for (int i = 0; i < 5; i++) {
			if (array[i] == false) {
				verify = true;
				break;
			}
		}

		return verify;
	}

	public static boolean verifyEconomyClass() {

		boolean verify = false;
		for (int i = 5; i < 10; i++) {
			if (array[i] == false) {
				verify = true;
				break;
			}

		}

		return verify;
	}

	public static void seatFirstClass() {

		for (int i = 0; i < 5; i++) {
			if (array[i] == false) {
				array[i] = true;
				System.out.println("Boarding First pass. Seat " + (i + 1));
				break;
			}
		}

	}

	public static void seatEconomyClass() {

		for (int i = 5; i < 10; i++) {
			if (array[i] == false) {
				array[i] = true;
				System.out.println("Boarding Economy pass. Seat " + (i + 1));
				break;
			}
		}

	}

}
