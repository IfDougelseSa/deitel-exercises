package application;

import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int number = 0;
		int[] numbers = new int[5];

		for (int i = 0; i < 5; i++) {

			while (number < 10 || number > 100) {
				System.out.print("Enter a number between 10 and 100: ");
				number = sc.nextInt();

				if (number >= 10 || number <= 100) {
					for (int j = 0; j < numbers.length; j++) {
						if (number == numbers[j]) {
							System.out.println("Equal number");
							number = 0;
							break;
						}
					}
				}
			} // end while

			System.out.print(number);
			System.out.println();
			numbers[i] = number;
			number = 0;
			for (int z : numbers) {
				if (z != 0)
					System.out.print(z + " ");
			}
			System.out.println();
		}
		sc.close();
	}

}
