package application;

import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
	
		//2.15 (Aritmética) Escreva um aplicativo que solicite ao usuário inserir dois inteiros, obtenha dele esses números e imprima sua soma, produto,
		//diferença e quociente (divisão). Utilize as técnicas mostradas na Figura 2.7.
		
		//2.15 (Arithmetic) Write an application that asks the user to enter two integers, get those numbers from him, and print their sum, product,
		//difference and quotient (division). Use the techniques shown in Figure 2.7
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter the first integer: ");
		int number1 =  sc.nextInt();
		
		System.out.print("Enter the second integer: ");
		int number2 = sc.nextInt();
		
		sc.close();
		
		
		System.out.println("sum: " + (number1 + number2));
		System.out.println("product: " + (number1 * number2));
		System.out.println("difference: " + (number1 - number2));
		System.out.println("division: " + (number1 / number2));
		

	}

}
