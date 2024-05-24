package exceptions;

public class ExceptionC extends ExceptionB{

	private static final long serialVersionUID = 1L;
	public ExceptionC() {
		super("Exception C captured by Exception A.");
	}

}
