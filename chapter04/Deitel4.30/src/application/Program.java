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

		while (number < 10000 || number > 99999) {
			System.out.print("Enter a number with five digits: ");
			number = sc.nextInt();
		}

		sc.close();

		firstNumber = number / 10000;
		secondNumber = number / 1000 % 10;
		thirdNumber = number / 100 % 10;
		fourthNumber = number % 100 / 10;
		fifthNumber = number % 10;

		String newNumber = String.valueOf(fifthNumber) + String.valueOf(fourthNumber) + String.valueOf(thirdNumber)
				+ String.valueOf(secondNumber) + String.valueOf(firstNumber);

		if (number == Integer.parseInt(newNumber)) {
			System.out.printf("%d is a palindrome", number);
		} else {
			System.out.printf("%d is not a palindrome", number);
		}

	}

}
