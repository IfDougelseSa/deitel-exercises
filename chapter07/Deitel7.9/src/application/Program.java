package application;

import java.util.Scanner;

public class Program {

	public static void main(String[] args) {

		// a)
		int[][] t = new int[2][3];

		// b) 2
		// c) 3
		// d) 6

		// e)
		int j = 0;
		for (int i = 0; i <= 2; i++) {
			System.out.println(t[j][i]);
		}

		// f)
		j = 1;
		for (int i = 0; i < 2; i++) {
			System.out.println(t[i][j]);
		}

		// g)
		t[0][1] = 0;

		// h)
		t[0][0] = 0;
		t[0][1] = 0;
		t[0][2] = 0;
		t[1][0] = 0;
		t[1][1] = 0;
		t[1][2] = 0;

		// i)
		for (int i = 0; i < t.length; i++) {
			for (int z = 0; z < t[i].length; z++) {
				t[i][z] = 0;
			}
		}

		// j)
		Scanner sc = new Scanner(System.in);
		for (int i = 0; i < t.length; i++) {
			for (int z = 0; z < t[i].length; z++) {
				t[i][z] = sc.nextInt();
			}
		}
		sc.close();

		// k)
		int lowValue = t[0][0];
		for (int i = 0; i < t.length; i++) {
			for (int z = 0; z < t[i].length; z++) {
				if (t[i][z] < lowValue) {
					lowValue = t[i][z];
				}
			}
		}

		System.out.println(lowValue);

		// i)
		System.out.println();
		System.out.printf("%d %d %d", t[0][0], t[0][1], t[0][2]);

		// m)
		int sum = t[0][2] + t[1][2];

		// n)
		System.out.println();
		System.out.printf("  %d   %d   %d%n", 1, 2, 3);
		int q = 0;
		for (int i = 0; i < t.length; i++) {
			for (int z = 0; z < t[i].length; z++) {
				System.out.print(q);
				System.out.printf(" %d", t[i][z]);

			}
			System.out.println();
			q++;
		}
	}

}
