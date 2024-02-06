package application;

public class Program {

	public static void main(String[] args) {

		// Para substituir o continue bastar utilziar um if e else, sendo que, não
		// colocar nenhuma instrução dentro do if

		for (int count = 1; count <= 10; count++) {
			if (count == 5) {

			} else {
				System.out.printf("%d ", count);
			}

		}

		System.out.printf("%nUsed continue to skip printing 5%n");

	}

}
