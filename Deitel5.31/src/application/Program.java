package application;

import java.util.Scanner;

public class Program {

	public static void main(String[] args) {

		// fonte:
		// https://exercicios.brasilescola.uol.com.br/exercicios-geografia/exercicios-sobre-aquecimento-global.htm

		Scanner sc = new Scanner(System.in);
		int total = 0;
		int wrong = 0;

		System.out.println(
				"O aquecimento do globo é um processo natural, mas que vem sendo intensificado pelas ações humanas, especialmente por meio da");
		System.out.println("A) utilização de recursos renováveis.");
		System.out.println("B) elevação do volume de água do mar.");
		System.out.println("C) acentuação do processo de arenização.");
		System.out.println("D) emissão de poluentes na atmosfera.");

		if (sc.next().charAt(0) == 'D') {
			total++;
		} else {
			wrong++;
		}

		System.out.println("Qual fenômeno natural está diretamente relacionado à ocorrência do aquecimento global?");
		System.out.println("A) Efeito estufa");
		System.out.println("B) Chuva ácida");
		System.out.println("C) Inversão térmica");
		System.out.println("D) Ilhas de calor");

		if (sc.next().charAt(0) == 'A') {
			total++;
		} else {
			wrong++;
		}

		System.out.println("Assinale a alternativa que apresenta uma consequência do aquecimento global:");
		System.out.println("A) aumento da biodiversidade");
		System.out.println("B) diminuição da temperatura");
		System.out.println("C) degelo das calotas polares");
		System.out.println("D) inalteração do clima global");

		if (sc.next().charAt(0) == 'C') {
			total++;
		} else {
			wrong++;
		}

		System.out.println("O fenômeno do aquecimento glocal marca a história da humanidade, especialmente devido à");
		System.out.println("A) realização das grandes Guerras Mundiais.");
		System.out.println("B) retração da população dos países ricos.");
		System.out.println("C) existência de grandes epidemias globais.");
		System.out.println("D) ocorrência das Revoluções Industriais.");

		if (sc.next().charAt(0) == 'D') {
			total++;
		} else {
			wrong++;
		}

		System.out.println(
				"Assinale a alternativa que menciona um elemento produtivo que contribui para o aquecimento global:");
		System.out.println("A) reciclagem de resíduos industriais");
		System.out.println("B) reúso da água nas plantas fabris");
		System.out.println("C) uso de painéis solares de energia");
		System.out.println("D) uso de combustíveis fósseis");

		if (sc.next().charAt(0) == 'D') {
			total++;
		} else {
			wrong++;
		}

		sc.close();

		if (total == 5) {
			System.out.println("Excelente");
		} else if (total == 4) {
			System.out.println("Muito bom");
		} else {
			System.out.println("É o momento de aprimorar seu conhecimento sobre o aquecimento global");
		}

		System.out.println();
		System.out.println("Acertos: " + total);
		System.out.println("Erros: " + wrong);

	}

}
