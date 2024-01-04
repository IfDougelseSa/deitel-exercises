package application;

public class Program {

	public static void main(String[] args) {

		/*
		 * 5.3 Escreva uma instrução Java ou um conjunto de instruções Java para
		 * realizar cada uma das seguintes tarefas: a) Some os inteiros ímpares entre 1
		 * e 99 utilizando uma instrução for. Assuma que as variáveis de inteiro sum e
		 * count foram declaradas.Ï
		 */

		/*
		 * 5.3 Write a Java statement or set of Java statements to accomplish each of
		 * the following tasks: a) Add the odd integers between 1 and 99 using a for
		 * statement. Assume that the integer variables sum and count have been
		 * declared.
		 */

		int sum = 0;
		int count = 1;

		for (; count <= 99; count++) {

			if (count % 2 != 0) {
				sum += count;
			}
		}

		System.out.println(sum);

		/*
		 * b) Calcule o valor de 2.5 elevado à potência de 3, utilizando o método pow.
		 * b) Calculate the value of 2.5 raised to the power of 3, using the pow method.
		 */

		System.out.println(Math.pow(2.5, 3));

		/*
		 * c) Imprima os inteiros de 1 a 20, utilizando um loop while e a variável
		 * contadora i. Assuma que a variável i foi declarada, mas não foi inicializada.
		 * Imprima apenas cinco inteiros por linha. [Dica: utilize o cálculo i % 5.
		 * Quando o valor dessa expressão for 0, imprima um caractere de nova linha;
		 * caso contrário, imprima um caractere de tabulação. Assuma que esse código é
		 * um aplicativo. Utilize o método System.out.println () para imprimir o
		 * caractere de nova linha, e utilize o método System.out.print ('\t') para
		 * imprimir o caractere de tabulação.]
		 * 
		 * c) Print the integers from 1 to 20, using a while loop and the counter
		 * variable i. Assume that the variable i was declared, but was not initialized.
		 * Only print five integers per line. [Tip: use the calculation i % 5. When the
		 * value of this expression is 0, print a newline character; otherwise, print a
		 * tab character. Assume this code is an application. Use the
		 * System.out.println() method to print the newline character, and use
		 * System.out.print('\t') method to print the tab character.]
		 */

		int i = 1;
		while (i <= 20) {

			System.out.print(i);
			if (i % 5 == 0) {
				System.out.println();
			} else {
				System.out.print('\t');
			}
			i++;
		}

		/*
		 * d) Repita a parte (c) utilizando uma instrução for. d) Repeat part (c) using
		 * a for statement.
		 */
		
		System.out.println();
		System.out.println();

		for (int w = 1; w <= 20; w++) {
			System.out.print(w);
			if (w % 5 == 0) {
				System.out.println();
			} else {
				System.out.print('\t');
			}
		}
	}

}
