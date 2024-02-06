package application;

public class Program {

	/*
	 * 
	 * O que há de errado com a instrução while a seguir?
	 * 
	 * 
	 * Whats wrong with the following while statement while (z >= 0) sum += z;
	 */

	public static void main(String[] args) {
		
		//it was missing add some number to z.

		int z = 1;
		int sum = 0;
		while (z >= 0) {
			sum += z;
			z++;
		}

	}

}
