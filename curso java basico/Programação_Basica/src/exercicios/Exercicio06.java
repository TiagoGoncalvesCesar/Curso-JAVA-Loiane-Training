package exercicios;

import java.util.Locale;
import java.util.Scanner;

class Exercicio06 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Digite a área: ");
		double raio = scan.nextDouble();
		
		
		double area = raio * raio * Math.PI ;
		System.out.printf("Área = %.2f%n" ,area);
		
		scan.close();

	}

}
