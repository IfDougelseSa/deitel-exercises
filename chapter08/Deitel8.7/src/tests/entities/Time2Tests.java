package tests.entities;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import entities.Time2;
import tests.factory.Time2Factory;

public class Time2Tests {

	@BeforeEach
	void setUp() throws Exception {

	}

	@Test
	public void ticketShouldIncreaseOneSecond() {

		Time2 time = Time2Factory.createEmptyTime2();

		time.ticket();

		assertEquals(time.getSecond(), 1);
	}

	@Test
	public void incrementMinuteShouldIncreaseOneMinute() {

		Time2 time = Time2Factory.createEmptyTime2();

		time.incrementMinute();

		assertEquals(time.getMinute(), 1);
	}

	@Test
	public void incrementHourShouldIncreaseOneHour() {

		Time2 time = Time2Factory.createEmptyTime2();

		time.incrementHour();

		assertEquals(time.getHour(), 1);
	}

	@Test
	public void ticketShouldIncreaseOneSecondAndChangeDay() {

		Time2 time = Time2Factory.createSecondTime2();

		time.ticket();

		assertEquals(time.toString(), "12:00:00 AM");
	}

	@Test
	public void incrementMinuteShouldIncreaseOneMinuteAndChangeDay() {

		Time2 time = Time2Factory.createMinuteTime2();

		time.incrementMinute();

		assertEquals(time.toString(), "12:00:00 AM");
	}

	@Test
	public void incrementHourShouldIncreaseOneHourAndChangeDay() {

		Time2 time = Time2Factory.createHourTime2();

		time.incrementHour();

		assertEquals(time.toString(), "12:00:00 AM");
	}

}
