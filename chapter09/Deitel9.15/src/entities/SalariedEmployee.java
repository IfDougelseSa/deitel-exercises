package entities;

public class SalariedEmployee extends Employee {

	private double fixSalary;

	public SalariedEmployee(String firstName, String lastName, String socialSecurityNumber, double fixSalary) {
		super(firstName, lastName, socialSecurityNumber);

		if (fixSalary < 0.0)
			throw new IllegalArgumentException("Fix salary must be >= 0.0");

		this.fixSalary = fixSalary;
	}

	public double getFixSalary() {
		return fixSalary;
	}

	public void setFixSalary(double fixSalary) {
		this.fixSalary = fixSalary;
	}

	@Override
	public String toString() {
		return String.format("%s%n%s : %.2f", super.toString(), "Fix salsary", getFixSalary());
	}

}
