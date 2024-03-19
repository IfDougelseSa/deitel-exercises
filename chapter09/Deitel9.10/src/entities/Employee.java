package entities;

public class Employee {

	private String name;
	private String lastName;
	private String socialSecurity;

	public Employee(String name, String lastName, String socialSecurity) {

		this.name = name;
		this.lastName = lastName;
		this.socialSecurity = socialSecurity;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getSocialSecurity() {
		return socialSecurity;
	}

	public void setSocialSecurity(String socialSecurity) {
		this.socialSecurity = socialSecurity;
	}

	@Override
	public String toString() {

		return String.format("Name: %s%nLast name: %s%nSocial security: %s", getName(), getLastName(),
				getSocialSecurity());
	}

}
