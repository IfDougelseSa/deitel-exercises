package application;

import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		/*
		 * 2.16 (Comparando inteiros) Escreva um aplicativo que solicite ao usuário
		 * inserir dois inteiros, obtenha dele esses números e exiba o número maior
		 * seguido pelas palavras “is
		 * larger". Se os números forem iguais, imprima a mensagem “These numbers are equal"
		 * . Utilize as técnicas mostradas na Figura 2.15.
		 */

		/*
		 * 2.16 (Comparing Integers) Write an application that asks the user to enter
		 * two integers, gets those numbers from them, and displays the number larger
		 * followed by the words “is
		 * larger". If the numbers are equal, print the message “These numbers are equal"
		 * . Use the techniques shown in Figure 2.15
		 */

		Scanner sc = new Scanner(System.in);

		System.out.print("Enter the first integer: ");
		int first = sc.nextInt();

		System.out.print("Enter the second integer: ");
		int second = sc.nextInt();

		sc.close();

		if (first > second) {
			System.out.println(first + " is larger");
		} else if (first == second) {
			System.out.println("These number are equal");
		} else {
			System.out.println(second + " is larger");
		}

	}

}
