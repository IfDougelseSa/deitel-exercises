package entities;

public class Cryptography {

	private int number;

	public Cryptography(int number) {

		this.number = number;
	}

	public int getNumber() {
		return number;
	}

	public int cryptography() {

		String numberCrypt = Integer.toString(((number % 10000 / 1000) + 7) % 10)
				+ Integer.toString(((number % 1000 / 100) + 7) % 10) + Integer.toString(((number % 100 / 10) + 7) % 10)
				+ Integer.toString(((number % 10) + 7) % 10);
		return Integer.parseInt(numberCrypt);

	}

}
