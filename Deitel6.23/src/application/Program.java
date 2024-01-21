package application;

import java.util.Scanner;

public class Program {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter the first number: ");
		double a = sc.nextDouble();
		
		System.out.print("Enter the second number: ");
		double b = sc.nextDouble();
		
		System.out.print("Enter the third number: ");
		double c = sc.nextDouble();
		
		
		System.out.print("The minimum number is: " + minimum3(a, b, c));
		sc.close();

	}

	public static double minimum3(double a, double b, double c) {

		return Math.min(c, Math.min(a, b));

	}

}
