package application;

public class Mystery2 {

	public static void main(String[] args) {
		
		int count = 1;
		
		while(count <= 10) {
			System.out.println((double)count % 2.0 == 1 ? "****" : "++++++++");
			++count;
		}

	}

}
