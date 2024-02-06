package application;

import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		// 2.24 (Inteiros maiores e menores) Escreva um aplicativo que leia cinco
		// inteiros, além de determinar e imprimir o maior e o menor inteiro
		// no grupo. Utilize somente as técnicas de programação que você aprendeu neste
		// capítulo.

		// 2.24 (Inteiros maiores e menores) Escreva um aplicativo que leia cinco
		// inteiros, além de determinar e imprimir o maior e o menor inteiro
		// no grupo. Utilize somente as técnicas de programação que você aprendeu neste
		// capítulo.

		int higherNumber;
		int smallestNumber;

		Scanner sc = new Scanner(System.in);

		System.out.print("Enter the first integer: ");
		int number1 = sc.nextInt();
		higherNumber = number1;
		smallestNumber = number1;

		System.out.print("Enter the second integer: ");
		int number2 = sc.nextInt();

		if (number2 > higherNumber)
			higherNumber = number2;
		if (number2 < smallestNumber)
			smallestNumber = number2;

		System.out.print("Enter the third integer: ");
		int number3 = sc.nextInt();

		if (number3 > higherNumber)
			higherNumber = number3;
		if (number3 < smallestNumber)
			smallestNumber = number3;

		System.out.print("Enter the fourth integer: ");
		int number4 = sc.nextInt();
		
		if (number4 > higherNumber)
			higherNumber = number4;
		if (number4 < smallestNumber)
			smallestNumber = number4;

		System.out.print("Enter the fifth integer: ");
		int number5 = sc.nextInt();
		
		if (number5 > higherNumber)
			higherNumber = number5;
		if (number5 < smallestNumber)
			smallestNumber = number5;

		sc.close();
		
		System.out.println("Higher number: " + higherNumber);
		System.out.println("smallest number: " + smallestNumber);

	}
}
