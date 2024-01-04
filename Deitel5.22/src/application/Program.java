package application;

public class Program {

	public static void main(String[] args) {
		int z = 1;
		int w = 1;
		int x = 1;
		int y = 1;

		for (int i = 1; i <= 10; i++) {

			for (int j = 1; j <= z; j++) {
				System.out.print('*');
			}

			System.out.print("    ");
			for (int j = 10; j >= w; j--) {
				System.out.print('*');
			}

			System.out.print("    ");
			for (int j = 10; j >= y; j--) {
				System.out.print(" ");
			}

			for (int j = 1; j <= z; j++) {
				System.out.print('*');
			}

			System.out.print("    ");
			for (int j = 10; j >= w; j--) {
				System.out.print('*');
			}

			System.out.print("    ");
			for (int j = 10; j >= y; j--) {
				System.out.print(" ");
			}

			System.out.println();
			x++;
			y++;
			z++;
			w++;
		}

	}

}
