package application;

import java.util.Scanner;

public class Program {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int number = 0;

		int firstNumber = 0;
		int secondNumber = 0;
		int thirdNumber = 0;
		int fourthNumber = 0;
		int fifthNumber = 0;

		for (int i = 1; i <= 5; i++) {
			while (number <= 0 || number > 30) {
				System.out.print("Enter a number between 1 and 30: ");
				number = sc.nextInt();

				if (number <= 0 || number > 30) {
					System.out.println();
					System.out.println("The number must be between 1 and 30!");
					System.out.println();
				} else {
					switch (i) {
					case 1:
						firstNumber = number;
						break;
					case 2:
						secondNumber = number;
						break;
					case 3:
						thirdNumber = number;
						break;
					case 4:
						fourthNumber = number;
						break;
					case 5:
						fifthNumber = number;
						break;
					}
				}

			}
			number = 0;

		}
		sc.close();
		
		System.out.println();
		System.out.println();
		
		for (int i = 1; i <= firstNumber; i++)
			System.out.print("*");
		System.out.println();

		for (int i = 1; i <= secondNumber; i++)
			System.out.print("*");
		System.out.println();

		for (int i = 1; i <= thirdNumber; i++)
			System.out.print("*");
		System.out.println();

		for (int i = 1; i <= fourthNumber; i++)
			System.out.print("*");
		System.out.println();

		for (int i = 1; i <= fifthNumber; i++)
			System.out.print("*");
		System.out.println();

	}
}
