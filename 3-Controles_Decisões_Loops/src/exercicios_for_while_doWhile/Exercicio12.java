package exercicios_for_while_doWhile;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio12 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner scan = new Scanner(System.in);

		System.out.print("Digite um numero de 1 a 10: ");
		int n = scan.nextInt();
		int i = 0;
		for (i = 1; i <= 10; i++) {
			int result = n * i;
			
			System.out.println(n + " x "+i+" = " + result);
		}
		scan.close();
	}
}