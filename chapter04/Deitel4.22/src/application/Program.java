package application;

public class Program {

	public static void main(String[] args) {

		int count = 1;

		System.out.printf("N%12s%10s%10s%n%n", "10*N", "100*N", "1000*N");
		while (count <= 5) {
			System.out.printf("%d%10d%10d%10d%n", count, count * 10, count * 100, count * 1000);
			count++;

		}

	}

}
