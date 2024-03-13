package application;

import entities.Date;

public class Program {

	public static void main(String[] args) {

		System.out.println("Leap year");
		Date date = new Date(1, 01, 2020);

		for (int i = 0; i < 366; i++) {
			date.nextDay();
			System.out.println(date);

		}
		
		System.out.println();
		System.out.println("Normal year");
		Date date2 = new Date(1, 01, 2021);

		for (int i = 0; i < 365; i++) {
			date2.nextDay();
			System.out.println(date2);

		}

	}

}
