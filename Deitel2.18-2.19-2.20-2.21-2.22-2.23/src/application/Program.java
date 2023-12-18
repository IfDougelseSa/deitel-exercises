package application;

public class Program {

	public static void main(String[] args) {
		// (Exibindo formas com asteriscos) Escreva um aplicativo que exiba uma caixa,
		// uma elipse, uma seta e um losango utilizando asteriscos
		// (*), como segue:

		// (Displaying shapes with asterisks) Write an application that displays a box,
		// an ellipse, an arrow, and a diamond using asterisks
		// (*), as follows:
		
		
		System.out.println("*********   ***     *       *");
		System.out.printf("*%8s%3s%4s%4s%1s%1s%6s%2s%n*%8s%2s%6s%2s%1s%1s%1s%1s%4s%4s%n*%8s%2s%6s%4s%5s%6s"
				+ "%n*%8s%2s%6s%4s%4s%8s%n*%8s%2s%6s%4s%5s%6s%n*%8s%2s%6s%4s%6s%4s%n*%8s%3s%4s%5s%7s%2s%n",
				"*", "*", "*", "*", "*", "*", "*", "*", "*", "*", "*", "*", "*", "*", "*", "*", "*", "*", "*",
				"*", "*", "*", "*", "*", "*", "*", "*", "*", "*", "*", "*", "*", "*", "*", "*", "*", "*", "*", 
				"*", "*", "*", "*", "*", "*", "*", "*", "*", "*", "*");
		System.out.println("*********   ***     *       *");
		
		System.out.println();
		System.out.println();
		
		//2.19 O que o seguinte código imprime?
		//2.19 What does the following code print?

		
		System.out.printf("*%n**%n***%n****%n*****%n");
		
		
		System.out.println();
		System.out.println();
		
		//2.20 O que o seguinte código imprime?
		//2.20 What does the following code print?
		
		System.out.println("*");
		System.out.println("***");
		System.out.println("*****");
		System.out.println("****");
		System.out.println("**");
		
		System.out.println();
		System.out.println();
		
		
		//2.21 O que o seguinte código imprime?
		//2.21 What does the following code print?
		System.out.print("*");
		System.out.print("***");
		System.out.print("*****");
		System.out.print("****");
		System.out.println("**");
		
		System.out.println();
		System.out.println();
		//2.22 O que o seguinte código imprime?
		//2.22 What does the following code print?
		
		System.out.print("*");
		System.out.println("***"); 
		System.out.println("*****");
		System.out.print("****");
		System.out.println("**");
		
		System.out.println();
		System.out.println();
		
		//2.23 O que o seguinte código imprime?
		//2.23 What does the following code print?
		
		System.out.printf("%s%n%s%n%s%n", "*", "***", "*****");
	}

}
