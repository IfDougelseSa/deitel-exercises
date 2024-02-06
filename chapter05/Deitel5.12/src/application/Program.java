package application;

public class Program {

	public static void main(String[] args) {
		
		int total = 1;
		
		for (int i=1; i<=15; i++) {
			total *= i;
		}
		
		System.out.println("Total: " + total);

	}

}
