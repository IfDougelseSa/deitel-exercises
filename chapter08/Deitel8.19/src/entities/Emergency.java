package entities;

import utils.EmergencyStatus;

public class Emergency {

	private String name;
	private int number;
	private String address;
	private String date;
	private String hour;
	private String emergency;
	private EmergencyStatus emergencyStatus;

	public Emergency(String name, int number, String address, String date, String hour, String emergency,
			EmergencyStatus emergencyStatus) {
		this.name = name;
		this.number = number;
		this.address = address;
		this.date = date;
		this.hour = hour;
		this.emergency = emergency;
		this.emergencyStatus = emergencyStatus;
	}

	public String getName() {
		return name;
	}

	public int getNumber() {
		return number;
	}

	public void setNumber(int number) {
		this.number = number;
	}

	public String getAddress() {
		return address;
	}

	public String getDate() {
		return date;
	}

	public String getHour() {
		return hour;
	}

	public String getEmergency() {
		return emergency;
	}

	public void setEmergency(String emergency) {
		this.emergency = emergency;
	}

	public EmergencyStatus getEmergencyStatus() {
		return emergencyStatus;
	}

	public void setEmergencyStatus(EmergencyStatus emergencyStatus) {
		this.emergencyStatus = emergencyStatus;
	}

	public String getEmergencyStatusString() {
		return emergencyStatus.getStatus();
	}

	@Override
	public String toString() {

		return String.format(
				"Name: %s%nNumber: %d%nAddress: %s%nDate: %s%nHour: %s%nEmergency: %s%nEmergency status: %s", getName(),
				getNumber(), getAddress(), getDate(), getHour(), getEmergency(), getEmergencyStatusString());
	}
}
