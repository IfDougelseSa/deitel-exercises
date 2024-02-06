package application;

public class Program {

	public static void main(String[] args) {
		
		//a)
		final int ARRAY_SIZE = 3;
		
		int[][] a = new int[ARRAY_SIZE][ARRAY_SIZE];
		
		//b) 9
		
		//c)
		for (int x = 0; x < a.length; x++) {
			for (int y = 0; y < a[x].length; y++) {
				a[x][y] = x + y;
			}
		}
		
		for (int x = 0; x < a.length; x++) {
			for (int y = 0; y < a[x].length; y++) {
				System.out.println(a[x][y]);
			}
		}

	}

}
