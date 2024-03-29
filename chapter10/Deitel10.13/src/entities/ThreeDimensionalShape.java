package entities;

public abstract class ThreeDimensionalShape extends Shape {

	public abstract double getVolume();

	@Override
	public String toString() {
		return String.format("Area: %.2f%nVolume: %.2f%n", getArea(), getVolume());
	}

}
