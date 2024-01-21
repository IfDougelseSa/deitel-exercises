package application;

import java.security.SecureRandom;

public class Program {

	public static void main(String[] args) {

		int n;

		n = 1 + randomNumbers.nextInt(2);
		System.out.println(n);

		n = 1 + randomNumbers.nextInt(100);
		System.out.println(n);

		n = randomNumbers.nextInt(10);
		System.out.println(n);

		n = 1000 + randomNumbers.nextInt(112);
		System.out.println(n);

		n = -1 + randomNumbers.nextInt(3);
		System.out.println(n);

		n = -3 + randomNumbers.nextInt(15);
		System.out.println(n);

	}

	private static final SecureRandom randomNumbers = new SecureRandom();

}
