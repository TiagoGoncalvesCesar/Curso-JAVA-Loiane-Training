package exercicios_for_while_doWhile;

import java.util.Scanner;

public class Exercicio01 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		boolean notaValida = false;
		do {
		System.out.print("Digite uma nota entre 0 e 10: ");
		double nota = scan.nextDouble();
		
		if (nota >= 0 && nota <= 10) {
			notaValida = true;
			System.out.println("Nota: "+nota);
		}
		else {
			System.out.println("Valor Inválido,digite novamente.");
		}
		}while (!notaValida);
		scan.close();
	}
}
		

