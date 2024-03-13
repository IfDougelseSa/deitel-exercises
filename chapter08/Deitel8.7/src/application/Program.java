package application;

import entities.Time2;

public class Program {

	public static void main(String[] args) {

		Time2 t1 = new Time2();
		Time2 t2 = new Time2(2);
		Time2 t3 = new Time2(21, 34);
		Time2 t4 = new Time2(23, 59, 59);
		Time2 t5 = new Time2(t4);
		Time2 t6 = new Time2(23, 59);
		Time2 t7 = new Time2(23);

		System.out.println("Constructed with:");
		displayTime("t1: all arguments default", t1);
		displayTime("t2: hour specified; minute and second default", t2);
		displayTime("t3: hour and minute specified; second default", t3);
		displayTime("t4: hour, minute, and second specified", t4);
		displayTime("t5: Time2 object t4 specified", t5);
		displayTime("t6: ", t6);
		displayTime("t7: ", t7);

		try {
			Time2 t8 = new Time2(27, 74, 99);
		} catch (IllegalArgumentException e) {
			System.out.printf("%nException initializing t6: %s%n", e.getMessage());
		}
		
		System.out.println();
		t4.ticket();
		t6.incrementMinute();
		t7.incrementHour();
		displayTime("t4 increment second: ", t4);
		displayTime("t6 increment minute: ", t6);
		displayTime("t7 increment hour: ", t7);

	}

	private static void displayTime(String header, Time2 t) {
		System.out.printf("%s%n %s%n %s%n", header, t.toUniversalString(), t.toString());
	}
}
