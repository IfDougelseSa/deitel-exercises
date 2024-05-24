package application;

import java.io.IOException;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		
		try (Scanner sc = new Scanner(System.in)) {
			switch (sc.nextInt()) {
			case 1: 
				throw new IOException();
			case 2:
				throw new Exception();
			}
			
		} catch (Exception e) {
		
		} catch (IOException e) {
			
		}

	}

}

