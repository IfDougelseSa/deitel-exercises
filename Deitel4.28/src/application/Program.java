package application;

public class Program {

	public static void main(String[] args) {

		int x = 5;
		int y = 8;

		// a)
		if (y == 8)
			if (x == 5)
				System.out.println("@@@@@");
			else
				System.out.println("#####");
		System.out.println("$$$$$");
		System.out.println("&&&&&");

		System.out.println();

		// b)
		if (y == 8)
			if (x == 5)
				System.out.println("@@@@@");
			else {
				System.out.println("#####");
				System.out.println("$$$$$");
				System.out.println("&&&&&");
			}

		System.out.println();

		// c)

		if (y == 8)
			if (x == 5)
				System.out.println("@@@@@");
			else {
				System.out.println("#####");
				System.out.println("$$$$$");
				System.out.println("&&&&&");
			}

		System.out.println();

		// d)

		x = 5;
		y = 7;

		if (y == 8) {
			if (x == 5)
				System.out.println("@@@@@");
		}

		else {
			System.out.println("#####");
			System.out.println("$$$$$");
			System.out.println("&&&&&");
		}



	}

}
