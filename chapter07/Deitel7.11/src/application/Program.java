package application;

public class Program {

	public static void main(String[] args) {

		int[] count = new int[10];

		int[] bonus = new int[15];

		int[] bestScores = { 1, 2, 3, 5, 5 };

		for (int i = 0; i < bonus.length; i++) {
			bonus[i] += 1;
		}

		for (int i = 0; i < bestScores.length; i++) {
			System.out.println(i + " " + bestScores[i]);
		}

	}

}
