package exercicios_if_else_switch;

import java.util.Scanner;

public class Exercicio13 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		System.out.print("Digite um número correspondente ao dia da semana: ");
		int dia = scan.nextInt();

		switch (dia) {
		case 1:
			System.out.println("Domingo:");
			break;
		case 2:
			System.out.println("Segunda-Feira:");
			break;
		case 3:
			System.out.println("Terça-Feira:");
			break;
		case 4:
			System.out.println("Quarta-Feira:");
			break;
		case 5:
			System.out.println("Quinta_feira:");
			break;
		case 6:
			System.out.println("Sexta_Feira:");
			break;
		case 7:
			System.out.println("Sábado:");
			break;
		default:
			System.out.println("Dia Inválido:");
			break;

		}

	}
}
