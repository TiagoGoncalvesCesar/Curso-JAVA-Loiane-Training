package exercicios;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio09 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Qual a temperatura em Farenheit? ");
		double f = scan.nextDouble();
		
		double c = (5* (f -32 ) / 9);
		System.out.println("A temperatura em " + f + " F é igaul a " + c + " C");
		
		scan.close();

	}

}
