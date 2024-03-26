package entities;

public abstract class TwoDimensionalShape extends Shape {

	@Override
	public String toString() {
		return String.format("Area: %.2f%n", getArea());
	}
}
