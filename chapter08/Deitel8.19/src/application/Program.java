package application;

import java.time.Instant;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;

import entities.Emergency;
import utils.EmergencyStatus;

public class Program {

	public static void main(String[] args) {

		DateTimeFormatter date = DateTimeFormatter.ofPattern("dd/MM/yyyy").withZone(ZoneId.systemDefault());
		DateTimeFormatter hour = DateTimeFormatter.ofPattern("HH:mm").withZone(ZoneId.systemDefault());
		Instant instant = Instant.now();
		Emergency emergency = new Emergency("Douglas", 1234542, "10732 Research Ave, Austin, TX, 78759, USA;",
				date.format(instant), hour.format(instant), "assault", EmergencyStatus.ON_THE_WAY);
		
		System.out.println(emergency);

	}

}
