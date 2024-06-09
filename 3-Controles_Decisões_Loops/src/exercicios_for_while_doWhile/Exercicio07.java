package exercicios_for_while_doWhile;

import java.util.Scanner;

public class Exercicio07 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		System.out.println("Digite 5 numeros: ");
		int n1 = scan.nextInt();
		int n2 = scan.nextInt();
		int n3 = scan.nextInt();
		int n4 = scan.nextInt();
		int n5 = scan.nextInt();

		if (n1 > n2 && n1 > n3 && n1 > n4 && n1 > n5 ) {
			System.out.println("O maior valor é n1 com número:  " +n1);
		}
		else if (n2 > n1 && n2 > n3 && n2 > n4 && n2 > n5 ) {
			System.out.println("O maior valor é n2 com número:  " +n2);
		}
		else if (n3 > n1 && n3 > n2 && n3 > n4 && n3 > n5 ) {
			System.out.println("O maior valor é n3 com número: " +n3);
		}
		else if (n4 > n1 && n4 > n2 && n4 > n3 && n4 > n5 ) {
			System.out.println("O maior valor é n4 com número: " +n4);
		}
		else if (n5 > n1 && n5 > n2 && n5 > n3 && n5 > n4 ) {
			System.out.println("O maior valor é n5 com número: " +n5);
		}
		scan.close();
	}
}