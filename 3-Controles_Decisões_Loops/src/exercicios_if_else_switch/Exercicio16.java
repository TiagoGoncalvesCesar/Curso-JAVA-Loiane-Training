package exercicios_if_else_switch;

import java.util.Scanner;

public class Exercicio16 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int a = 0;
		int b = 0;
		int c = 0;

		System.out.print("digite valor de a: ");
		 a = scan.nextInt();
		if (a == 0) {
			System.out.println("Não é equação de 2° grau.");
		} else {
			System.out.print("digite valor de b: ");
			b = scan.nextInt();
			System.out.print("digite valor de c: ");
			c = scan.nextInt();
		}

		double delta = (b * b) - (4 * a * c);
		if (delta < 0) {
			System.out.println("Equação não possui raizes.");
		} else {
			System.out.println("delta = "+delta);
			double x1 = ((-b) + Math.sqrt(delta)) / (2 * a);
			double x2 = ((-b) - Math.sqrt(delta)) / (2 * a);
			System.out.println("x1 = " + x1);
			System.out.println("x2 = " + x2);
		}
	}

}
