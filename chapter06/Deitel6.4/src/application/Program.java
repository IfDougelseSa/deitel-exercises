package application;

public class Program {

	public static void main(String[] args) {

		// 6.4 Forneça o cabeçalho de método para cada um dos seguintes métodos.
		// 6.4 Provide the method header for each of the following methods.

	}
	/*
	 * a) O método hypotenuse, que aceita dois argumentos de ponto flutuante de
	 * precisão dupla side1 e side2 e retorna um resultado de ponto flutuante de
	 * dupla precisão.
	 */

	/*
	 * a) The hypotenuse method, which accepts two double-precision floating-point
	 * arguments side1 and side2 and returns a result of double precision floating
	 * point.
	 */
	public double hypotenuse(double side1, double side2) {
		return side1 * side2;
	}

	/*
	 * b) O método smallest, que recebe três inteiros x, y e z e retorna um inteiro.
	 */

	/*
	 * b) The smallest method, which receives three integers x, y and z and returns
	 * one integer.
	 */

	public int smallest(int x, int y, int z) {
		return x + y + z;
	}

	/*
	 * c) O método instructions, que não aceita nenhum argumento e não retorna um
	 * valor. [Observação: esses métodos são comumente utilizados para exibição de
	 * instruções para o usuário.]
	 */

	/*
	 * 
	 * c) The instructions method, which does not accept any arguments and does not
	 * return a value. [Note: These methods are commonly used to display user
	 * instructions.]
	 */

	public void instructions() {
		System.out.println("Message here");
	}

	/*
	 * d) O método intToFloat, que recebe um argumento number do tipo inteiro e
	 * retorna um float.
	 */

	/*
	 * d) The intToFloat method, which takes a number argument of type integer and
	 * returns a float.
	 */
	public float intToFloat(int number) {
		return number;
	}

}
