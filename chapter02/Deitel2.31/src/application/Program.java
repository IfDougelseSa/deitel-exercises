package application;

public class Program {

	public static void main(String[] args) {
		// 2.31 (Tabela de quadrados e cubos) Utilizando apenas as técnicas de
		// programação que aprendeu neste capítulo, escreva um aplicativo que
		// calcule os quadrados e cubos dos números de 0 a 10 e imprima os valores
		// resultantes em formato de tabela como a seguir:

		// 2.31 (Table of Squares and Cubes) Using only the programming techniques you
		// learned in this chapter, write an application that
		// calculate the squares and cubes of the numbers 0 to 10 and print the
		// resulting values ​​in table format as follows:

		System.out.printf("%s%10s%8s%n", "number", "square", "cube");
		System.out.printf(
				"%d%10d%10d%n%d%10d%10d%n%d%10d%10d%n%d%10d%11d%n%d%11d%10d%n%d%11d%11d%n%d%11d%11d%n%d%11d%11d%n%d%11d%11d%n%d%11d%11d%n%d%11d%11d%n",
				0, 0 * 0, 0 * 0 * 0, 1, 1 * 1, 1 * 1 * 1, 2, 2 * 2, 2 * 2 * 2, 3, 3 * 3, 3 * 3 * 3, 4, 4 * 4, 4 * 4 * 4,
				5, 5 * 5, 5 * 5 * 5, 6, 6*6, 6*6*6, 7, 7*7, 7*7*7, 8, 8*8, 8*8*8, 9, 9*9, 9*9*9, 10, 10*10, 10*10*10);

	}

}
