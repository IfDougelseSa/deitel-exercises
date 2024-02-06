package application;

public class Program {

	public static void main(String[] args) {

		for (int i = 2; i < 10000; i++) {
			if (isPrime(i)) {
				System.out.println(i);
			}
		}

	}

	public static boolean isPrime(int number) {

		for (int i = 2; i <= number / 2; i++)
			if (number % i == 0)
				return false;
		return true;

	}

	public static boolean isPrime2(int n) {

		for (int z = 2; z <= Math.sqrt(n); z++)
			if (n % z == 0)
				return false;
		return true;

	}

}
