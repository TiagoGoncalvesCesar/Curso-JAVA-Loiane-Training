package exercicios_for_while_doWhile;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio04 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner scan = new Scanner(System.in);
		
		int paisA = 80000;
		int paisB = 200000;
		double taxaPaisA = 3;
		double taxaPaisB = 1.5;
		int anos = 0;
		double popPaisA = (paisA * taxaPaisA) / 100;
		System.out.println("População pais A: " +popPaisA);
		double popPaisB = (paisB * taxaPaisB) / 100;
		System.out.println("População pais B: " +popPaisB);
		
		double quantPaisA = paisA + popPaisA;
		System.out.println("Aumento anual população: " +quantPaisA);
		double quantPaisB = paisB + popPaisB;
		System.out.println("Aumento anual população: " +quantPaisB);
		
		while (paisA < paisB) {
			paisA += (paisA * taxaPaisA) / 100;
			paisB += (paisB * taxaPaisB)/ 100;
			anos++;
		}
		System.out.println("Apos tantos "+anos+" anos, a população de pais B passará a poupulação de pais A.");
		scan.close();
	}

}
