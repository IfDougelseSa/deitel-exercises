package entities;

import java.time.LocalDate;

public class DateAndTime {

	private static final int[] daysPerMonth = { 0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };

	private int month;
	private int day;
	private int year;
	private int hour;
	private int minute;
	private int second;

	public DateAndTime() {
		this(0, 0, 0, 1, 1, 1900);
	}

	public DateAndTime(int hour, int minute, int second, int month, int day, int year) {
		if (hour < 0 || hour >= 24)
			throw new IllegalArgumentException("hour must be 0-23");
		if (minute < 0 || minute >= 60)
			throw new IllegalArgumentException("minute must be 0-59");
		if (second < 0 || second >= 60)
			throw new IllegalArgumentException("second must be 0-59");
		if (month <= 0 || month > 12)
			throw new IllegalArgumentException("month (" + month + ") must be 1-12");
		if (day <= 0 || (day > daysPerMonth[month] && !(month == 2 && day == 29)))
			throw new IllegalArgumentException("day (" + day + ") out-of-range for the specified month and year");
		if (month == 2 && day == 29 && !(year % 400 == 0 || (year % 4 == 0 && year % 100 != 0)))
			throw new IllegalArgumentException("day (" + day + ") out-of-range for the specified month and year");
		if (year > LocalDate.now().getYear() || year < 1900)
			throw new IllegalArgumentException("year (" + year + ") out-of-range (1900 - actual year.");

		this.month = month;
		this.day = day;
		this.year = year;
		this.hour = hour;
		this.minute = minute;
		this.second = second;
	}

	public int getMonth() {
		return month;
	}

	public void setMonth(int month) {
		this.month = month;
	}

	public int getDay() {
		return day;
	}

	public void setDay(int day) {
		this.day = day;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

	public int getHour() {
		return hour;
	}

	public void setHour(int hour) {
		this.hour = hour;
	}

	public int getMinute() {
		return minute;
	}

	public void setMinute(int minute) {
		this.minute = minute;
	}

	public int getSecond() {
		return second;
	}

	public void setSecond(int second) {
		this.second = second;
	}

	public static int[] getDayspermonth() {
		return daysPerMonth;
	}

	public void incrementHour() {
		hour++;
		if (hour > 23) {
			hour = 0;
			nextDay();
		}

	}

	public void nextDay() {
		day++;
		if (day > daysPerMonth[month] && !(month == 2)) {
			day = 1;
			month++;
			if (month > 12) {
				month = 1;
				year++;
			}
		}

		if (month == 2) {
			if (year % 400 == 0 || (year % 4 == 0 && year % 100 != 0)) {
				if (day > 29) {
					day = 1;
					month++;
				}
			} else if (day > 28) {
				day = 1;
				month++;
			}

		}
	}

	public String toUniversalString() {
		return String.format("%02d:%02d:%02d %02d/%02d/%04d", getHour(), getMinute(), getSecond(), getMonth(), getDay(),
				getYear());
	}

	public String toString() {
		return String.format("%d:%02d:%02d %s %02d/%02d/%04d",
				((getHour() == 0 || getHour() == 12) ? 12 : getHour() % 12), getMinute(), getSecond(),
				(getHour() < 12 ? "AM" : "PM"), getMonth(), getDay(), getYear());
	}

}
