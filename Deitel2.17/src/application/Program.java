package application;

import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		/*
		 * 2.17 (Aritmética, menor e maior) Escreva um aplicativo que insira três
		 * inteiros digitados pelo usuário e exiba a soma, média, produto e os números
		 * menores e maiores. Utilize as técnicas mostradas na Figura 2.15. [Observação:
		 * o cálculo da média neste exercício deve resultar em uma representação de
		 * inteiro. Assim, se a soma dos valores for 7, a média deverá ser 2, não
		 * 2,3333...]
		 */

		/*
		 * 2.17 (Arithmetic, minor and major) Write an application that inputs three
		 * integers entered by the user and displays the sum, average, product, and the
		 * smaller and larger numbers. Use the techniques shown in Figure 2.15. [Note:
		 * Calculating the average in this exercise should result in an integer
		 * representation. So, if the sum of the values ​​is 7, the average should be 2,
		 * not 2.3333...]
		 */
		
		Scanner sc =  new Scanner(System.in);
		
		System.out.print("Enter the first integer: ");
		int first = sc.nextInt();
		
		System.out.print("Enter the second integer: ");
		int second = sc.nextInt();
		
		System.out.print("Enter the third integer: ");
		int third = sc.nextInt();
		
		sc.close();
		
		System.out.println("sum: " + (first + second + third));
		System.out.println("average: " + ((first + second + third)/3));
		System.out.println("product: " + (first * second * third));
		
		if(first > second && first > third) {
			System.out.println(first + " is the biggest");
		} else if (second > first && second > third) {
			System.out.println(second +  " is the biggest");
		} else {
			System.out.println(third+  " is the biggest");
		}
		
		if(first < second && first < third) {
			System.out.println(first + " is the smallest");
		} else if (second < first && second < third) {
			System.out.println(second + " is the smallest");
		} else {
			System.out.println(third + " is the smallest");
		}
		
		

	}

}
