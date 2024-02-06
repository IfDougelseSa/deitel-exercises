package application;

import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter a radius: ");

		System.out.println("Circle area: " + circleArea(sc.nextDouble()));

		sc.close();

	}

	public static double circleArea(double radius) {
		return Math.PI * radius * radius;
	}

}
