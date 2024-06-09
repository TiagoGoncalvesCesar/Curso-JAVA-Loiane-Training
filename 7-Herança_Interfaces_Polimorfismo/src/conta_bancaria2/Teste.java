package conta_bancaria2;

import java.util.Locale;
import java.util.Scanner;

public class Teste {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Digite o nome do cliente: ");
		String nomeCliente = scan.nextLine();
		System.out.println("Digite número da conta do cliente: ");
		String numConta = scan.nextLine();
		
		
		ContaBancaria conta = new ContaBancaria();
		conta.setSaldo(1300.0);
		conta.sacar();
		conta.depositar();
		
		ContaPoupanca conta2 = new ContaPoupanca();
		conta2.calcularNovoSaldo();
		
	}

}
