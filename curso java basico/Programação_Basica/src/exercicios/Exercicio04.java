package exercicios;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio04 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Digite a primeira nota: ");
		double n1 = scan.nextDouble();
		System.out.print("Digite a segunda nota: ");
		double n2 = scan.nextDouble();
		System.out.print("Digite a terceira nota: ");
		double n3 = scan.nextDouble();
		System.out.print("Digite a quarta nota: ");
		double n4 = scan.nextDouble();
		
		double media = (n1 + n2 + n3 + n4) / 4;
		System.out.printf("Média:%.2f%n " , media);
		
		scan.close();
		
	}

}
