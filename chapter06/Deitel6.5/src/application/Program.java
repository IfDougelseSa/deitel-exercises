package application;

public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	// 6.5 Encontre o erro em cada um dos seguintes segmentos de programa. Explique
	// como corrigir o erro.
	// 6.5 Find the error in each of the following program segments. Explain how to
	// correct the error.

	// a) Its not possible to declare a method inside other method.
	void g() {
		System.out.println("Inside method g");

	}

	void h() {
		System.out.println("Inside method h");
	}

	// b) return statement was missing

	int sum(int x, int y) {
		int result = x + y;
		return result;
	}

	// c) ; was removed from (float a). Besides, float a redeclaration was removed
	// too.

	void f(float a) {
		System.out.println(a);
	}

	// d) void was changed to int.

	int product() {
		int a = 6, b = 5, c = 4, result;
		result = a * b * c;
		System.out.printf("Result is %d%n", result);
		return result;
	}
}
