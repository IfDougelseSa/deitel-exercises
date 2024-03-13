package exceptions;

public class SamePosition extends RuntimeException {
	private static final long serialVersionUID = 1L;
	
	public SamePosition(String message) {
		super(message);
	}


}
