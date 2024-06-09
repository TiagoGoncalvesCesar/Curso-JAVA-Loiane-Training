package conta_bancaria2;

import java.util.Scanner;

public class ContaBancaria {
	protected String nomeCliente;
	protected String numConta;
	protected double saldo;
	protected double novoSaldo;
	protected double novoSaldo2;
	protected double valorSaque;
	protected double deposito;

	public ContaBancaria() {

	}

	public ContaBancaria(String nomeCliente, String numConta, double saldo, double novoSaldo, double novoSaldo2,
			double valorSaque, double deposito) {
		super();
		this.nomeCliente = nomeCliente;
		this.numConta = numConta;
		this.saldo = saldo;
		this.novoSaldo = novoSaldo;
		this.novoSaldo2 = novoSaldo2;
		this.valorSaque = valorSaque;
		this.deposito = deposito;
	}

	public String getNomeCliente() {
		return nomeCliente;
	}

	public void setNomeCliente(String nomeCliente) {
		this.nomeCliente = nomeCliente;
	}

	public String getNumConta() {
		return numConta;
	}

	public void setNumConta(String numConta) {
		this.numConta = numConta;
	}

	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

	public double getNovoSaldo() {
		return novoSaldo;
	}

	public void setNovoSaldo(double novoSaldo) {
		this.novoSaldo = novoSaldo;
	}

	public double getValorSaque() {
		return valorSaque;
	}

	public void setValorSaque(double valorSaque) {
		this.valorSaque = valorSaque;
	}

	public double getNovoSaldo2() {
		return novoSaldo2;
	}

	public void setNovoSaldo2(double novoSaldo2) {
		this.novoSaldo2 = novoSaldo2;
	}

	public double getDeposito() {
		return deposito;
	}

	public void setDeposito(double deposito) {
		this.deposito = deposito;
	}

	public void sacar() {
		Scanner scan = new Scanner(System.in);
		System.out.println("Digite o valor do saque: ");
		double valorSaque = scan.nextDouble();
		novoSaldo = saldo - valorSaque;
		System.out.printf("Saldo após o saque:%.2f%n ", novoSaldo);
	}

	public void depositar() {
		Scanner scan = new Scanner(System.in);
		System.out.println("Digite o valor do depósito: ");
		double deposito = scan.nextDouble();
		novoSaldo2 = novoSaldo + deposito;
		System.out.printf("Saldo após o depósito:%.2f%n ", novoSaldo2);
	}
}
