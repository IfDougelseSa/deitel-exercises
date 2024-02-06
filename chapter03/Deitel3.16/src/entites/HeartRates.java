package entites;

import java.time.LocalDate;
import java.time.Period;

public class HeartRates {
	
	private String name;
	private String lastName;
	private int year;
	private int month;
	private int day;
	
	
	public HeartRates() {
		
	}


	public HeartRates(String name, String lastName, int year, int month, int day) {
		this.name = name;
		this.lastName = lastName;
		this.year = year;
		this.month = month;
		this.day = day;
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


	public int getYear() {
		return year;
	}


	public void setYear(int year) {
		this.year = year;
	}


	public int getMonth() {
		return month;
	}


	public void setMonth(int month) {
		this.month = month;
	}


	public int getDay() {
		return day;
	}


	public void setDay(int day) {
		this.day = day;
	}
	
	public int getAge() {
		LocalDate d01 = LocalDate.of(year, month, month);
		return Period.between(d01, LocalDate.now()).getYears();
	}
	
	public int maxHeartRates() {
		return 220 - getAge();
	}
	
	public double targetHeartRate50() {
		return maxHeartRates() * 0.5;
	}
	
	public double targetHeartRate80() {
		return maxHeartRates() * 0.8;
	}
}
