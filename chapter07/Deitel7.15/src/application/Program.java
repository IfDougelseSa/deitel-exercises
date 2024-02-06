package application;

public class Program {

	public static void main(String[] args) {

		if (args.length > 1 || args.length < 0) {
			System.out.println("Error!");
		} else if (args.length == 1) {
			int[] array = new int[Integer.parseInt(args[0])];

			System.out.printf("%s%8s%n", "Index", "Value");

			for (int counter = 0; counter < array.length; counter++) {
				System.out.printf("%5d%8d%n", counter, array[counter]);
			}

		} else {
			int[] array = new int[10];

			System.out.printf("%s%8s%n", "Index", "Value");

			for (int counter = 0; counter < array.length; counter++) {
				System.out.printf("%5d%8d%n", counter, array[counter]);
			}
		}

	}

}
