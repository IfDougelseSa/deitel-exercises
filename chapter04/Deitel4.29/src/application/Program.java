package application;

import java.util.Scanner;

public class Program {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int count = 1;
		int count2 = 1;

		System.out.print("Enter the square face: ");
		int face = sc.nextInt();

		while (count <= face) {

			while (count2 <= face) {
				System.out.print("*");
				++count2;
			}
			count2 = 1;
			++count;
			System.out.println();
		}

		sc.close();

	}

}
