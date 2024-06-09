package exercicios_if_else_switch;

import java.util.Scanner;

public class Exercicio04 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		System.out.print("Digite uma letra:");
		String letra = scan.next();

		/*
		 * if (letra.equalsIgnoreCase("a") || letra.equalsIgnoreCase("b") ||
		 * letra.equalsIgnoreCase("i") || letra.equalsIgnoreCase("o") ||
		 * letra.equalsIgnoreCase("u")) {
		 * System.out.println("A letra digitado é vogal:"); } else {
		 * System.out.println("A letra digitado é cosoante:"); }
		 */

		if (letra.length() > 1) {
			System.out.println("Não é uma letra válida:");
		} else {
			switch (letra) {
			case "a":
			case "e":
			case "i":
			case "o":
			case "u":
			case "A":
			case "E":
			case "I":
			case "O":
			case "U":
				System.out.println("A letra digitado é vogal:");
				break;
			default:
				System.out.println("A letra digitado é cosoante:");
			}
		}
	}
}
