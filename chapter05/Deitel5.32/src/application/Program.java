package application;

import java.util.Scanner;

import entities.Tax;

public class Program {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		Tax tax = new Tax(sc.next(), sc.nextDouble(), sc.nextDouble(), sc.nextDouble());

		System.out.println(tax.fairTax());

		sc.close();

	}

}
