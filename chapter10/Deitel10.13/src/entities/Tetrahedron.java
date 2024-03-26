package entities;

public class Tetrahedron extends ThreeDimensionalShape {

	private static final int VOLUME_ROOT = 2;
	private static final int VOLUME_EXPOENT = 3;
	private static final int AREA_ROOT = 3;
	private static final int AREA_EXPOENT = 2;

	private double height;

	public Tetrahedron(double height) {
		super();
		this.height = height;
	}

	public double getHeight() {
		return height;
	}

	public void setHeight(double height) {
		this.height = height;
	}

	@Override
	public double getVolume() {

		return Math.pow(getHeight(), VOLUME_EXPOENT) * Math.sqrt(VOLUME_ROOT) / 12;
	}

	@Override
	public double getArea() {

		return Math.pow(getHeight(), AREA_EXPOENT) * Math.sqrt(AREA_ROOT);
	}
	
	@Override
	public String toString() {
		return String.format("%s%n%s", this.getClass().getName(), super.toString());
	}

}
