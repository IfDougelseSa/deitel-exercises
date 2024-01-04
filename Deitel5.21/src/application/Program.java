package application;

public class Program {

	public static void main(String[] args) {

		for (int i = 1; i <= 500; i++) {

			for (int j = 1; j <= 500; j++) {
				
				for (int w = 1; w <= 500; w++) {

					if (j * j + w * w == i * i) {
						System.out.printf("%d %d %d", i, j, w);
						System.out.println();
					}
					
				}
			}
		}
	}

}
