package application;

import java.util.InputMismatchException;
import java.util.Locale;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		char sell = ' ';
		int count = 0;
		double total = 0;
		int item = 0;

		System.out.print("Do you wanna insert an item? (y/n): ");
		sell = sc.next().charAt(0);

		while (sell != 'y' && sell != 'n') {
			System.out.print("Do you wanna insert an item? (y/n): ");
			sell = sc.next().charAt(0);
		}

		if (sell == 'y') {
			while (sell == 'y') {

				while (item != 1 && item != 2 && item != 3 && item != 4) {
					System.out.print("Enter item number (1, 2, 3, 4): ");
					try {
						item = sc.nextInt();
					} catch (InputMismatchException e) {
						System.out.println("Type Error. Only 1, 2, 3 and 4 are valid");
						sc.next();

					}
				}

				switch (item) {
				case 1:
					total += 239.99;
					break;
				case 2:
					total += 129.75;
					break;
				case 3:
					total += 99.75;
					break;
				case 4:
					total += 350.89;
					break;
				}

				System.out.print("Do you wanna insert one more item? (y/n): ");
				sell = sc.next().charAt(0);

				while (sell != 'y' && sell != 'n') {
					System.out.print("Do you wanna insert one more item? (y/n): ");
					sell = sc.next().charAt(0);
				}

				count++;

			}

			sc.close();

			System.out.println("Total items sold: " + count);
			System.out.printf("Sales amount: %.2f", total * 1.09 + 200);

		} else {
			System.out.println("No sales were entered.");
		}

	}

}
