package application.entities;

public class Employee {

	private String firstName;
	private String secondName;
	private double salary;

	public Employee(String firstName, String secondName, double salary) {

		this.firstName = firstName;
		this.secondName = secondName;
		if (salary > 0) {
			this.salary = salary;
		}
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getSecondName() {
		return secondName;
	}

	public void setSecondName(String secondName) {
		this.secondName = secondName;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	public double anualSalary() {
		return 12 * salary;
	}
	
	public void increaseSalary(double increase) {
		salary *= increase;
	}

}
