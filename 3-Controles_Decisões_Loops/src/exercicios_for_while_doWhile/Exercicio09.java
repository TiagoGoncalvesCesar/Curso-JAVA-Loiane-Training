package exercicios_for_while_doWhile;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio09 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Imprima na tela os números imapares entre 1 e 50:");

		for (int i = 1; i <= 50; i++) {
			if (i % 2 != 0) {
				System.out.print(i + " ");
			}
			
		}
		scan.close();
	}
}
