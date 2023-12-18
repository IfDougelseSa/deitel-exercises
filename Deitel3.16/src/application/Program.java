package application;

import entites.HeartRates;

public class Program {

	public static void main(String[] args) {

		java.util.Scanner sc = new java.util.Scanner(System.in);

		System.out.print("Enter your name: ");
		String name = sc.next();
		System.out.print("Enter your last name: ");
		String lastName = sc.next();
		System.out.print("Enter your year of birth: ");
		int year = sc.nextInt();
		System.out.print("Enter your month of birth: ");
		int month = sc.nextInt();
		System.out.print("Enter your day of birth: ");
		int day = sc.nextInt();

		sc.close();
		
		System.out.println();
		HeartRates person = new HeartRates(name, lastName, year, month, day);

		System.out.printf(
				"Name: %s%nLast name: %s%nAge: %d%nMaximum heart frequency: %d%nTarget heart frequency (50%%): %f%nTarget heart frequency (80%%): %f",
				person.getName(), person.getLastName(), person.getAge(), person.maxHeartRates(),
				person.targetHeartRate50(), person.targetHeartRate80());

	}

}
