package application;

public class Program {

	public static void main(String[] args) {

		int[][] sales = { { 10, 20, 17, 40 }, { 40, 30, 15, 10 }, { 12, 25, 10, 50 }, { 40, 30, 19, 10 },
				{ 18, 14, 40, 22 } };

		int[] value = { 30, 130, 10, 50, 20 };
		int[] total = new int[4];

		int[] sumLines = new int[5];
		int[] sumColumns = new int[4];

		System.out.println("            Seller 1 | Seller 2 | Seller 3 | Seller 4");
		for (int i = 0; i < sales.length; i++) {
			System.out.print("Product " + (i + 1) + "   ");
			for (int j = 0; j < sales[i].length; j++) {
				System.out.print(sales[i][j] + "         ");
				sumLines[i] += sales[i][j];
				if (j == 0) {
					sumColumns[0] += sales[i][0];
					total[0] += sales[i][0] * value[i];
				} else if (j == 1) {
					sumColumns[1] += sales[i][1];
					total[1] += sales[i][1] * value[i];
				} else if (j == 2) {
					sumColumns[2] += sales[i][2];
					total[2] += sales[i][2] * value[i];
				} else if (j == 3) {
					sumColumns[3] += sales[i][3];
					total[3] += sales[i][3] * value[i];
				}

			}
			System.out.println();
		}

		System.out.println();

		for (int i = 0; i < value.length; i++) {
			System.out.println("Product " + (i + 1) + " price: $" + value[i]);
		}

		System.out.println();

		for (int i = 0; i < sumLines.length; i++) {
			System.out.println(
					"Total sales of product " + (i + 1) + ": " + sumLines[i] + "   | $" + (sumLines[i] * value[i]));
		}

		System.out.println();

		for (int i = 0; i < sumColumns.length; i++) {
			System.out.println("Total sales of seller " + (i + 1) + ": " + sumColumns[i] + "   | $" + total[i]);
		}

	}

}
