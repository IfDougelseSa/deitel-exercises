package entities;

public class Account {

	private String name;
	private double balance;

	public Account(String name, double balance) {

		this.name = name;
		if (balance > 0) {
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

	public void deposit(double depositAmount) {
		if (depositAmount > 0) {
			balance += depositAmount;
		}
	}

	public void displayAccount() {
		System.out.printf("%s balance: $%.2f%n", name, balance);
	}

}
