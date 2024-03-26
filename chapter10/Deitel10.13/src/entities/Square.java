package entities;

public class Square extends TwoDimensionalShape {

	private double side;

	public Square(double side) {
		super();
		this.side = side;
	}

	public double getSide() {
		return side;
	}

	public void setSide(double side) {
		this.side = side;
	}

	@Override
	public double getArea() {

		return getSide() * getSide();
	}

	@Override
	public String toString() {
		return String.format("%s%n%s", this.getClass().getName(), super.toString());
	}

}
