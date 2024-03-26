package entities;

public class Triangle extends TwoDimensionalShape {

	private double base;
	private double height;

	public Triangle(double base, double height) {
		super();
		this.base = base;
		this.height = height;
	}

	public double getBase() {
		return base;
	}

	public void setBase(double base) {
		this.base = base;
	}

	public double getHeight() {
		return height;
	}

	public void setHeight(double height) {
		this.height = height;
	}

	@Override
	public double getArea() {

		return getBase() * getHeight() / 2;
	}

	@Override
	public String toString() {
		return String.format("%s%n%s", this.getClass().getName(), super.toString());
	}

}
