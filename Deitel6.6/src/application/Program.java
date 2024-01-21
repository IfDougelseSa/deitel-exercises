package application;

import java.util.Scanner;

public class Program {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter radius: ");

		System.out.println(sphereVolume(sc.nextDouble()));
		sc.close();

	}

	public static double sphereVolume(double radius) {
		return (4.0 / 3.0) * Math.PI * Math.pow(radius, 3);
	}

}
