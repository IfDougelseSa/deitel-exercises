package application;

import java.math.BigDecimal;
import java.text.NumberFormat;

import entities.SavingsAccount;

public class Program {

	public static void main(String[] args) {

		SavingsAccount saver1 = new SavingsAccount(new BigDecimal("2000"));
		SavingsAccount saver2 = new SavingsAccount(new BigDecimal("3000"));

		System.out.printf("4%s rate%n%n", "%");
		System.out.printf("Account 1%nTotal saving amount: %s%nTotal fees: %s%nTotal after fees: %s%n%n",
				NumberFormat.getCurrencyInstance().format(saver1.getSavingsBalance().doubleValue()),
				NumberFormat.getCurrencyInstance().format(saver1.calculateMonthlyInterest()),
				NumberFormat.getCurrencyInstance().format(saver1.getSavingsBalance().doubleValue()));

		System.out.printf("Account 2%nTotal saving amount: %s%nTotal fees: %s%nTotal after fees: %s%n%n",
				NumberFormat.getCurrencyInstance().format(saver2.getSavingsBalance().doubleValue()),
				NumberFormat.getCurrencyInstance().format(saver2.calculateMonthlyInterest()),
				NumberFormat.getCurrencyInstance().format(saver2.getSavingsBalance().doubleValue()));

		SavingsAccount.modifyInterestRate(new BigDecimal(0.05));

		System.out.printf("5%s rate%n%n", "%");
		System.out.printf("Account 1%nTotal saving amount: %s%nTotal fees: %s%nTotal after fees: %s%n%n",
				NumberFormat.getCurrencyInstance().format(saver1.getSavingsBalance().doubleValue()),
				NumberFormat.getCurrencyInstance().format(saver1.calculateMonthlyInterest()),
				NumberFormat.getCurrencyInstance().format(saver1.getSavingsBalance().doubleValue()));

		System.out.printf("Account 2%nTotal saving amount: %s%nTotal fees: %s%nTotal after fees: %s%n%n",
				NumberFormat.getCurrencyInstance().format(saver2.getSavingsBalance().doubleValue()),
				NumberFormat.getCurrencyInstance().format(saver2.calculateMonthlyInterest()),
				NumberFormat.getCurrencyInstance().format(saver2.getSavingsBalance().doubleValue()));

	}

}
