package application;

import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		// 2.26 (Múltiplos) Escreva um aplicativo que leia dois inteiros, além de
		// determinar se o primeiro é um múltiplo do segundo e imprimir o resultado.
		// [Dica: utilize o operador de resto.]

		// 2.26 (Multiple) Write an application that reads two integers, determines
		// whether the first is a multiple of the second and prints the result. [Hint:
		// use the remainder operator.]

		Scanner sc = new Scanner(System.in);

		System.out.print("Enter the first integer: ");
		int number = sc.nextInt();

		System.out.print("Enter the second integer: ");
		int number2 = sc.nextInt();

		sc.close();

		if (number2 % number == 0)
			System.out.println(number2 + " is a multiple of " + number + "!");
		else
			System.out.println(number2 + " is not a multiple of " + number + "!");

	}

}
