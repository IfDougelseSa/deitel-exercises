package entities;

import java.math.BigDecimal;

public class Account {

	private String name;
	private BigDecimal balance;

	public Account(String name, BigDecimal balance) {
		this.name = name;
		int value = balance.compareTo(new BigDecimal("0.0"));
		if (value > 0) {
			this.balance = balance;
		}
	}

	public void deposit(BigDecimal depositAmount) {
		int value = balance.compareTo(new BigDecimal("0.0"));
		if (value > 0) {
			BigDecimal add = balance.add(depositAmount);
			balance = add;
		}
	}

	public BigDecimal getBalance() {
		return balance;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}
}