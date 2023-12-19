package application;

import java.util.Scanner;

public class Program {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int count = 1;
		char trip = 'y';
		int kilometers = 0;
		int liters = 0;
		double totalKilometer = 0;
		double totalLiters = 0;

		System.out.print("Press (y) to calculate your trip consume. Press (n) to exit program: ");
		trip = sc.next().charAt(0);

		while (trip != 'y' && trip != 'n') {
			System.out.print("Press (y) to calculate your trip consume. Press (n) to exit program: ");
			trip = sc.next().charAt(0);
		}

		if (trip == 'n') {
			System.out.println("You didn't go on any trips");
		} else {

			while (trip == 'y') {
				System.out.print("Enter the kilometers: ");
				kilometers = sc.nextInt();

				System.out.print("Enter the liters: ");
				liters = sc.nextInt();

				System.out.println("Trip " + count + ": " + (double) kilometers / liters + " km/l");
				count++;

				totalKilometer += (double) kilometers;
				totalLiters += (double) liters;
				
				System.out.println();
				System.out.print("Press (y) to calculate your trip consume. Press (n) to exit program: ");
				trip = sc.next().charAt(0);

				while (trip != 'y' && trip != 'n') {
					System.out.print("Press (y) to calculate your trip consume. Press (n) to exit program: ");
					trip = sc.next().charAt(0);
				}

			}

			sc.close();

			System.out.println();
			System.out.println("Total Kilometers: " + totalKilometer);
			System.out.println("Total Liters: " + totalLiters);

		}

	}

}
