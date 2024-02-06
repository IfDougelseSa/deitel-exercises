package application;

public class Program {

	public static void main(String[] args) {
		/*
		 * / 2.29 (O valor inteiro de um caractere) Eis outra prévia do que virá
		 * adiante. Neste capítulo, você aprendeu sobre inteiros e o tipo int. O Java
		 * também pode representar letras maiúsculas, minúsculas e uma variedade
		 * considerável de símbolos especiais. Cada caractere tem uma representação
		 * correspondente de inteiro. O conjunto de caracteres que um computador utiliza
		 * com as respectivas representações na forma de inteiro desses caracteres é
		 * chamado de conjunto de caracteres desse computador. Você pode indicar um
		 * valor de caractere em um programa simplesmente incluindo esse caractere entre
		 * aspas simples, como em ‘A'. Você pode determinar o equivalente em inteiro de
		 * um caractere precedendo-o com (int), como em (int) 'A' Um operador dessa
		 * forma é chamado operador de coerção. (Você aprenderá sobre os operadores de
		 * coerção no Capítulo 4.) A instrução a seguir gera saída de um caractere e seu
		 * equivalente de inteiro:
		 * System.out.printf("The character %c has the value %d%n", 'A', ((int) 'A'));
		 * Quando a instrução precedente executa, ela exibe o caractere A e o valor 65
		 * (do conjunto de caracteres Unicode®) como parte da string. O especificador de
		 * formato %c é um espaço reservado para um caractere (nesse caso, ‘A').
		 * Utilizando instruções semelhantes àquela mostrada anteriormente neste
		 * exercício, escreva um aplicativo que exiba os equivalentes inteiros de
		 * algumas letras maiúsculas, minúsculas, dígitos e símbolos especiais. Mostre
		 * os equivalentes inteiros do seguinte: A B C a b c 0 1 2 $ * + / e o caractere
		 * em branco.
		 */

		/*
		 * 2.29 (The integer value of a character) Here's another preview of what's to
		 * come. In this chapter, you learned about integers and the int type. O Java
		 * can also represent uppercase letters, lowercase letters, and a considerable
		 * variety of special symbols. Each character has a corresponding integer
		 * representation. The set of characters that a computer uses with their
		 * respective representations in Integer form of these characters is called the
		 * character set of that computer. You can indicate a character value in a
		 * program by simply enclosing that character in single quotes, as in 'A'. You
		 * can determine the integer equivalent of a character by preceding it with
		 * (int), as in (int) 'A' An operator of this form is called a coercion
		 * operator. (You will learn about coercion operators in Chapter 4.) The
		 * statement The following outputs a character and its integer equivalent:
		 * System.out.printf("The character %c has the value %d%n", 'A', ((int) 'A'));
		 * When the preceding statement executes, it displays the character A and the
		 * value 65 (from the Unicode® character set) as part of the string. The %c
		 * format specifier is a placeholder for one character (in this case, 'A').
		 * Using instructions similar to the one shown earlier in this exercise, write
		 * an application that displays the equivalents integers of some uppercase and
		 * lowercase letters, digits, and special symbols. Show the integer equivalents
		 * of the following: A B C a b c 0 1 2 $ * + / and the blank character.
		 */
		
		System.out.printf("The character %c has the value %d%n", 'A', ((int) 'A'));
		System.out.printf("The character %c has the value %d%n", 'B', ((int) 'B'));
		System.out.printf("The character %c has the value %d%n", 'C', ((int) 'C'));
		System.out.printf("The character %c has the value %d%n", 'a', ((int) 'a'));
		System.out.printf("The character %c has the value %d%n", 'b', ((int) 'b'));
		System.out.printf("The character %c has the value %d%n", 'c', ((int) 'c'));
		System.out.printf("The character %c has the value %d%n", '0', ((int) '0'));
		System.out.printf("The character %c has the value %d%n", '1', ((int) '1'));
		System.out.printf("The character %c has the value %d%n", '2', ((int) '2'));
		System.out.printf("The character %c has the value %d%n", '$', ((int) '$'));
		System.out.printf("The character %c has the value %d%n", '*', ((int) '*'));
		System.out.printf("The character %c has the value %d%n", '+', ((int) '+'));
		System.out.printf("The character %c has the value %d%n", '/', ((int) '/'));
		System.out.printf("The character %c has the value %d%n", ' ', ((int) ' '));

		

	}

}
