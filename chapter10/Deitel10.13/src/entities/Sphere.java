package entities;

public class Sphere extends ThreeDimensionalShape {
	private static final int VOLUME_EXPOENT = 3;
	private static final int AREA_EXPOENT = 2;
	private double radius;

	public Sphere(double radius) {
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
	public double getVolume() {
		return (4 / 3) * Math.PI * Math.pow(getRadius(), VOLUME_EXPOENT);
	}

	@Override
	public double getArea() {
		return 4 * Math.PI * AREA_EXPOENT;
	}
	
	@Override
	public String toString() {
		return String.format("%s%n%s", this.getClass().getName(), super.toString());
	}

}
