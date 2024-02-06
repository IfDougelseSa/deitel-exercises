package application;

import java.util.Scanner;

import entities.Triangle;

public class Program {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int a = 0;
		int b = 0;
		int c = 0;

		System.out.println("Triangle can exists?");
		System.out.println();

		while (a == 0) {
			System.out.print("Enter a value: ");
			a = sc.nextInt();

		}

		while (b == 0) {
			System.out.print("Enter b value: ");
			b = sc.nextInt();
		}

		while (c == 0) {
			System.out.print("Enter c value: ");
			c = sc.nextInt();
		}

		sc.close();

		Triangle teste = new Triangle(a, b, c);

	}

}
