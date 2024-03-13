package consts;

public enum TrafficLight {

	RED("40 seconds"), GREEN("30 seconds"), YELLOW("2 seconds");

	private final String duration;

	TrafficLight(String duration) {
		this.duration = duration;
	}

	public String getDuration() {
		return duration;
	}

}
