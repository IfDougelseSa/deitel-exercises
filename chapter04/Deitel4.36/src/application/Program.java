package application;

import java.util.Scanner;

public class Program {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int a = 0;
		int b = 0;
		int c = 0;

		System.out.println("is it a right triangle?");
		System.out.println();

		while (a == 0) {
			System.out.print("Enter first cateto value: ");
			a = sc.nextInt();

		}

		while (b == 0) {
			System.out.print("Enter second cateto value: ");
			b = sc.nextInt();
		}

		while (c == 0) {
			System.out.print("Enter hypotenuse value: ");
			c = sc.nextInt();
		}

		if (c * c == (a * a) + (b * b)) {
			System.out.println("its a right triangle");
		} else {
			System.out.println("its not a right triangle");
		}
		sc.close();

	}

}
