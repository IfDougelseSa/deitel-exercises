package application;

public class Program {

	public static void main(String[] args) {

		double tax = 1.04;
		double users = 1000000000;

		for (int i = 1; i <= 18; i++) {

			users *= tax;
			System.out.println(users);
		}

	}

}
