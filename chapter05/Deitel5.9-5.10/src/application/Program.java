package application;

public class Program {

	public static void main(String[] args) {

		/*
		 * 5.9 Localize e corrija o(s) erro(s) em cada um dos seguintes segmentos de
		 * código: 5.9 Find and correct the error(s) in each of the following code
		 * segments:
		 */

		// a) the i type was missing; F was in uppercase;
		// the header was separated by a comma
		// i was increment

		for (int i = 100; i >= 1; i--)
			System.out.println(i);

		// b) it was missing value declaration and break statement
		int value = 4;
		switch (value % 2) {
		case 0:
			System.out.println("Even integer");
			break;
		case 1:
			System.out.println("Odd integer");
		}

		// c) it was missing i type and its was necessary change to decrement
		for (int i = 19; i >= 1; i -= 2)
			System.out.println(i);

		// d) it was missing counter type; W of while was in uppercase; its was
		// necessary an equal sign in counter.

		int counter = 2;
		do {
			System.out.println(counter);
			counter += 2;
		} while (counter <= 100);
		
		
		
		// 5.10
		for (int i = 1; i <= 10; i++)
		{
			for (int j = 1; j <= 5; j++)
				System.out.print('@');
			System.out.println();
		}
	}

}
