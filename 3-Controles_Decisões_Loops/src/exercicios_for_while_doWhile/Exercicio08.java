package exercicios_for_while_doWhile;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio08 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner scan = new Scanner(System.in);

		System.out.println("Digite 5 numeros: ");
		int n1 = scan.nextInt();
		int n2 = scan.nextInt();
		int n3 = scan.nextInt();
		int n4 = scan.nextInt();
		int n5 = scan.nextInt();

		int soma = n1 + n2 + n3 + n4 + n5;
		int media = soma / 5;
		
		System.out.println("A soma é: " +soma);
		System.out.print("A média é: " +media);
		scan.close();

	}

}
