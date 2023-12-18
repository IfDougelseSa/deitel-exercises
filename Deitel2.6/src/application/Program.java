package application;

import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		// 2.6 Usando as instruções que você escreveu no Exercício 2.5, elabore um
		// programa completo que calcule e imprima o produto de três inteiros.
		// 2.6 Using the instructions you wrote in Exercisse 2.5, write a
		// complete program that calculates and print the product of three integers
		
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter the first integer: ");
		int x = sc.nextInt();
		
		System.out.print("Enter the second integer: ");
		int y = sc.nextInt();
		
		System.out.print("Enter the third integer: ");
		int z = sc.nextInt();
		
		sc.close();

		System.out.println("result: " + x * y * z);
	

	}

}
