package application;

import java.util.Scanner;

import entities.Cryptography;
import entities.Decryption;

public class Program {

	public static void main(String[] args) {

		
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Type four int to cryptography: ");
		Cryptography cript = new Cryptography(sc.nextInt());
		sc.close();
		
		Decryption decript = new Decryption(cript.cryptography());
		
		System.out.print("Cryptography: ");
		System.out.println(cript.cryptography());
		
		System.out.print("Decryption: ");
		System.out.println(decript.decript());

	}

}
