package application;

import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		/*
		 * 2.28 (Diâmetro, circunferência e área de um círculo) Eis uma prévia do que
		 * veremos mais adiante. Neste capítulo, você aprendeu sobre inteiros e o tipo
		 * int. O Java também pode representar números de pontos flutuantes que contêm
		 * pontos de fração decimal, como 3,14159. Escreva um aplicativo que leia a
		 * entrada a partir do usuário do raio de um círculo como um inteiro e imprima o
		 * diâmetro do círculo, circunferência e área utilizando o valor do ponto
		 * flutuante 3,14159 para S. Utilize as técnicas mostradas na Figura 2.7.
		 * [Observação: você também pode empregar a constante Math.PI predefinida para o
		 * valor de S. Essa constante é mais precisa que o valor 3,14159. A classe Math
		 * é definida no pacote java.lang. As classes nesse pacote são importadas
		 * automaticamente, portanto, você não precisa importar a classe Math para
		 * utilizá-la.] Adote as seguintes fórmulas (r é o raio): diâmetro = 2r
		 * circunferência = 2Sr área = Sr2 Não armazene os resultados de cada cálculo em
		 * uma variável. Em vez disso, especifique cada cálculo como o valor de saída em
		 * uma instrução System.out.printf. Os valores produzidos pelos cálculos de
		 * circunferência e área são números de ponto flutuante. A saída desses valores
		 * pode ser gerada com o especificador de formato %f em uma instrução
		 * System.out.printf. Você aprenderá mais sobre números de pontos flutuantes no
		 * Capítulo 3
		 */

		/*
		 * 2.28 (Diameter, circumference and area of ​​a circle) Here is a preview of
		 * what we will see later. In this chapter, you learned about integers and the
		 * int type. Java can also represent floating point numbers that contain decimal
		 * fraction points, such as 3.14159. Write an application that reads user input
		 * of the radius of a circle as an integer and prints the diameter of the
		 * circle, circumference and area using the floating point value 3.14159 for S.
		 * Use the techniques shown in Figure 2.7. [Note: you You can also employ the
		 * predefined Math.PI constant for the value of S. This constant is more
		 * accurate than the value 3.14159. The class Math is defined in the java.lang
		 * package. Classes in this package are automatically imported, so you don't
		 * need to import the Math class to use it.] Adopt the following formulas (r is
		 * the radius): diameter = 2r circumference = 2Sr area = Sr2 Do not store the
		 * results of each calculation in a variable. Instead, specify each calculation
		 * as the output value in a System.out.printf statement. The values ​​produced
		 * by circumference and area calculations are floating point numbers. The exit
		 * of these values ​​can be generated with the %f format specifier in a
		 * System.out.printf statement. You will learn more about floating point numbers
		 * in Chapter 3
		 */

		Scanner sc = new Scanner(System.in);

		System.out.print("Enter the radius: ");
		float radius = sc.nextFloat();
		sc.close();

		System.out.printf("diameter: %f, circumference: %f, area: %f.", (2 * radius), (2 * Math.PI * radius),
				(Math.PI * radius * radius));

	}

}
