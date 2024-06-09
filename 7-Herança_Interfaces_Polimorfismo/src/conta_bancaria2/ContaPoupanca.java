package conta_bancaria2;

public class ContaPoupanca extends ContaBancaria {

	protected double diaRendimento;
	protected double novoSaldo3;

	public ContaPoupanca() {

	}

	public ContaPoupanca(String nomeCliente, String numConta, double saldo, double novoSaldo, double novoSaldo2,
			double valorSaque, double deposito, double diaRendimento, double novoSaldo3) {
		super(nomeCliente, numConta, saldo, novoSaldo, novoSaldo2, valorSaque, deposito);
		this.diaRendimento = diaRendimento;
		this.novoSaldo3 = novoSaldo3;
	}

	public double getNovoSaldo3() {
		return novoSaldo3;
	}

	public void setNovoSaldo3(double novoSaldo3) {
		this.novoSaldo3 = novoSaldo3;
	}

	public double getDiaRendimento() {
		return diaRendimento;
	}

	
	public void setDiaRendimento(double diaRendimento) {
		this.diaRendimento = diaRendimento;
	}

	public void calcularNovoSaldo() {
		double jurosDia = 0.03;
		this.novoSaldo3 = novoSaldo2 * jurosDia;
		System.out.printf("Saldo após juros diario:%.2f%n", novoSaldo3);
	}

}
