package exercicios_classes_metodos;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Cc cc = new Cc();
		Main main = new Main();

		int opcao = 0;
		do {
			System.out.println();
			System.out.println("Menu");
			System.out.println("1. Consultar saldo");
			System.out.println("2. Depositar");
			System.out.println("3. Sacar");
			System.out.println("4. Sair");
			opcao = sc.nextInt();

			switch (opcao) {
			case 1:main.consultarSaldo(cc);
				break;
			case 2: main.depositar(cc, sc);
				break;
			case 3: main.sacar(cc, sc);
			}

		} while (opcao != 4);

	}

	public void consultarSaldo(Cc cc) {
		System.out.println("Seu saldo é: " + cc.getSaldo());

	}
	public void depositar(Cc cc, Scanner sc) {
		System.out.println("Qual valor quer depositar? ");
		double valor = sc.nextDouble();
		
		cc.depositar(valor);
	}
	public void sacar(Cc cc, Scanner sc) {
		System.out.println("Qual valor quer sacar? ");
		double valor = sc.nextDouble();
		
		cc.sacar(valor);
	}

	}


