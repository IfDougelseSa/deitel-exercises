package application;

public class Program {

	public static void main(String[] args) {

		System.out.println(product(1, 2, 3, 4));
		System.out.println(product(2, 2, 2, 2));
		System.out.println(product(3, 3, 3));
		System.out.println(product(2, 3));

	}

	public static int product(int... numbers) {

		int result = 1;

		for (int i = 0; i < numbers.length; i++) {
			result *= numbers[0];
		}

		return result;
	}

}
