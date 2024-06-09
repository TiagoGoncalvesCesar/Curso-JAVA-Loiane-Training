package exercicios;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio10 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Qual a temperatura em Celsius? ");
		double c = scan.nextDouble();
		
		double f = c * 9.0 / 5.0 + 32.0;
		System.out.println("A temperatura em " + c + " C é igual a " + f + " F");
		
		scan.close();

	}

}
