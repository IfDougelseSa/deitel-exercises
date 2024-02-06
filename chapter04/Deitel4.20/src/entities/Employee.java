package entities;

public class Employee {

	private String name;
	private int workedHours;
	private double hourSalary;

	public Employee() {

	}

	public Employee(String name, int workedHours, double hourSalary) {

		this.name = name;
		this.workedHours = workedHours;
		this.hourSalary = hourSalary;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getWorkedHours() {
		return workedHours;
	}

	public void setWorkedHours(int workedHours) {
		this.workedHours = workedHours;
	}

	public double getHourSalary() {
		return hourSalary;
	}

	public void setHourSalary(double hourSalary) {
		this.hourSalary = hourSalary;
	}

	public double totalSalary() {

		if (workedHours > 40) {
			return 40 * hourSalary + (hourSalary * 1.5 * (workedHours - 40));
			
		} else {
			return workedHours * hourSalary;
		}

	}

}
