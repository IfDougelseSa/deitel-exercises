package entities;

public class Date {

	private int month;
	private int day;
	private int year;

	public Date(int month, int day, int year) {

		this.month = month;
		this.day = day;
		this.year = year;
	}

	public Date(String month, int day, int year) {

		try {
			stringToInt(month);
		} catch (Exception e) {
			System.out.println("Exception: " + e);
		}

		this.day = day;
		this.year = year;
	}

	public Date(int yearDays, int year) {

		if (year % 400 == 0 || (year % 4 == 0 && year % 100 != 0)) {
			daysToMonthDayLeapYear(yearDays);
		} else {
			daysToMonthDay(yearDays);
		}

		this.year = year;

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

	private void stringToInt(String month) {

		switch (month.toLowerCase()) {
		case "january": {
			this.month = 1;
			break;
		}
		case "february": {
			this.month = 2;
			break;
		}
		case "march": {
			this.month = 3;
			break;
		}
		case "april": {
			this.month = 4;
			break;
		}
		case "may": {
			this.month = 5;
			break;
		}
		case "june": {
			this.month = 6;
			break;
		}
		case "july": {
			this.month = 7;
			break;
		}
		case "august": {
			this.month = 8;
			break;
		}
		case "september": {
			this.month = 9;
			break;
		}
		case "october": {
			this.month = 10;
			break;
		}
		case "november": {
			this.month = 11;
			break;
		}
		case "december": {
			this.month = 12;
			break;
		}
		default:
			throw new IllegalArgumentException("Unexpected value: " + month.toLowerCase());
		}

	}

	private void daysToMonthDay(int days) {

		if (days > 0 && days <= 31) {
			this.day = days;
			this.month = 1;
		} else if (days > 31 && days <= 59) {
			this.day = days - 31;
			this.month = 2;
		} else if (days > 59 && days <= 90) {
			this.day = days - 59;
			this.month = 3;
		} else if (days > 90 && days <= 120) {
			this.day = days - 90;
			this.month = 4;
		} else if (days > 120 && days <= 151) {
			this.day = days - 120;
			this.month = 5;
		} else if (days > 151 && days <= 181) {
			this.day = days - 151;
			this.month = 6;
		} else if (days > 181 && days <= 212) {
			this.day = days - 181;
			this.month = 7;
		} else if (days > 212 && days <= 243) {
			this.day = days - 212;
			this.month = 8;
		} else if (days > 243 && days <= 273) {
			this.day = days - 243;
			this.month = 9;
		} else if (days > 273 && days <= 304) {
			this.day = days - 273;
			this.month = 10;
		} else if (days > 304 && days <= 334) {
			this.day = days - 304;
			this.month = 11;
		} else if (days > 334 && days <= 365) {
			this.day = days - 334;
			this.month = 12;
		} else {
			throw new IllegalArgumentException("Unexpected value: the days of years must be between 1 and 365.");
		}
	}

	private void daysToMonthDayLeapYear(int days) {

		if (days > 0 && days <= 31) {
			this.day = days;
			this.month = 1;
		} else if (days > 31 && days <= 60) {
			this.day = days - 31;
			this.month = 2;
		} else if (days > 60 && days <= 91) {
			this.day = days - 60;
			this.month = 3;
		} else if (days > 91 && days <= 121) {
			this.day = days - 91;
			this.month = 4;
		} else if (days > 121 && days <= 152) {
			this.day = days - 121;
			this.month = 5;
		} else if (days > 152 && days <= 182) {
			this.day = days - 152;
			this.month = 6;
		} else if (days > 182 && days <= 213) {
			this.day = days - 182;
			this.month = 7;
		} else if (days > 213 && days <= 244) {
			this.day = days - 213;
			this.month = 8;
		} else if (days > 244 && days <= 274) {
			this.day = days - 244;
			this.month = 9;
		} else if (days > 274 && days <= 305) {
			this.day = days - 274;
			this.month = 10;
		} else if (days > 305 && days <= 335) {
			this.day = days - 305;
			this.month = 11;
		} else if (days > 335 && days <= 366) {
			this.day = days - 335;
			this.month = 12;
		} else {
			throw new IllegalArgumentException("Unexpected value: the days of years must be between 1 and 366.");
		}
	}

	private int totalDays() {

		if (year % 400 == 0 || (year % 4 == 0 && year % 100 != 0)) {
			if (getMonth() == 1) {
				return day;
			} else if (getMonth() == 2) {
				return 31 + day;
			} else if (getMonth() == 3) {
				return 60 + day;
			} else if (getMonth() == 4) {
				return 91 + day;
			} else if (getMonth() == 5) {
				return 121 + day;
			} else if (getMonth() == 6) {
				return 152 + day;
			} else if (getMonth() == 7) {
				return 182 + day;
			} else if (getMonth() == 8) {
				return 213 + day;
			} else if (getMonth() == 9) {
				return 244 + day;
			} else if (getMonth() == 10) {
				return 274 + day;
			} else if (getMonth() == 11) {
				return 305 + day;
			} else
				return 335 + day;

		} else {
			if (getMonth() == 1) {
				return day;
			} else if (getMonth() == 2) {
				return 31 + day;
			} else if (getMonth() == 3) {
				return 59 + day;
			} else if (getMonth() == 4) {
				return 90 + day;
			} else if (getMonth() == 5) {
				return 120 + day;
			} else if (getMonth() == 6) {
				return 151 + day;
			} else if (getMonth() == 7) {
				return 181 + day;
			} else if (getMonth() == 8) {
				return 212 + day;
			} else if (getMonth() == 9) {
				return 243 + day;
			} else if (getMonth() == 10) {
				return 273 + day;
			} else if (getMonth() == 11) {
				return 304 + day;
			} else
				return 334 + day;
		}

	}

	@Override
	public String toString() {

		return String.format("%02d/%02d/%04d", getMonth(), getDay(), getYear());
	}

	public String toStringMonthFormatted() {

		return String.format("%s %02d, %02d", month == 1 ? "January"
				: getMonth() == 2 ? "February"
						: getMonth() == 3 ? "March"
								: getMonth() == 4 ? "April"
										: getMonth() == 5 ? "May"
												: getMonth() == 6 ? "June"
														: getMonth() == 7 ? "July"
																: getMonth() == 8 ? "August"
																		: getMonth() == 9 ? "September"
																				: getMonth() == 10 ? "October"
																						: getMonth() == 11 ? "November"
																								: "December",
				getDay(), getYear());
	}

	public String toStringDayAndYear() {

		return String.format("%02d %04d", totalDays(), getYear());
	}

}
