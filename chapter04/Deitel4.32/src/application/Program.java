package application;

public class Program {

	public static void main(String[] args) {

		int count = 1;
		int count2 = 1;

		while (count <= 8) {

			while (count2 <= 8) {
				if (count % 2 == 0) {
					System.out.print(" *");
				} else {
					System.out.print("* ");
				}
				count2++;
			}
			System.out.println();

			count2 = 1;
			count++;
		}

	}

}
