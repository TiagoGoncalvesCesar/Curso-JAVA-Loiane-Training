package exercicios_if_else_switch;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio08 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner scan = new Scanner(System.in);

		System.out.print("Digite o primeiro preço: ");
		double p1 = scan.nextDouble();
		System.out.print("Digite o segundo preço: ");
		double p2 = scan.nextDouble();
		System.out.print("Digite o terceiro preço: ");
		double p3 = scan.nextDouble();

		if (p1 <= p2 && p1 <= p3) {
			System.out.println("O produto p1 é o produto de menor preço que voce deve levar, custa " + p1);
		} else if (p2 <= p1 && p2 <= p3) {
			System.out.println("O  produto p2 é o produto de menor preço que voce deve levar, custa " + p2);
		} else if(p3 <= p1 && p3 <= p2) {
			System.out.println("O produto p3 é o produto de menor preço que voce deve levar, custa " + p3);
		}
		scan.close();
	}

}
