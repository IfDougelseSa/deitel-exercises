package entities;

public class Triangle {

	private int a;
	private int b;
	private int c;

	public Triangle(int a, int b, int c) {

		if ((a < b + c) && (b < a + c) && (b < a + c)) {
			this.a = a;
			this.b = b;
			this.c = c;
			System.out.println(
					"The sides respect the condition of existence of a triangle. The triangle was created successfully.");

		} else {

			System.out.println("The sides do not respect the condition of existence of a triangle");
		}

	}

	public int getA() {
		return a;
	}

	public void setA(int a) {
		this.a = a;
	}

	public int getB() {
		return b;
	}

	public void setB(int b) {
		this.b = b;
	}

	public int getC() {
		return c;
	}

	public void setC(int c) {
		this.c = c;
	}

}
