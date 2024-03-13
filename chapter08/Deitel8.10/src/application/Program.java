package application;

import consts.TrafficLight;

public class Program {

	public static void main(String[] args) {

		for (TrafficLight t : TrafficLight.values()) {
			System.out.println(t + " " + t.getDuration() + ".");
		}

	}

}
