package entities;

public class Client {

	private String name;
	private int hours;
	private int minutes;

	public Client(String name, int hours, int minutes) {

		this.name = name;
		this.hours = hours;
		this.minutes = minutes;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getHours() {
		return hours;
	}

	public void setHours(int hours) {
		this.hours = hours;
	}

	public int getMinutes() {
		return minutes;
	}

	public void setMinutes(int minutes) {
		this.minutes = minutes;
	}

	public double calculateChargers() {
		int totalMinutes = hours * 60 + minutes;
		double tax = 3;

		if (totalMinutes > 180 && totalMinutes <= 240) {
			tax += 0.5;
		} else if (totalMinutes > 240 && totalMinutes <= 300) {
			tax += 1;
		} else if (totalMinutes > 300 && totalMinutes <= 360) {
			tax += 1.5;
		} else if (totalMinutes > 360 && totalMinutes <= 420) {
			tax += 2;
		} else if (totalMinutes > 420 && totalMinutes <= 480) {
			tax += 2.5;
		} else if (totalMinutes > 480 && totalMinutes <= 540) {
			tax += 3;
		} else if (totalMinutes > 540 && totalMinutes <=600) {
			tax += 3.5;
		} else if (totalMinutes > 600 && totalMinutes <= 660) {
			tax += 4;
		} else if (totalMinutes > 660 && totalMinutes <= 720) {
			tax += 4.5;
		} else if (totalMinutes > 720 && totalMinutes <= 780) {
			tax += 5;
		} else if (totalMinutes > 780 && totalMinutes <= 840) {
			tax += 5.5;
		} else if (totalMinutes > 840 && totalMinutes <= 900) {
			tax += 6;
		} else if (totalMinutes > 900 && totalMinutes <= 960) {
			tax += 6.;
		} else if (totalMinutes > 960 && totalMinutes <= 1020) {
			tax += 7;
		} else if (totalMinutes > 1020 && totalMinutes <= 1440) {
			tax = 10;
		}

		return tax;
	}

}
