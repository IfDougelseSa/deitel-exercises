package application;

public class Program {

	public static void main(String[] args) {

		long total = 1;

		for (int i = 1; i <= 20; i++) {
			total *= i;
			System.out.print(total + "\n");
		}

	}

	// to calculate 100 factorial its necessary change long to a bigger type.

}
