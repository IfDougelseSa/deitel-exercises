package utils;

public enum EmergencyStatus {

	WRITING_DOWN("Writing down."), ON_THE_WAY("On the way!"), FINISHED("Finished");

	private final String status;

	EmergencyStatus(String status) {
		this.status = status;
	}

	public String getStatus() {
		return status;
	}

}
