package test.entities;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.Test;

import entities.Time2;

public class TestTime2 {

	Time2 time = new Time2(13, 20, 15);

	@Test
	public void setHour() {

		time.setHour(1);
		
		assertEquals(time.getHour(), 1);
	}

	@Test
	public void setMinute() {

		time.setMinute(42);
		
		assertEquals(time.getMinute(), 42);
	}
	
	@Test
	public void setSecond() {

		time.setSecond(30);
		
		assertEquals(time.getSecond(), 30);
	}

}
