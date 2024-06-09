package exercicios_if_else_switch;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio11 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner scan = new Scanner(System.in);

		System.out.print("Digite o salário do colaborador: ");
		double salario = scan.nextDouble();

		int percentual = 0;
		if (salario <= 280) {
			percentual = 20;
			double aumento = (salario * percentual) / 100;
			double novoSalario = salario + aumento;
			System.out.println("O salário antes do reajuste: " + salario);
			System.out.println("O percentual de aumento aplicado foi: " + percentual + "%");
			System.out.println("O reajuste " + aumento);
			System.out.println("Novo salário após o aumento R$; " + novoSalario);
		} else if (salario > 280 && salario < 700) {
			percentual = 15;
			double aumento = (salario * percentual) / 100;
			double novoSalario = salario + aumento;
			System.out.println("O salário antes do reajuste: " + salario);
			System.out.println("O percentual de aumento aplicado foi: " + percentual + "%");
			System.out.println("O reajuste " + aumento);
			System.out.println("Novo salário após o aumento R$; " + novoSalario);
		} else if (salario >= 700 && salario < 1500) {
			percentual = 10;
			double aumento = (salario * percentual) / 100;
			double novoSalario = salario + aumento;
			System.out.println("O salário antes do reajuste: " + salario);
			System.out.println("O percentual de aumento aplicado foi: " + percentual + "%");
			System.out.println("O reajuste " + aumento);
			System.out.println("Novo salário após o aumento R$; " + novoSalario);
		} else if (salario >= 1500) {
			percentual = 5;
			double aumento = (salario * percentual) / 100;
			double novoSalario = salario + aumento;
			System.out.println("O salário antes do reajuste: " + salario);
			System.out.println("O percentual de aumento aplicado foi: " + percentual + "%");
			System.out.println("O reajuste " + aumento);
			System.out.println("Novo salário após o aumento R$; " + novoSalario);
			
			scan.close();
		}

	}

}
