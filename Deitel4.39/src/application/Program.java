package application;

public class Program {

	public static void main(String[] args) {

		double total = 7.8;
		int count = 1;
		double aux = 6.8;

		System.out.println("Year   Total Population(Billions)        Growth");
		while (count <= 75) {

			if (count > 0 && count <= 3) {
				System.out.printf("%d   %.2f                              %.2f%n", 2020 + count, total, (total - aux));
			} else if (count > 3 && count < 10) {
				System.out.printf("%d   %.2f                             %.2f%n", 2020 + count, total, (total - aux));
			} else if (count > 30 && count < 58) {
				System.out.printf("%d   %.2f                            %.2f%n", 2020 + count, total, (total - aux));
			} else if (count > 57 && count < 76) {
				System.out.printf("%d   %.2f                           %.2f%n", 2020 + count, total, (total - aux));
			} else {
				System.out.printf("%d   %.2f                             %.2f%n", 2020 + count, total, (total - aux));
			}

			aux = total;
			total *= 1.09;

			count++;
		}

	}

}
