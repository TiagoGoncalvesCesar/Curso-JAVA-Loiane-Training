package exercicios;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio11 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Digite um numero inteiro: ");
		int n1 = scan.nextInt();
		System.out.print("Digite um numero inteiro: ");
		int n2 = scan.nextInt();
		System.out.print("Digite um numero real: ");
		double n3 = scan.nextDouble();
		
		int resultado1 = (n1 * 2) * (n2 / 2);
		System.out.println("resultado1: " + resultado1);
		
		double resultado2 = (3 * n1) + n3;
		System.out.println("resultado2: " + resultado2);
		
		double resultado3 = (n3 * n3 * n3);
		System.out.printf("resultado2: %.2f%n " ,resultado3);
		
		
		
		scan.close();
		

	}

}
