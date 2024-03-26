package entities;

public class Cube extends ThreeDimensionalShape {
	private static final int VOLUME_EXPOENT = 3;
	private static final int AREA_EXPOENT = 6;

	public double side;

	public Cube(double side) {
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
	public double getVolume() {

		return Math.pow(getSide(), VOLUME_EXPOENT);
	}

	@Override
	public double getArea() {
		return Math.pow(getSide(), AREA_EXPOENT);
	}

	@Override
	public String toString() {
		return String.format("%s%n%s", this.getClass().getName(), super.toString());
	}

}
