package application;

import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		// 2.32 (Valores negativos, positivos e zero) Escreva um programa que insira
		// cinco números, além de determinar e imprimir quantos negativos,
		// quantos positivos e quantos zeros foram inseridos.

		// 2.32 (Negative, positive and zero values) Write a program that inputs five
		// numbers, in addition to determining and printing how many negatives,
		// how many positives and how many zeros were entered.

		int countNegatives = 0;
		int countPositives = 0;
		int countZeros = 0;

		Scanner sc = new Scanner(System.in);

		System.out.print("Enter the first number: ");
		int number1 = sc.nextInt();

		System.out.print("Enter the second number: ");
		int number2 = sc.nextInt();

		System.out.print("Enter the third number: ");
		int number3 = sc.nextInt();

		System.out.print("Enter the fourth number: ");
		int number4 = sc.nextInt();

		System.out.print("Enter the fifth number: ");
		int number5 = sc.nextInt();

		sc.close();

		if (number1 < 0)
			countNegatives = countNegatives + 1;
		else if (number1 > 0)
			countPositives = countPositives + 1;
		else
			countZeros = countZeros + 1;

		if (number2 < 0)
			countNegatives = countNegatives + 1;
		else if (number2 > 0)
			countPositives = countPositives + 1;
		else
			countZeros = countZeros + 1;

		if (number3 < 0)
			countNegatives = countNegatives + 1;
		else if (number3 > 0)
			countPositives = countPositives + 1;
		else
			countZeros = countZeros + 1;

		if (number4 < 0)
			countNegatives = countNegatives + 1;
		else if (number4 > 0)
			countPositives = countPositives + 1;
		else
			countZeros = countZeros + 1;

		if (number5 < 0)
			countNegatives = countNegatives + 1;
		else if (number5 > 0)
			countPositives = countPositives + 1;
		else
			countZeros = countZeros + 1;

		System.out.println("Total positives: " + countPositives);
		System.out.println("Total negatives: " + countNegatives);
		System.out.println("Total zeros: " + countZeros);
	}

}
