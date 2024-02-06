package application;

public class Program {

	public static void main(String[] args) {

		int amount;
		int principal = 1000;
		double rate = 0.05;

		System.out.printf("%s%20s %n", "Year", "Amount on deposit");

		for (int year = 1; year <= 10; ++year) {
			
			

			amount = (int) (principal * Math.pow(1.0 + rate, year)) * 1000;

			System.out.printf("%4d%,20d%n", year, amount);
		}

	}

}
