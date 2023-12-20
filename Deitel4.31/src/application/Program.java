package application;

import java.util.Scanner;

public class Program {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int count = 0;
		int count2 = 1;
		int pow = 0;

		int number1 = 100;
		int number2 = 10;
		int total = 0;

		int separeteNumber;

		System.out.print("Enter a binary number: ");
		int number = sc.nextInt();
		int binaryNumber = number;

		while (number != 0) {

			number /= 10;
			count++;
		}

		while (count2 <= count) {
			if (count2 == 1) {
				separeteNumber = binaryNumber % 10;
			} else if (count2 == 2) {
				separeteNumber = binaryNumber % number1 / number2;
			} else {
				number1 *= 10;
				number2 *= 10;
				separeteNumber = binaryNumber % number1 / number2;

			}

			total += Math.pow((separeteNumber * 2), pow);

			pow++;
			count2++;

		}

		System.out.println(total);
		sc.close();

	}

}
