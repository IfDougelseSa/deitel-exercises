package tests.factory;

import entities.Time2;

public class Time2Factory {

	public static Time2 createEmptyTime2() {
		return new Time2();
	}

	public static Time2 createSecondTime2() {
		return new Time2(23, 59, 59);
	}

	public static Time2 createMinuteTime2() {
		return new Time2(23, 59);
	}

	public static Time2 createHourTime2() {
		return new Time2(23);
	}

}
