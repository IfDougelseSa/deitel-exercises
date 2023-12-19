package entities;

import java.time.LocalDate;
import java.time.Period;

public class HealthProfile {

	private String name;
	private String lastName;
	private String gender;
	private int year;
	private int month;
	private int day;
	private double height;
	private double wheigth;

	public HealthProfile() {

	}
	
	

	public HealthProfile(String name, String lastName, String gender, int year, int month, int day, double height,
			double wheigth) {

		this.name = name;
		this.lastName = lastName;
		this.gender = gender;
		this.year = year;
		this.month = month;
		this.day = day;
		this.height = height;
		this.wheigth = wheigth;
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

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
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

	public double getHeight() {
		return height;
	}

	public void setHeight(double height) {
		this.height = height;
	}

	public double getWheigth() {
		return wheigth;
	}

	public void setWheigth(double wheigth) {
		this.wheigth = wheigth;
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

	public String bmi() {
		double bmi = wheigth / (height * height);

		if (bmi < 18.5) {
			return "Thiness | obesity degree 0";
		} else if (bmi <= 24.9)
			return "Normal | obesity degree 0";
		else if (bmi <= 29.9)
			return "Overweight | obesity degree 1";
		else if (bmi <= 39.9)
			return "Obesity | obesity degree 2";
		else
			return "Severe obesity | obesity degree 3";

	}
}
