package application;

public class Program {

	public static void main(String[] args) {
	
		double pi = 0;
		double value = 1;
		
		for(int i = 1; i <= 200000; i++) {
			
			if (i % 2 == 0) {
				pi -= 4 / value;
			} else {
				pi += 4 / value;
			}
			
			System.out.print(i + " ");
			System.out.println(pi);
			value += 2;
			
		}
		
		//197627 3.14159771362712

	}

}
