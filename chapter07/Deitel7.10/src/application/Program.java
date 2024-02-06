package application;

import java.util.Scanner;

import entities.Seller;

public class Program {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.print("Enter total sellers: ");
		int totalSellers = sc.nextInt();
		Seller[] sellers = new Seller[totalSellers];
		int a = 0, b = 0, c = 0, d = 0, e = 0, f = 0, g = 0, h = 0, i = 0, count = 1;

		for (int j = 0; j < sellers.length; j++) {
			System.out.print("Enter seller and sales separeted by spaces: " + (count++) + ": ");
			sellers[j] = new Seller(sc.next(), sc.nextInt());

			if (sellers[j].comission() >= 200 && sellers[j].comission() < 300) {
				a++;
			}
			if (sellers[j].comission() >= 300 && sellers[j].comission() < 400) {
				b++;
			}
			if (sellers[j].comission() >= 400 && sellers[j].comission() < 500) {
				c++;
			}
			if (sellers[j].comission() >= 500 && sellers[j].comission() < 600) {
				d++;
			}
			if (sellers[j].comission() >= 600 && sellers[j].comission() < 700) {
				e++;
			}
			if (sellers[j].comission() >= 700 && sellers[j].comission() < 800) {
				f++;
			}
			if (sellers[j].comission() >= 800 && sellers[j].comission() < 900) {
				g++;
			}
			if (sellers[j].comission() >= 900 && sellers[j].comission() < 1000) {
				h++;
			}
			if (sellers[j].comission() >= 1000) {
				i++;
			}

			System.out.println(sellers[j].getName() + " comission: " + sellers[j].comission());
		}

		sc.close();

		int[] sales = { a, b, c, d, e, f, g, h, i };
		table(sales);

	}

	public static void table(int[] sales) {

		int w = 200;
		int z = 299;

		for (int j = 0; j < sales.length; j++) {

			if (z == 1099) {
				System.out.print("$1.000++ ");
			} else {
				System.out.printf("$%d-%d ", w, z);
			}

			w += 100;
			z += 100;

			for (int v = 0; v < sales[j]; v++)
				System.out.print("*");
			System.out.println();
		}
	}

}
