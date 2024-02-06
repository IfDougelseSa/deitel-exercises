package application;

public class Program {

	public static void main(String[] args) {

		// Para remover de maneira geral a instrução breake, basta settar o contador
		// maior que o controle e colocar as instruções dentro de um if e else
		int count;

		for (count = 1; count <= 10; count++) {

			if (count == 5)
				count = 11;
			else
				System.out.printf("%d ", count);
		}

		count = 5;
		System.out.printf("%nBroke out of loop at count = %d%n", count);

	}

}
