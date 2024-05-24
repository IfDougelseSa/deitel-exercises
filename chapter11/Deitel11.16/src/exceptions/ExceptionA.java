package exceptions;

public class ExceptionA extends RuntimeException{

	private static final long serialVersionUID = 1L;
	
	public ExceptionA(String message) {
		super(message);
	}

}
