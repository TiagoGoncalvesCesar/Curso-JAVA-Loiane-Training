package exercicios;

import java.util.Scanner;

public class Exercicio07 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Digite a base: ");
		double b = scan.nextDouble();
		System.out.print("Digite a altura: ");
		double h = scan.nextDouble();
		
		double a = b * h;
		System.out.println("Àrea =  " +a);
		
		double a1 = a * 2;
		System.out.print("Àrea ao quadrado = " +a1);
		
		
		
		
		
		scan.close();

	}

}
