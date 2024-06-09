package exercicios_if_else_switch;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio20 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Digite a primeira nota: ");
		double n1 = scan.nextDouble();
		System.out.print("Digite a segunda nota: ");
		double n2 = scan.nextDouble();

		double media = (n1 + n2) / 2;
		System.out.println("Média = " + media);

		

	    if (media >= 7 && media < 10) {
			System.out.println("Aluno aprovado.");
		} else if (media < 7) {
			System.out.println("Aluno reprovado.");
		}
		else if (media >= 10) {
			System.out.println("Aluno aprovado com destinção.");
		}
        scan.close();
	}

}
