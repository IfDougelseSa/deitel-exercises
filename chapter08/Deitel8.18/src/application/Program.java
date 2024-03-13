package application;

import java.math.BigDecimal;

import entities.Account;

public class Program {

	public static void main(String[] args) {
		
		
		Account account = new Account("Dougas", new BigDecimal("10"));
		System.out.println(account.getBalance());
		account.deposit(new BigDecimal(20));
		System.out.println(account.getBalance());

	}

}
