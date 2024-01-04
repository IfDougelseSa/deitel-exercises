package application;

public class Program {

	public static void main(String[] args) {

		int spaces = 10;
		int astheriscs = 1;

		for (int i = 1; i <= 5; i++) {

			for (int j = 1; j <= spaces; j++) {
				System.out.print(" ");
			}

			for (int w = 1; w <= astheriscs; w++) {
				System.out.print("*");

			}
			spaces -= 1;
			astheriscs += 2;
			System.out.println();
		}

		spaces = 7;
		astheriscs = 7;

		for (int i = 1; i <= 5; i++) {

			for (int j = 1; j <= spaces; j++) {
				System.out.print(" ");
			}

			for (int w = 1; w <= astheriscs; w++) {
				System.out.print("*");

			}
			spaces += 1;
			astheriscs -= 2;
			System.out.println();
		}

	}

}
