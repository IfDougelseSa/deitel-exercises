package application;

import java.util.Scanner;

public class Program {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int count = 1;
		int number = 0;
		int firstLargest = 0;
		int secondLargest = 0;

		while (count <= 10) {

			System.out.print("Enter " + count + " number: ");
			number = sc.nextInt();

			if (number > secondLargest) {
				if (number > firstLargest) {
					firstLargest = number;
				} else {
					secondLargest = number;
				}
			}
			count++;
		}

		sc.close();
		
		System.out.println("First largest: " + firstLargest);
		System.out.println("Second largest " +  secondLargest);

	}

}
