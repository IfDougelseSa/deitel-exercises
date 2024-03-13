package entities;

import java.math.BigDecimal;
import java.math.MathContext;
import java.math.RoundingMode;

public class SavingsAccount {

	private static BigDecimal annualInterestRate = BigDecimal.valueOf(0.04);
	private final BigDecimal YEAR_MONTHS = new BigDecimal("12");
	MathContext mc = new MathContext(4, RoundingMode.HALF_UP);
	private BigDecimal savingsBalance;

	public SavingsAccount() {

	}

	public SavingsAccount(BigDecimal savingsBalance) {

		this.savingsBalance = savingsBalance;
	}

	public static BigDecimal getAnnualInterestRate() {
		return annualInterestRate;
	}

	public BigDecimal getSavingsBalance() {
		return savingsBalance;
	}

	public BigDecimal calculateMonthlyInterest() {

		BigDecimal fees = savingsBalance.multiply(annualInterestRate).divide(YEAR_MONTHS, mc);

		savingsBalance = savingsBalance.add(fees);

		return fees;

	}

	public static void modifyInterestRate(BigDecimal annualInterestRate) {

		SavingsAccount.annualInterestRate = annualInterestRate;
	}

}
