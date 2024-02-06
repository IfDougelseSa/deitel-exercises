package application;

import java.security.SecureRandom;

public class Program {

	private static final SecureRandom randomNumbers = new SecureRandom();

	public static void main(String[] args) {

		int[] totalSum = new int[11];
		int sum = 0;
		int dice1 = 0;
		int dice2 = 0;
		int j = 2;

		for (int i = 0; i < 36000; i++) {

			dice1 = 1 + randomNumbers.nextInt(6);
			dice2 = 1 + randomNumbers.nextInt(6);
			sum = dice1 + dice2;

			switch (sum) {

			case 2:
				totalSum[0]++;
				break;
			case 3:
				totalSum[1]++;
				break;

			case 4:
				totalSum[2]++;
				break;
			case 5:
				totalSum[3]++;
				break;
			case 6:
				totalSum[4]++;
				break;
			case 7:
				totalSum[5]++;
				break;
			case 8:
				totalSum[6]++;
				break;
			case 9:
				totalSum[7]++;
				break;
			case 10:
				totalSum[8]++;
				break;
			case 11:
				totalSum[9]++;
				break;
			case 12:
				totalSum[10]++;
				break;
			}
		}

		for (int i = 0; i < totalSum.length; i++) {
			System.out.println(j + " " + totalSum[i]);
			j++;
		}

	}

}
