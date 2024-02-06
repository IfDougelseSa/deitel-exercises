package application;

import java.util.Scanner;

public class Program {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Decimal Binary    Octal      Hexadecimal");
		for (int i = 1; i <= 256; i++) {

			System.out.printf("%d%10s%10s%10s%n", i, new StringBuilder(decimalToBinary(i)).reverse().toString(),
					new StringBuilder(decimalToOctal(i)).reverse().toString(),
					new StringBuilder(decimalToHexadecimal(i)).reverse().toString());

		}

		sc.close();

	}

	public static String decimalToBinary(int number) {

		String conversion = "";
		while (number != 0) {

			if (number % 2 == 0) {
				conversion += "0";
			} else {
				conversion += "1";
			}
			number /= 2;

		}
		return conversion;
	}

	public static String decimalToOctal(int number) {

		String conversion = "";
		int aux;
		while (number != 0) {

			if (number % 8 == 0) {

				conversion += "0";
			} else {
				aux = number % 8;
				conversion += aux;
			}
			number /= 8;

		}
		return conversion;

	}

	public static String decimalToHexadecimal(int number) {

		String conversion = "";
		int aux;
		while (number != 0) {

			if (number % 16 == 0) {

				conversion += "0";
			} else {
				aux = number % 16;
				if (aux == 10) {
					conversion += "A";
				} else if (aux == 11) {
					conversion += "B";
				} else if (aux == 12) {
					conversion += "C";
				} else if (aux == 13) {
					conversion += "D";
				} else if (aux == 14) {
					conversion += "E";
				} else if (aux == 15) {
					conversion += "F";
				} else {
					conversion += aux;
				}

			}
			number /= 16;

		}
		return conversion;
	}

}
