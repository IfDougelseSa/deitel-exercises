package application;

public class Clients {

	private int accountNumber;
	private int beginningMonthBalance;
	private int totalItemsCharged;
	private int totalMonthCredit;
	private int authorizedLimit;

	public Clients() {

	}

	public Clients(int accountNumber, int beginningMonthBalance, int totalItemsCharged, int totalMonthCredit,
			int authorizedLimit) {

		this.accountNumber = accountNumber;
		this.beginningMonthBalance = beginningMonthBalance;
		this.totalItemsCharged = totalItemsCharged;
		this.totalMonthCredit = totalMonthCredit;
		this.authorizedLimit = authorizedLimit;
	}

	public int getAccountNumber() {
		return accountNumber;
	}

	public void setAccountNumber(int accountNumber) {
		this.accountNumber = accountNumber;
	}

	public int getBeginningMonthBalance() {
		return beginningMonthBalance;
	}

	public void setBeginningMonthBalance(int beginningMonthBalance) {
		this.beginningMonthBalance = beginningMonthBalance;
	}

	public int getTotalItemsCharged() {
		return totalItemsCharged;
	}

	public void setTotalItemsCharged(int totalItemsCharged) {
		this.totalItemsCharged = totalItemsCharged;
	}

	public int getTotalMonthCredit() {
		return totalMonthCredit;
	}

	public void setTotalMonthCredit(int totalMonthCredit) {
		this.totalMonthCredit = totalMonthCredit;
	}

	public int getAuthorizedLimit() {
		return authorizedLimit;
	}

	public void setAuthorizedLimit(int authorizedLimit) {
		this.authorizedLimit = authorizedLimit;
	}

	public String limit() {

		int total = beginningMonthBalance + totalMonthCredit + authorizedLimit - totalItemsCharged;

		if (total < 0) {
			System.out.println("Credit limit exceeded");
		} else {
			System.out.println("New balance: " + total);
		}

		return null;
	}

}
