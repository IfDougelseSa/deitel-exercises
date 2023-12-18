package entities;

public class Account {

	private String name;
	private double balance;

	public Account(String name, double balance) {
		this.name = name;
		if (balance > 0.0) {
			this.balance = balance;
		}
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getBalance() {
		return balance;
	}

	public void deposit(double amount) {
		if (amount > 0.0) {
			balance += amount;
		}
	}

	public void withdrawl(double amount) {

		if (amount > balance) {
			System.out.println("Withdrawal amount exceeded account balance");

		} else {
			balance -= amount;
		}

	}

}
