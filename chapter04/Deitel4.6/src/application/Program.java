package application;

public class Program {

	/*
	 * 
	 * Combine as instruções escritas no Exercício 4.5 em um aplicativo Java que
	 * calcula e imprime a soma dos inteiros de 1 a 10. Utilize a instrução while
	 * para fazer loop pelas instruções de cálculo e incremento. O loop deve
	 * terminar quando o valor de x tornar-se 11.
	 * 
	 * 
	 * Combine the instructions written in Exercise 4.5 into a Java application that
	 * calculates and prints the sum of integers 1 through 10. Use the while
	 * statement to loop through the calculation and increment instructions. The
	 * loop should end when the value of x becomes 11.
	 */

	public static void main(String[] args) {
		int sum = 0;
		int x = 1;

		while (x <= 10) {

			sum += x;
			x++;
		}
		System.out.println("A soma é: " + sum);

	}

}
