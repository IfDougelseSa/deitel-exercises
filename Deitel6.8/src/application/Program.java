package application;

import java.util.Scanner;

import entities.Client;

public class Program {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		while (sc.hasNext()) {
			sc.next();
			System.out.print("Enter client name: ");
			String name = sc.next();
			
			System.out.print("Enter hours: ");
			int hours = sc.nextInt();

			System.out.print("Enter minutes: ");
			int minutes = sc.nextInt();
			
			Client client = new Client(name, hours, minutes);
			
			System.out.println("Client name: " + client.getName());
			System.out.println("Client charges: " + client.calculateChargers());
		}

		sc.close();

	}

}
