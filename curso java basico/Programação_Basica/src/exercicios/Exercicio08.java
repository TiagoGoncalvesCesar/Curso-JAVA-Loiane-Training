package exercicios;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio08 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Quantos você ganha por hora? ");
		double valor = scan.nextDouble();
		System.out.print("Número de horas trabalhadas no mês: ");
		double horas = scan.nextDouble();
		
		double salario = valor * horas;
		System.out.printf("Salário do mês R$: %.2f%n" ,salario);
		
		scan.close();

	}

}
