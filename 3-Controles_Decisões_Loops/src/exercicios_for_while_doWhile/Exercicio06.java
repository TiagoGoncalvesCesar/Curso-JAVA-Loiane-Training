package exercicios_for_while_doWhile;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio06 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner scan = new Scanner(System.in);

		for (int i = 1; i <= 20; i++) {
			System.out.print( i + " ");

		}

		System.out.println();
		System.out.println();

		for (int i = 1; i <= 20; i++) {
			System.out.println(i + " - " + i);

		}
		scan.close();
	}
}