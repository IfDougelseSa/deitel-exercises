package entities;

public class Tax {

	private String name;
	private double taxHome;
	private double taxEducation;
	private double taxTransport;

	public Tax(String name, double taxHome, double taxEducation, double taxTransport) {

		this.name = name;
		this.taxHome = taxHome;
		this.taxEducation = taxEducation;
		this.taxTransport = taxTransport;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getTaxHome() {
		return taxHome;
	}

	public void setTaxHome(double taxHome) {
		this.taxHome = taxHome;
	}

	public double getTaxEducation() {
		return taxEducation;
	}

	public void setTaxEducation(double taxEducation) {
		this.taxEducation = taxEducation;
	}

	public double getTaxTransport() {
		return taxTransport;
	}

	public void setTaxTransport(double taxTransport) {
		this.taxTransport = taxTransport;
	}

	public String fairTax() {

		return "Name: " + name + "\n" + "Home fee: " + taxHome * 0.23 + "\n" + "Education fee: " + taxEducation * 0.23
				+ "\n" + "Transport fee: " + taxTransport * 0.23 + "\n";
	}

}
