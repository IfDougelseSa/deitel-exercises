package application;

import java.util.Scanner;

import entities.Account;

public class Program {

	public static void main(String[] args) {

		Account account1 = new Account("Jane Green", 50.00);
		Account account2 = new Account("John Blue", -7.53);

		System.out.printf("%s balance: $%.2f %n", account1.getName(), account1.getBalance());
		System.out.printf("%s balance: $%.2f %n%n", account2.getName(), account2.getBalance());

		Scanner sc = new Scanner(System.in);

		System.out.print("Enter deposit amount for account1: ");
		double deposit = sc.nextDouble();
		account1.deposit(deposit);

		System.out.printf("%nadding $%.2f to account1 balance %n%n", deposit);

		System.out.printf("%s balance: $%.2f %n", account1.getName(), account1.getBalance());
		System.out.printf("%s balance: $%.2f %n%n", account2.getName(), account2.getBalance());

		System.out.print("Enter deposit amount for account2: ");
		deposit = sc.nextDouble();

		System.out.printf("%nadding $%.2f to account2 balance %n%n", deposit);

		account2.deposit(deposit);

		System.out.printf("%s balance: $%.2f %n", account1.getName(), account1.getBalance());
		System.out.printf("%s balance: $%.2f %n%n", account2.getName(), account2.getBalance());

		// added according to the exercise
		System.out.print("Enter withdrawal for account1: ");
		double withdrawl = sc.nextDouble();
		System.out.printf("%nwithdrawl $%.2f from account1  %n%n", withdrawl);

		account1.withdrawl(withdrawl);
		System.out.printf("%s balance: $%.2f %n", account1.getName(), account1.getBalance());
		System.out.printf("%s balance: $%.2f %n%n", account2.getName(), account2.getBalance());

		System.out.print("Enter withdrawal for account2: ");
		withdrawl = sc.nextDouble();
		System.out.printf("%nwithdrawl $%.2f from account2 %n%n", withdrawl);

		account2.withdrawl(withdrawl);
		System.out.printf("%s balance: $%.2f %n", account1.getName(), account1.getBalance());
		System.out.printf("%s balance: $%.2f %n%n", account2.getName(), account2.getBalance());

		sc.close();
	}

}
