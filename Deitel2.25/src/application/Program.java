package application;

import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		/*
		 * 2.25 (Ímpar ou par) Escreva um aplicativo que leia um inteiro, além de
		 * determinar e imprimir se ele é ímpar ou par. [Dica: utilize o operador de
		 * resto. Um número par é um múltiplo de 2. Qualquer múltiplo de 2 deixa um
		 * resto 0 quando dividido por 2.]
		 */

		/*
		 * 2.25 (Odd or Even) Write an application that reads an integer and determines
		 * and prints whether it is odd or even. [Tip: use the operator otherwise. An
		 * even number is a multiple of 2. Any multiple of 2 leaves a remainder of 0
		 * when divided by 2.]
		 */

		Scanner sc = new Scanner(System.in);

		System.out.print("Enter an integer: ");
		int number = sc.nextInt();
		sc.close();
		
		if (number % 2 == 0)
			System.out.println(number + " is even!");
		else 
			System.out.println(number + " is odd!");
	}

}
