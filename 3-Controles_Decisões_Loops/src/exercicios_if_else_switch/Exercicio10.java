package exercicios_if_else_switch;

import java.util.Scanner;

public class Exercicio10 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		System.out.println("Em que turno você estuda? M para matutino, V para vespertino ou N para nortuno: ");
		String turno = scan.next();

		String mensagem;
		switch (turno) {
		case ("M"):
		case ("m"):	
			System.out.println("Bom dia.");
			break;
		case ("V"):
		case ("v"):	
			System.out.println("Boa tarde.");
			break;
		case ("N"):
		case ("n"):	
			System.out.println("Boa noite.");
			break;
		default:
			System.out.println("Valor Inválido.");
			break;

		}

		scan.close();

	}
}
