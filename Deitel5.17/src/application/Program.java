package application;

import java.util.Scanner;

public class Program {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int product = 0;
		int quantity = 0;
		double total1 = 0;
		double total2 = 0;
		double total3 = 0;
		double total4 = 0;
		double total5 = 0;

		System.out.printf("%s%n%s%n %s%n %s%n", "Enter the product and quantity sold. (type any key to continue)",
				"Type the end-of-file indicator to terminate input:",
				"On UNIX/Linux/Mac OS X type <Ctrl> d then press Enter", "On Windows type <Ctrl> z then press Enter");

		while (sc.hasNext()) {
			
			
			sc.next();

			System.out.println();
			System.out.print("Enter product number: ");
			product = sc.nextInt();

			System.out.print("Enter quantity sold: ");
			quantity = sc.nextInt();

			switch (product) {
			case 1:
				total1 += quantity * 2.98;
				break;
			case 2:
				total2 += quantity * 4.50;
				break;
			case 3:
				total3 += quantity * 9.98;
				break;
			case 4:
				total4 += quantity * 4.49;
				break;
			case 5:
				total5 += quantity * 6.87;
				break;

			}
			System.out.println();
			System.out.printf("%s%n%s%n %s%n %s%n", "Do you wanna insert one more product? (type any key to continue)",
					"Type the end-of-file indicator to terminate input:",
					"On UNIX/Linux/Mac OS X type <Ctrl> d then press Enter", "On Windows type <Ctrl> z then press Enter");

		}

		sc.close();

		System.out.println();
		System.out.println("Total product 1: " + total1);
		System.out.println("Total product 2: " + total2);
		System.out.println("Total product 3: " + total3);
		System.out.println("Total product 4: " + total4);
		System.out.println("Total product 5: " + total5);
	}

}
