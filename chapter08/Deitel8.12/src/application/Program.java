package application;

import entities.DateAndTime;

public class Program {

	public static void main(String[] args) {

		DateAndTime dateAndTime = new DateAndTime();
		DateAndTime dateAndTime2 = new DateAndTime(23, 20, 10, 12, 31, 2000);

		System.out.println(dateAndTime);
		System.out.println(dateAndTime2);
		dateAndTime2.incrementHour();
		System.out.println(dateAndTime2);

	}

}
