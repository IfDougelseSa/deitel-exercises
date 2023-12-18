package application;

import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		/*
		 * 2.33 (Calculadora de índice de massa corporal) Introduzimos a calculadora de
		 * índice de massa corporal (IMC) no Exercício 1.10. As fórmulas para calcular o
		 * IMC são IMC = pesoEmLibras × 703 alturaEmPolegadas2 ou IMC =
		 * pesoEmQuilogramas alturaEmMetros2 Crie um aplicativo de calculadora IMC que
		 * leia o peso do usuário em libras e a altura em polegadas (ou, se preferir, o
		 * peso em quilogramas e a altura em metros) e, então, calcule e exiba o índice
		 * de massa corporal dele. Além disso, que exiba as seguintes informações do
		 * Department of Health and Human Services/National Institutes of Health, assim
		 * o usuário pode avaliar o seu IMC: BMI VALUES Underweight: less than 18.5
		 * Normal: between 18.5 and 24.9 Overweight: between 25 and 29.9 Obese: 30 or
		 * greater [Nota: neste capítulo, você aprendeu a utilizar o tipo int para
		 * representar números inteiros. Os cálculos de IMC, quando feitos com valores
		 * int, produzirão resultados com números inteiros. No Capítulo 3, você
		 * aprenderá a utilizar o tipo double para representar números com pontos
		 * decimais. Quando os cálculos de IMC são realizados com doubles, eles
		 * produzirão números com pontos decimais — esses são chamados de números de
		 * “ponto flutuante”.]
		 */

		/*
		 * 2.33 (Body mass index calculator) We introduced the body mass index (BMI)
		 * calculator in Exercise 1.10. The formulas for calculating BMI are BMI =
		 * weightInPounds × 703 heightInInches2 or BMI = weightInKilograms
		 * heightInMeters2 Create a BMI calculator app that reads the user's weight in
		 * pounds and height in inches (or, if you prefer, weight in kilograms and
		 * height in meters) and then calculates and displays their body mass index.
		 * Additionally, it displays the following information from the Department of
		 * Health and Human Services/National Institutes of Health, so the user can
		 * assess their BMI: BMI VALUES Underweight: less than 18.5 Normal: between 18.5
		 * and 24.9 Overweight: between 25 and 29.9 Obese: 30 or greater [Note: In this
		 * chapter, you learned how to use the int type to represent integers. BMI
		 * calculations, when done with int values, will produce results with integers.
		 * In Chapter 3, you will learn how to use the double type to represent numbers
		 * with decimal points. When BMI calculations are performed with doubles, they
		 * will produce numbers with decimal points — these are called “floating point”
		 * numbers.]
		 */

		double wheight;
		double height;
		double bmi;

		Scanner sc = new Scanner(System.in);

		System.out.print("Enter p for pounds or k for kilograms: ");
		char measure = sc.next().charAt(0);


		if (measure == 'p') {
			System.out.print("Enter pounds: ");
			wheight = sc.nextDouble();

			System.out.print("Enter height in inches: ");
			height = sc.nextDouble();

			bmi = wheight * 703 / (height * height);

			System.out.println("BMI VALUES");

			if (bmi < 18.5)
				System.out.println("Underweight: less than 18.5");
			else if (bmi >= 18.5 && bmi <= 24.9)
				System.out.println("Normal: between 18.5 and 24.9");
			else if (bmi >= 25 && bmi <= 29.9)
				System.out.println("Overweight: between 25 and 29.9");
			else
				System.out.println("Obese: 30 or greater");
			
			System.out.println(bmi);

		} else if (measure == 'k') {
			System.out.print("Enter kilogramas: ");
			wheight = sc.nextDouble();

			System.out.print("Enter height in meters: ");
			height = sc.nextDouble();

			bmi = wheight / (height * height);

			System.out.println("BMI VALUES");

			if (bmi < 18.5)
				System.out.println("Underweight: less than 18.5");
			else if (bmi >= 18.5 && bmi <= 24.9)
				System.out.println("Normal: between 18.5 and 24.9");
			else if (bmi >= 25 && bmi <= 29.9)
				System.out.println("Overweight: between 25 and 29.9");
			else
				System.out.println("Obese: 30 or greater");
			
			System.out.println(bmi);

		} else {
			System.out.print("The key entered is invalid");
		}

		
		sc.close();

	}

}
