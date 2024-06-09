package exercicios_if_else_switch;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio12 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner scan = new Scanner(System.in);

		double descontoIR;
		double IR = 0;

		System.out.print("Digite o valor da hora: ");
		double valorHora = scan.nextDouble();
		System.out.print("Quantidade de hora de trabalhadas: ");
		double qtdHoraTrabalhada = scan.nextDouble();

		double salarioBruto = valorHora * qtdHoraTrabalhada;
		System.out.println("Salário Bruto R$: " + salarioBruto);

		if (salarioBruto <= 900) {
			System.out.println("Imposto de Renda isento:");
		} 
		else if (salarioBruto > 900 && salarioBruto < 1500) {
			descontoIR = 5;
			IR = (salarioBruto * descontoIR) / 100;
			System.out.println("IR: " + IR);
		}
		else if (salarioBruto >= 1500 && salarioBruto < 2500) {
			descontoIR = 10;
			IR = (salarioBruto * descontoIR) / 100;
			System.out.println("IR: " + IR);
		} 
		else if (salarioBruto > 2500) {
			descontoIR = 20;
			IR = (salarioBruto * descontoIR) / 100;
			System.out.println("IR: " + IR);
		}
		double inss = salarioBruto * 10 / 100;
		System.out.println("INSS R$: " + inss);

		double fgts = salarioBruto * 11 / 100;
		System.out.println("FGTS R$: " + fgts);

		double totalDescontos = IR + inss;
		System.out.println("Total de descontos R$: " + totalDescontos);

		double salarioLiquido = salarioBruto - totalDescontos;
		System.out.println("Salario Liquido R$: " + salarioLiquido);
		
		scan.close();
	}

}
