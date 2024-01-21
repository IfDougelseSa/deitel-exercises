package application;

import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		double number = 0;
		double y;
		
		for (int i = 1; i <=5; i++) {
			System.out.println("Enter a number: ");
			
			number = sc.nextDouble();
		
			y = Math.floor(number + 0.5);
			
			System.out.println("Original number " + number);
			System.out.println("Rounded number " + y);
		}
		
		sc.close();

	}

}
