package application;

import entities.Invoice;

public class Program {

	public static void main(String[] args) {

		Invoice invoice = new Invoice("1", "Tv", 2, 500.00);
		Invoice invoice2 = new Invoice("2", "Mouse", -4, -200);

		System.out.println(invoice.getInvoinceNumber() + " " + invoice.getQuantity() + " " + invoice.getDescription()
				+ " " + invoice.getPrice());
		System.out.println(invoice.getInvoiceAmount());

		System.out.println(invoice2.getInvoinceNumber() + " " + invoice2.getQuantity() + " " + invoice2.getDescription()
				+ " " + invoice2.getPrice());
		System.out.println(invoice2.getInvoiceAmount());
	}

}
