package application;

import entities.HealthProfile;

public class Program {

	public static void main(String[] args) {

		java.util.Locale.setDefault(java.util.Locale.US);
		java.util.Scanner sc = new java.util.Scanner(System.in);

		System.out.print("Enter your name: ");
		String name = sc.next();
		System.out.print("Enter your last name: ");
		String lastName = sc.next();
		System.out.print("Enter your gender: ");
		String gender = sc.next();
		System.out.print("Enter your year of birth: ");
		int year = sc.nextInt();
		System.out.print("Enter your month of birth: ");
		int month = sc.nextInt();
		System.out.print("Enter your day of birth: ");
		int day = sc.nextInt();
		System.out.print("Enter your height: ");
		double heigth = sc.nextDouble();
		System.out.print("Enter your wheight: ");
		double wheight = sc.nextDouble();

		sc.close();

		System.out.println();
		HealthProfile person = new HealthProfile(name, lastName, gender, year, month, day, heigth, wheight);

		System.out.printf(
				"Name: %s%nLast name: %s%nGender: %s%nAge: %d%nMaximum heart frequency: %d%nTarget heart frequency (50%%): %f%nTarget heart frequency (80%%): %f%nBMI: %s",
				person.getName(), person.getLastName(), person.getGender(), person.getAge(), person.maxHeartRates(),
				person.targetHeartRate50(), person.targetHeartRate80(), person.bmi());

	}

}
