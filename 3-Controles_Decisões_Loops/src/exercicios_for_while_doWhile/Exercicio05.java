package exercicios_for_while_doWhile;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio05 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner scan = new Scanner(System.in);
		double quantPaisA = 0;
		double quantPaisB = 0;
		int anos = 0;
		
		System.out.print("Digite a popoulação de pais A: ");
		double paisA = scan.nextDouble();
		System.out.print("Digite a popoulação de pais B: ");
		double paisB = scan.nextDouble();
		System.out.print("Digite a taxa de aumento da popoulação de pais A: ");
		double taxaPaisA = scan.nextDouble();
		System.out.print("Digite a taxa de aumento da popoulação de pais B: ");
		double taxaPaisB = scan.nextDouble();
		
		
		
		while (paisA < paisB) {
			paisA += (paisA * taxaPaisA)/ 100;
			paisB += (paisB * taxaPaisB) / 100;
			anos++;
		}
		System.out.println("Aumento anual população: " +paisA);
		System.out.println("Aumento anual população: " +paisB);
		System.out.println("Após tantos "+anos+" anos, a população de pais B passará a poupulação de pais A.");
		scan.close();
	}

}
