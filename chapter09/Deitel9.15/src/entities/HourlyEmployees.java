package entities;

public class HourlyEmployees extends Employee {

	private int hours;
	private double wage;

	public HourlyEmployees(String firstName, String lastName, String socialSecurityNumber, int hours, double wage) {
		super(firstName, lastName, socialSecurityNumber);

		if (hours < 0 || hours > 168)
			throw new IllegalArgumentException("Hours must be >= 0.0 and < 168");

		if (wage < 0)
			throw new IllegalArgumentException("Wage must be >= 0.0");
		this.hours = hours;
		this.wage = wage;
	}

	public int getHours() {
		return hours;
	}

	public double getWage() {
		return wage;
	}

	public void setWage(double wage) {
		if (wage < 0)
			throw new IllegalArgumentException("Wage must be >= 0.0");
		this.wage = wage;
	}

	public double earnings() {
		double extraHours = 1;
		if (getHours() > 40) {
			extraHours = getHours() - 40;
		}
		extraHours *= 1.5;
		return extraHours * 40 * wage;
	}

	@Override
	public String toString() {

		return String.format("%s%n%s : %d%n%s : %.2f%n%s : %.2f", super.toString(), "hours", getHours(), "wage",
				getWage(), "earnings", earnings());
	}

}
