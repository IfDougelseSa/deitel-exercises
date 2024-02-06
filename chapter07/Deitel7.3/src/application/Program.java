package application;

public class Program {

	public static void main(String[] args) {

		/*
		 * a) Declare uma constante ARRAY_SIZE que é inicializada como 10. b) Declare um
		 * array com ARRAY_SIZE elementos do tipo double e os inicialize como 0. c)
		 * Referencie o elemento 4 do array. d) Atribua o valor 1.667 ao elemento 9 do
		 * array. e) Atribua o valor 3.333 ao elemento 6 do array. f) Some todos os
		 * elementos do array, utilizando uma instrução for. Declare a variável inteira
		 * x como uma variável de controle para o loop
		 */

		/*
		 * a) Declare an ARRAY_SIZE constant that is initialized to 10. b) Declare an
		 * array with ARRAY_SIZE elements of type double and initialize them to 0.
		 * 
		 * c) Reference element 4 of the array d) Assign the value 1,667 to element 9 of
		 * the array. e) Assign the value 3,333 to element 6 of the array. f) Add all
		 * the elements of the array, using a for statement. Declare the integer
		 * variable x as a control variable for the loop.
		 */
		
		//a)
		final int ARRAY_SIZE  = 10;
		
		//b)
		double[] array = new double[ARRAY_SIZE];
		
		//c)
		System.out.println(array[4]);
		
		//d)
		array[9] = 1667;
		
		//e)
		array[6] = 3333;
		
		//f)
		int sum = 0;
		for (int x = 0; x < array.length; x++) {
			sum += array[x];
		}
		
		System.out.println(sum);

	}

}
