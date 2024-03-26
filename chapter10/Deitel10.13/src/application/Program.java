package application;

import entities.Circle;
import entities.Cube;
import entities.Shape;
import entities.Sphere;
import entities.Square;
import entities.Tetrahedron;
import entities.ThreeDimensionalShape;
import entities.Triangle;
import entities.TwoDimensionalShape;

public class Program {

	public static void main(String[] args) {

		Shape circle = new Circle(3.0);
		Shape cube = new Cube(4.0);
		Shape sphere = new Sphere(5.0);
		Shape square = new Square(5.0);
		Shape tetrahedron = new Tetrahedron(7.0);
		Shape triangle = new Triangle(5, 10);

		Shape[] array = { circle, cube, sphere, square, tetrahedron, triangle };

		for (Shape e : array) {

			if (e instanceof TwoDimensionalShape) {
				System.out.printf("%s%n", TwoDimensionalShape.class.getName());
			} else {
				System.out.printf("%s%n", ThreeDimensionalShape.class.getName());
			}
			System.out.println(e);
		}

	}

}
