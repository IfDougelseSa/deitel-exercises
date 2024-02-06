package application;

import entities.Date;

public class Program {

	public static void main(String[] args) {

		Date date1 = new Date(12, 1, 2022);
		Date date2 = new Date(11, 5, 2022);

		System.out.println(date1.displayDate());
		System.out.println(date2.displayDate());
	}

}
      