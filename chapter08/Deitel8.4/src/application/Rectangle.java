package application;

public class Rectangle {

	private double length = 1;
	private double width = 1;

	public double getLength() {
		return length;
	}

	public void setLength(double length) {

		if (length < 0 || length > 20) {
			throw new IllegalArgumentException("Length must be between 0 and 20.");
		}

		this.length = length;
	}

	public double getWidth() {
		return width;
	}

	public void setWidth(double width) {

		if (width < 0 || width > 20) {
			throw new IllegalArgumentException("Width must be between 0 and 20.");
		}

		this.width = width;
	}

	public double perimeter() {
		return length * 2 + width * 2;

	}

	public double area() {
		return length * width;
	}

	public String toString() {
		return String.format("Lenght: %.2f%nWidth: %.2f%nPerimeter: %.2f%nArea:%.2f", length, width, perimeter(), area());
	}

}
