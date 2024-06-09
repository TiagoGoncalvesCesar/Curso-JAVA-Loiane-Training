package exercicios_for_while_doWhile;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio10 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Digite dois números inteiros: ");
		int n1 = scan.nextInt();
		int n2 = scan.nextInt();
		
		for (int i = n1; i <= n2; i++) {
			System.out.print(i+ " ");
		}
	}

}
