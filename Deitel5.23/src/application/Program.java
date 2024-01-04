package application;

public class Program {

	public static void main(String[] args) {

		int x = 5;
		int y = 7;
		int a = 4;
		int b = 10;
		int g = 2;
		int i = 20;
		int j = 12;

		System.out.println(!(x < 5) && !(y >= 7));
		System.out.println(!(a == b) || !(g != 5));
		System.out.println(!((x <= 8) && (y > 4)));
		System.out.println(!((i > 4) || (j <= 6)));

		System.out.println();
		System.out.println();

		System.out.println(!((x < 5) || (y >= 7)));
		System.out.println(!((a == b) && (g != 5)));
		System.out.println(!(x <= 8) || !(y > 4));
		System.out.println(!(i > 4) && !(j <= 6));

	}

}
