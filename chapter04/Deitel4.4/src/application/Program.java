package application;

public class Program {

	public static void main(String[] args) {
		/*
		 * Escreva instruções Java para realizar cada uma das seguintes tarefas: a)
		 * Utilize uma instrução para atribuir a soma de x e y a z, em seguida,
		 * incremente x por 1. b) Teste se a variável contador é maior do que 10. Se
		 * for, imprima "Contador é maior que 10". c) Utilize uma instrução para
		 * decrementar a variável x por 1, então subtraia-o da variável total e armazene
		 * o resultado na variável total. d) Calcule o resto após q ser dividido por
		 * divisor e atribua o resultado a q. Escreva essa instrução de duas maneiras
		 * diferentes.
		 */
		/*
		 * Write Java statements to perform each of the following tasks: a) Use a
		 * statement to assign the sum of x and y to z, then increment x by 1. b) Test
		 * whether the counter variable is greater than 10. If so, print
		 * "Counter is greater than 10". c) Use an instruction to decrement the variable
		 * x by 1, then subtract it from the total variable and store the result in the
		 * variable total. d) Calculate the remainder after q is divided by divisor and
		 * assign the result to q. Write this statement in two different ways.
		 */

		int x = 1, y = 2, z = 3, cont = 1;
		z = x + y;
		x++;

		while (cont <= 10) {
			System.out.println("Contador é maior que 10");
		}

		--x;
		int total = 10;
		total -= x;

		double q = 10;
		double division = 4;
		q = q % division;
		q %= division;

	}

}
