package application;

import java.util.Scanner;

public class Program {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.print("Enter four points separeted by space: ");

		System.out.println(distance(sc.nextDouble(), sc.nextDouble(), sc.nextDouble(), sc.nextDouble()));

		sc.close();

	}

	public static double distance(double x1, double y1, double x2, double y2) {

		return Math.sqrt(Math.pow(x2 - x1, 2) - Math.pow(y2 - y1, 2));
	}

}
