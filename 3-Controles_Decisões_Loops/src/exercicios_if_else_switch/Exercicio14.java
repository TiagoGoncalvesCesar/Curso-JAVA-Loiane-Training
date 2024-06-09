package exercicios_if_else_switch;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio14 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner scan = new Scanner(System.in);

		System.out.print("Digite a primeira nota: ");
		double n1 = scan.nextDouble();
		System.out.print("Digite a segunda nota: ");
		double n2 = scan.nextDouble();

		double media = (n1 + n2) / 2;
		System.out.println("Média: " + media);

		if (media >= 9.0 && media <= 10.0) {
			System.out.println("Conceito: A");
			System.out.println("APROVADO");
		} else if (media >= 7.5 && media < 9.0) {
			System.out.println("Conceito: B");
			System.out.println("APROVADO");
		} else if (media >= 6.0 && media < 7.5) {
			System.out.println("Conceito: C");
			System.out.println("APROVADO");
		} else if (media >= 4.0 && media < 6.0) {
			System.out.println("Conceito: D");
			System.out.println("REPROVADO");
		}
		if (media >= 0 && media < 4.0) {
			System.out.println("Conceito: E");
			System.out.println("REPROVADO");
		}
		scan.close();
	}
}
