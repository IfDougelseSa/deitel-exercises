package application;

public class Program {

	/*
	 * 
	 * Identifique e corrija os erros em cada um dos seguintes conjuntos de código:
	 * 
	 * Identify and fix errors in each of the following sets of code
	 * 
	 * a) while (c <= 5) { product *= c; ++c; b) if (gender == 1)
	 * System.out.println("Woman"); else; System.out.println("Man");
	 */

	public static void main(String[] args) {

		int product = 1;
		int c = 2;
		int gender = 1;

		// a)
		while (c <= 5) {
			product *= c;
			++c;
		} // the key was missing

		// b)

		if (gender == 1)
			System.out.println("Woman");
		else// its was ; incorrectly
			System.out.println("Man");
	}

}
