package application;

public class Program {

	public static void main(String[] args) {
	
		try {
			SomeClass someClass = new SomeClass();
		}catch (Exception e) {
			System.err.println(e.getMessage());
		}

	}

}

class SomeClass {
	
	public SomeClass() throws Exception {
		throw new Exception("Constructor failure.");
	}
}