package application;

public class Program {

	/*
	 * 
	 * Determine o valor das variáveis na instrução product *= x++; depois que o
	 * cálculo é realizado. Suponha que todas as variáveis sejam do tipo int e
	 * inicialmente tenham o valor 5
	 * 
	 * 
	 * Determine the value of the variables in the product *= x++; after the
	 * calculation is performed. Assume that all variables are of type int and
	 * initially have the value 5.
	 */

	public static void main(String[] args) {
		int product = 5;
		int x = 5;
		
		product *= x++;
		
		//product = 25
		//x = 6;

	}

}
