package application;

import java.util.Scanner;

public class Program {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		invert(sc.nextInt());

		sc.close();

	}

	public static void invert(int number) {

		while (number != 0) {

			System.out.print(number % 10);
			number /= 10;

		}

	}

}
