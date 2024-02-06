package application;

public class Program {

	public static void main(String[] args) {
		// 4.15 Identifique e corrija os erros em cada um dos seguintes fragmentos de
		// código. [Observação: pode haver mais de um erro em cada trecho de
		// código.]

		// 4.15Identify and correct the errors in each of the following code fragments.
		// [Note: There may be more than one error in each part of
		// code.]

		// a)

		int age = 10;

		// its was a point and comma after parentheses
		if (age >= 65)
			System.out.println("Age is greater than or equal to 65");
		else
			System.out.println("Age is less than 65");

		// b) total was not initialized
		int x = 1;
		int total = 10;

		while (x <= 10) {
			total += x;
			++x;
		}
		
		// c) it was missing the keys. Then, an infinity loop was happening.
		
		while (x <= 100) {
			total += x;
			++x;
		}
		
		// d) it was missing the closing key and was necessary change plus sinal to minus.
		
		int y = 1;
		while (y > 0) {
			System.out.println(y);
			--y;
		}
		
		
		
	}

}
