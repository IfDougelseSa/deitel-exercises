package entities;

public class Invoice {

	private String invoinceNumber;
	private String description;
	private int quantity;
	private double price;

	public Invoice(String invoinceNumber, String description, int quantity, double price) {

		this.invoinceNumber = invoinceNumber;
		this.description = description;
		if (quantity > 0) {
			this.quantity = quantity;
		}
		if (price > 0) {
			this.price = price;
		}
	}

	public String getInvoinceNumber() {
		return invoinceNumber;
	}

	public void setInvoinceNumber(String invoinceNumber) {
		this.invoinceNumber = invoinceNumber;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public double getInvoiceAmount() {
		return quantity * price;
	}

}
