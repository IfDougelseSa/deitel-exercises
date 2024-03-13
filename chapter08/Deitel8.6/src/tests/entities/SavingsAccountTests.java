package tests.entities;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.math.BigDecimal;

import org.junit.jupiter.api.Test;

import entities.SavingsAccount;

public class SavingsAccountTests {

	@Test
	public void calculateMonthlyInterestShouldAddFees() {

		SavingsAccount account = new SavingsAccount(new BigDecimal(50));

		account.calculateMonthlyInterest();

		assertEquals(account.getSavingsBalance().doubleValue(), 50.1667);
	}
	
	@Test
	public void modifyInterestRateShouldModifyAnnualInterestRate() {
		
		SavingsAccount.modifyInterestRate(new BigDecimal(0.05));
		
		assertEquals(SavingsAccount.getAnnualInterestRate().doubleValue(), 0.05);
	}

}
