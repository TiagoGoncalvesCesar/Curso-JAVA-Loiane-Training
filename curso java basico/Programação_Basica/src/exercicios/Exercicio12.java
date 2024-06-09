package exercicios;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio12 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Digite o peso: ");
		double peso = scan.nextDouble();
		System.out.print("Digite a altura: ");
		double altura = scan.nextDouble();
		
		double imc = (peso * altura) - 58;
		System.out.printf("O peso ideal: %.2f%n" ,imc);
		
		
		scan.close();

	}

}
