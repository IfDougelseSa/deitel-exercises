package application;

import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		//2.5 Escreva declarações, instruções ou comentários que realizem cada uma das tarefas a seguir:
		//2.5 Write statements, instructions, or comments that accomplish each of the following tasks:
		
		//a) Declare que um programa calculará o produto de três inteiros.
		//a) State that a program will calculate the product of three integers.
		
		//Programa que calcula o produto de três inteiros.
		//Program that calculates the product of three integers.
		
		//b) Crie um Scanner chamado input que leia valores a partir da entrada padrão.
		//b) Create a Scanner called input that read values from standard input.
		
		Scanner input = new Scanner(System.in);
		
	
		
		//c) Declare as variáveis x, y, z e result como tipo int.
		//c) Declare as variáveis x, y, z e result como tipo int.
		
		//int x, y, z, result;
		int x;
		int y;
		int z;
		int result;
		
		//d) Solicite que o usuário insira o primeiro inteiro.
		//d) Ask the user to enter the first integer
		
		System.out.println("Enter the first integer: ");
		
		//e) Leia o primeiro inteiro digitado pelo usuário e armazene-o na variável x.
		//e) Read the first type integer by the user and storage it in variable x.
		
		x = input.nextInt();
		
		//f) Solicite que o usuário insira o segundo inteiro.
		//f) Ahs the user to insert the second integer
		
		System.out.println("Enter the second integer: ");
		
		//g) Leia o segundo inteiro digitado pelo usuário e armazene-o na variável y.
		//g) Read the second integer entered by the user and store it in variable y.
		
		y = input.nextInt();
		
		//h) Solicite que o usuário insira o terceiro inteiro.
		//h) Ask the user to insert the third integer
		
		System.out.println("Enter the third integer: ");
		
		//i) Leia o terceiro inteiro digitado pelo usuário e armazene-o na variável z.
		//i) Read the third integer entered by the user and store it in variable z.
		
		z = input.nextInt();
		
		//j) Compute o produto dos três inteiros contidos nas variáveis x, y e z e atribua o resultado à variável result.
		//j) Compute the product of the three integers contained in the variables x, y and z and assign the result to the variable result.
		
		result = x * y * z;
		
		//k) Use System.out.printf para exibir a mensagem “Product is” seguida pelo valor da variável result.
		//k) Use System.out.printf to show the message "Product is" followed by the value of result variable
		
		System.out.printf("Product is %d", result);
	}

}
