package application;

import entities.Date;

public class Program {

	public static void main(String[] args) {

		Date date1 = new Date(03, 06, 1995);
		Date date2 = new Date("April", 04, 1996);
		Date date3 = new Date(200, 1990);
		
		System.out.printf("Date 1: %s%nDate 2: %s%nDate 3: %s%n%n", date1, date2, date3);
		System.out.printf("Date 1: %s%nDate 2: %s%nDate 3: %s%n%n", date1.toStringMonthFormatted(),
				date2.toStringMonthFormatted(), date3.toStringMonthFormatted());
		System.out.printf("Date 1: %s%nDate 2: %s%nDate 3: %s%n%n", date1.toStringDayAndYear(),
				date2.toStringDayAndYear(), date3.toStringDayAndYear());

	}

}
