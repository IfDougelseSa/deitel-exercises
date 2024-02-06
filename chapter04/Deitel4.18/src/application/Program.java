package application;

import java.util.Scanner;

public class Program {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.print("Enter account number: ");
		int number = sc.nextInt();
		
		System.out.print("Enter beginning month balance: ");
		int monthBalance = sc.nextInt();
		
		System.out.print("Enter total items charged: ");
		int charged = sc.nextInt();
		
		System.out.print("Enter total month credit: ");
		int monthCredit = sc.nextInt();
		
		System.out.print("Enter account authorized limit: ");
		int limit = sc.nextInt();
		
		sc.close();
		
		Clients client = new Clients(number, monthBalance, charged, monthCredit, limit);
		System.out.println();
		
		System.out.println("Client account number: " + client.getAccountNumber());
        client.limit();


	}

}
