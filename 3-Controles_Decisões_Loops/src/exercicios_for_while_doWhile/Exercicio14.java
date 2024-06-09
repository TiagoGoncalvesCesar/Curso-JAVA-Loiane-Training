package exercicios_for_while_doWhile;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio14 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner scan = new Scanner(System.in);
		
		int n = 0;
		int nImpares = 0;
		int nPares = 0;

		System.out.println("Digite 10 números inteiros: ");
		for (int i = 0; i < 10; i++) {
			 n = scan.nextInt();

			if (n % 2 != 0) {
				System.out.print("Quantidade de números impares: "+nImpares );
				nImpares++;
			}
			else {System.out.print("Quantidade de números pares: "+nPares );
			nPares++;
			}

			scan.close();

		}
	}
}
