package application;

public class Program {

	public static void main(String[] args) {

		Rectangle rect1 = new Rectangle();
		Rectangle rect2 = new Rectangle();
		Rectangle rect3 = new Rectangle();

		System.out.printf("Rectangle 1%n%s%n%nRectangle 2%n%s%n%nRectangle 3%n%s%n%n", rect1, rect2, rect3);

		try {
			rect1.setLength(50);
		} catch (Exception e) {
			System.out.printf("Exception: %s%n%n", e.getMessage());
		}

		try {
			rect1.setWidth(50);
		} catch (Exception e) {
			System.out.printf("Exception: %s%n%n", e.getMessage());
		}

		System.out.printf("Rectangle 1%n%s%n%nRectangle 2%n%s%n%nRectangle 3%n%s%n%n", rect1, rect2, rect3);

		try {
			rect1.setLength(10);
			rect2.setLength(20);
			rect3.setLength(5);
			rect1.setWidth(4);
			rect2.setWidth(10);
			rect3.setWidth(17);
		} catch (Exception e) {
			System.out.printf("Exception: %s%n%n", e.getMessage());
		}

		System.out.printf("Rectangle 1%n%s%n%nRectangle 2%n%s%n%nRectangle 3%n%s%n%n", rect1, rect2, rect3);

	}

}
