package entities;

public class Circle extends TwoDimensionalShape {

	private double radius;

	public Circle(double radius) {
		super();
		this.radius = radius;
	}

	public double getRadius() {
		return radius;
	}

	public void setRadius(double radius) {
		this.radius = radius;
	}

	@Override
	public double getArea() {

		return Math.PI * getRadius() * getRadius();
	}

	@Override
	public String toString() {
		return String.format("%s%n%s", this.getClass().getName(), super.toString());
	}
}
