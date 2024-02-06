package application;

import java.util.Scanner;

import entities.Account;

public class Program {

	public static void main(String[] args) {

		Account account1 = new Account("Jane Green", 50.00);
		Account account2 = new Account("John Blue", -7.53);

		account1.displayAccount();
		account2.displayAccount();

		Scanner sc = new Scanner(System.in);

		System.out.print("Enter deposit amount for account1: ");
		double depositAmount = sc.nextDouble();
		System.out.printf("%nadding %.2f to account1 balance%n%n", depositAmount);
		account1.deposit(depositAmount);

		account1.displayAccount();
		account2.displayAccount();

		System.out.print("Enter deposit amount for account2: ");
		depositAmount = sc.nextDouble();
		System.out.printf("%nadding %.2f to account2 balance%n%n", depositAmount);
		account2.deposit(depositAmount);

		account1.displayAccount();
		account2.displayAccount();
		sc.close();

	}

}
