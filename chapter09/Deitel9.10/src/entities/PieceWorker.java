package entities;

public class PieceWorker extends Employee {

	private String occupation;

	public PieceWorker(String name, String lastName, String socialSecurity, String occupation) {
		super(name, lastName, socialSecurity);
		this.occupation = occupation;
	}

	public String getOccupation() {
		return occupation;
	}

	public void setOccupation(String occupation) {
		this.occupation = occupation;
	}

	@Override
	public String toString() {
		return String.format("%s%n%s", super.toString(), getOccupation());
	}

}
