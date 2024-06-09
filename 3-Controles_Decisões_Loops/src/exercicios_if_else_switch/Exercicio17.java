package exercicios_if_else_switch;

import java.util.Scanner;

public class Exercicio17 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		System.out.print("Digite um número correspondente a um ano: ");
		int ano = scan.nextInt();

		if (ano % 4 == 0 || ano % 400 == 0) {
			System.out.println("o ano de " +ano + " é um ano bissexto.");
		} else if (ano % 100 != 0) {
			System.out.println("o ano de " +ano + " não é um ano bissexto.");
		}
		scan.close();
		}
	}
