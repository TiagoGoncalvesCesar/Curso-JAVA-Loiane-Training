package exercicios;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio05 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner scan = new Scanner(System.in);
		
		
		System.out.print("Digite a quantidade de metros: ");
		double metros = scan.nextDouble();
		
		double centrimetros = metros * 100;
		System.out.println(metros + " metros é igual a " + centrimetros + " centimetros");
		
		scan.close();

	}

}
