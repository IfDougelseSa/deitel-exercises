package application;

import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		/*
		 * 2.30 (Separando os dígitos em um inteiro) Escreva um aplicativo que insira um
		 * número consistindo em cinco dígitos a partir do usuário, separe o número em
		 * seus dígitos individuais e imprima os dígitos separados uns dos outros por
		 * três espaços. Por exemplo, se o usuário digitar o número 42339, o programa
		 * deve imprimir 4 2 3 3 9 Suponha que o usuário insira o número correto de
		 * dígitos. O que acontece quando você insere um número com mais de cinco
		 * dígitos? O que acontece quando você insere um número com menos de cinco
		 * dígitos? [Dica: é possível fazer este exercício com as técnicas que aprendeu
		 * neste capítulo. Você precisará tanto das operações de divisão como das de
		 * resto para “selecionar” cada dígito.]
		 */

		/*
		 * 2.30 (Separating digits into an integer) Write an application that inputs a
		 * number consisting of five digits from the user, separate the number into its
		 * individual digits and print the digits separated from each other by three
		 * spaces. For example, if the user enter the number 42339, the program should
		 * print 4 2 3 3 9 Assume the user enters the correct number of digits. What
		 * happens when you enter a number with more than five digits? What happens when
		 * you enter a number with less than five digits? [Tip: You can do this exercise
		 * using the techniques you learned in this chapter. You will need both division
		 * and remainder operations to “select” each digit.]
		 */

		Scanner sc = new Scanner(System.in);

		System.out.print("Enter five digits: ");

		int digits = sc.nextInt();

		if (digits > 99999)
			System.out.println("Only five digits is allowed");
		else if (digits < 10000)
			System.out.println("Only five digits is allowed");
		else
			System.out.printf("%d   %d   %d   %d   %d", (digits / 10000), (digits / 1000 % 10), (digits % 1000 / 100),
					(digits % 100 / 10), (digits % 10));

		sc.close();
	}

}
