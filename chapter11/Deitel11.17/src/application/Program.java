package application;

import java.io.IOException;
import java.util.InputMismatchException;
import java.util.Scanner;

import exceptions.ExceptionA;
import exceptions.ExceptionB;

public class Program {

	public static void main(String[] args) {
		
		try (Scanner sc = new Scanner(System.in)) {
			
			switch (sc.nextInt()) {
			case 1: 
				exceptionA();
			case 2: 
				exceptionB();
			case 3:
				nullPointerException();
			case 4:
				ioException();
			default:
				throw new IllegalArgumentException("Unexpected value. It should be 1, 2, 3 or 4.");
			}
			
		} catch (Exception e) {
			if (e instanceof InputMismatchException) {
				System.err.println("InputMismatchException");
			} else {
				System.err.println(e.getMessage());
			}
			
		}

	}

	public static void exceptionA() throws ExceptionA {

		throw new ExceptionA("ExceptionA");
	}

	public static void exceptionB() throws ExceptionB {

		throw new ExceptionB("ExceptionB");
	}

	public static void nullPointerException() {

		throw new NullPointerException("NullPointerException");
	}
	
	public static void ioException() throws IOException {

		throw new IOException("IOException");
	}

}
