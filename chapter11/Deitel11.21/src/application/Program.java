package application;

public class Program {

	public static void main(String[] args) {

		try {
			someMethod();
		} catch (ExceptionA e) {
			System.err.println("ExceptionA slips and is handled by the main method");
		}
	}
	
	public static void someMethod() {
		try {
			exceptionA();
		} catch (IndexOutOfBoundsException e) {
			System.err.println(e.getMessage());
		}
	}
	
	public static void exceptionA() {
		throw new ExceptionA();
	}
	

}
class ExceptionA extends RuntimeException {
	 private static final long serialVersionUID = 1L;

	    public ExceptionA() {
	        super("ExceptionA");
	    }
	

}