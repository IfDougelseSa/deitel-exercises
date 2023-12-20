package entities;

public class Decryption {

	private int number;

	public Decryption(int number) {
		this.number = number;
	}

	public int getNumber() {
		return number;
	}

	public int decript() {

		int firstNumber = (number % 10000 / 1000);
		int secondNumber = (number % 1000 / 100);
		int thirdNumber = (number % 100 / 10);
		int fourthNumber = number % 10;

		if (firstNumber >= 0 && firstNumber <= 6) {
			firstNumber += 3;
		} else {
			firstNumber -= 7;
		}

		if (secondNumber >= 0 && secondNumber <= 6) {
			secondNumber += 3;
		} else {
			secondNumber -= 7;
		}

		if (thirdNumber >= 0 && thirdNumber <= 6) {
			thirdNumber += 3;
		} else {
			thirdNumber -= 7;
		}

		if (fourthNumber >= 0 && fourthNumber <= 6) {
			fourthNumber += 3;
		} else {
			fourthNumber -= 7;
		}

		String numberDecript = Integer.toString(firstNumber) + Integer.toString(secondNumber)
				+ Integer.toString(thirdNumber) + Integer.toString(fourthNumber);
		return Integer.parseInt(numberDecript);
	}

}
