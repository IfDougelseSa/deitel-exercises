package application;

public class Program {

	public static void main(String[] args) {
	
		try {
			someMethod();
		} catch (RuntimeException e) {
			e.printStackTrace();
		}

	}
	
	public static void someMethod() {
		try {
			someMethod2();
		} catch (RuntimeException e) {
			throw new RuntimeException("someMethod RuntimeException.", e);
		}
	}
	
	public static void someMethod2() {
		throw new RuntimeException("someMethod2 RuntimeException.");
		}

}
