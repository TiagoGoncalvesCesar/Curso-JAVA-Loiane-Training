package exercicios_if_else_switch;

import java.util.Scanner;

public class Exercicio02 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		System.out.print("Digite um nùmero: ");
		double n = scan.nextDouble();
		
		if ( n >= 0) {
			System.out.println("Número positivo.");
		}
		else if (n < 0){
			System.out.println("Número negativo.");
		}
	}

}
