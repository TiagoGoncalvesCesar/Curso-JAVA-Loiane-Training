package exercicios_if_else_switch;

import java.util.Scanner;

public class Exercicio19 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		System.out.print("Digite um número ate 1000: ");
		int num = scan.nextInt();

		int centena = num / 100;

		int dezena = num / 10  ;
		
		int unidade = 0;

		System.out.println(
				"O número " + num + " = " + centena + " centenas, " + dezena + " dezenas, " + unidade + " unidades");
		scan.close();

	}

}
