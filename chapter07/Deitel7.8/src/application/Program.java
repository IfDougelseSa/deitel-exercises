package application;

import java.lang.reflect.Array;
import java.security.SecureRandom;
import java.util.ArrayList;
import java.util.Arrays;

public class Program {

	private static final SecureRandom randomNumbers = new SecureRandom();

	public static void main(String[] args) {

		int[] f = { 1, 2, 3, 4, 5, 6, 7 };

		System.out.println(f[6]);

		int[] g = { 8, 8, 8, 8, 8 };

		double[] c = new double[100];

		for (int i = 0; i < c.length; i++) {
			c[i] = i;
		}

		double sum = 0;
		for (int i = 0; i < c.length; i++) {
			sum += c[i];
		}

		int[] a = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11 };
		int[] b = new int[36];

		System.arraycopy(a, 0, b, 0, 11);

		for (int i = 0; i < b.length; i++) {
			System.out.println(b[i]);
		}

		double[] w = new double[99];

		for (int i = 0; i < w.length; i++) {
			w[i] = randomNumbers.nextDouble(500);
		}

		Arrays.sort(w);

		System.out.println(w[0]);
		System.out.println(w[98]);

	}

}
