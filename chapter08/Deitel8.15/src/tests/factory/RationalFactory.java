package tests.factory;

import entities.Rational;

public class RationalFactory {

	public static Rational emptyRational() {
		return new Rational();
	}

	public static Rational rational() {
		return new Rational(50, 25);
	}
	
	public static Rational rational2() {
		return new Rational(5, 4);
	}
	
	public static Rational rational3() {
		return new Rational(1, 2);
	}
	
	public static Rational rational4() {
		return new Rational(4, 2);
	}

	public static Rational invalidRational() {
		return new Rational(50, 0);
	}

}
