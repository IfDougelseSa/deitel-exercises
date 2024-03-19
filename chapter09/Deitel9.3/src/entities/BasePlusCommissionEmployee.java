package entities;

public class BasePlusCommissionEmployee {
	private CommissionEmployee commissionEmploye;
	private double baseSalary;

	public BasePlusCommissionEmployee(CommissionEmployee commissionEmploye, double baseSalary) {
		this.commissionEmploye = commissionEmploye;
		this.baseSalary = baseSalary;

		if (baseSalary < 0.0)
			throw new IllegalArgumentException("Base salary must be >= 0.0");

		this.baseSalary = baseSalary;
	}

	public void setBaseSalary(double baseSalary) {
		if (baseSalary < 0.0)
			throw new IllegalArgumentException("Base salary must be >= 0.0");

		this.baseSalary = baseSalary;
	}

	public double getBaseSalary() {
		return baseSalary;
	}

	public double earnings() {
		return getBaseSalary() + commissionEmploye.earnings();
	}

	@Override
	public String toString() {
		return String.format("%s: %s %s%n%s: %s%n%s: %.2f%n%s: %.2f%n%s: %.2f", "commission employee",
				commissionEmploye.getFirstName(), commissionEmploye.getLastName(), "social security number",
				commissionEmploye.getSocialSecurityNumber(), "gross sales", commissionEmploye.getGrossSales(),
				"commission rate", commissionEmploye.getCommissionRate(), "base-salaried", getBaseSalary());
	}

}
