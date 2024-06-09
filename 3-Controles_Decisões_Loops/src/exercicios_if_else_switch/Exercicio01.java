package exercicios_if_else_switch;

import java.util.Scanner;

public class Exercicio01 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		System.out.println("Digite dois nùmeros: ");
		double n1 = scan.nextDouble();
		double n2 = scan.nextDouble();

		if (n1 > n2) {
			System.out.println("o número " + n1 + " é maior que " + n2);
		} else if (n2 > n1) {
			System.out.println("o número " + n2 + " é maior que " + n1);
		}

	}

}
