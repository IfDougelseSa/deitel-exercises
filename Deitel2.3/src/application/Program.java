package application;

import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		// a) Declare que as variáveis c, thisIsAVariable, q76354 e number serão do tipo
		// int.
		// a) Declare that the variables c, thisIsAVariable, q76354 e number will be of
		// type int.

		int c;
		int thisIsAVariable;
		int q76354;
		int number = 4;
		// int c, thisIsAVariable, q76354, number;

		// b) Solicite que o usuário insira um inteiro.
		// b) Prompt the user to enter an integer.

	
		System.out.println("Enter an integer: ");
	

		/*
		 * c) Insira um inteiro e atribua o resultado à variável int value. Suponha que
		 * a variável Scanner input possa ser utilizada para ler um valor digitado pelo
		 * usuário. c) Enter an integer and assign the result to int value variable.
		 * Suppose he Scanner input variable can be used to read a value entered by the
		 * user.
		 */
		Scanner sc = new Scanner(System.in);
		int value = sc.nextInt();
		sc.close();

		/*
		 * d) Imprima “This is a Java program" em uma linha na janela de comando. Use o
		 * método System.out.println d) Print “This is a Java program" on one line in
		 * the command window. Use the System.out.println method.
		 */
		
		System.out.println("This is a Java program");
		

		/*
		 * 
		 * e) Imprima “This is a Java program" em duas linhas na janela de comando. A
		 * primeira deve terminar com Java. Utilize o método System.out.printf e dois
		 * especificadores de formato %s. /
		 * 
		 * Print "This is a Java program" on two line in the command window. first must
		 * end with Java. Use the System.out.printf method and two %s format specifiers
		 */
		
		System.out.printf("%s%n%s%n", "This is a Java", "program");

		/*
		 * f) Se a variável number não for igual a 7, exiba “The variable number is not
		 * equal to 7".
		 * f) If the number variable is not equal to 7, display "The variable number is not
		 * equal to 7".
		 */
		
		if(number != 7) {
			System.out.println("The variable number is not equal to 7");
		}
		

	}

}
