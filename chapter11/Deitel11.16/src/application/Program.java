package application;

import java.util.InputMismatchException;
import java.util.Scanner;

import exceptions.ExceptionA;
import exceptions.ExceptionB;
import exceptions.ExceptionC;

public class Program {

	public static void main(String[] args) {

		try (Scanner sc = new Scanner(System.in)) {
			System.out.println("Enter 1 to throw ExceptionA, 2 to throw ExceptionB or 3 to throw ExceptionC.");
			switch (sc.nextInt()) {
			case 1:
				exceptionA();
			case 2:
				exceptionB();
			case 3:
				exceptionC();
			default:
				System.out.println("Invalid int. It should be 1, 2 or 3.");
			}

		} catch (ExceptionA e) {
			System.out.println(e.getMessage());
		} catch (InputMismatchException e) {
			System.err.println("Invalid input. It should be an int number.");
		}

	}

	private static void exceptionA() {
		throw new ExceptionA("Exception A");
	}

	private static void exceptionB() {
		throw new ExceptionB("Exception B captured by Exception A.");
	}

	private static void exceptionC() {
		throw new ExceptionC();
	}

}
