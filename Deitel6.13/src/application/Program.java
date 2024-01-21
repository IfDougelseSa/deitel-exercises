package application;

import java.security.SecureRandom;

public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int n;

		n = 2 + 2 * randomNumbers.nextInt(5);
		System.out.println(n);

		n = 3 + 2 * randomNumbers.nextInt(5);
		System.out.println(n);

		n = 6 + 4 * randomNumbers.nextInt(5);
		System.out.println(n);

	}

	private static final SecureRandom randomNumbers = new SecureRandom();
}
