package exercicios_classes_metodos;

public class ContaCorrente {

	String nome;
	String numero;
	String agencia;
	boolean especial;
	double limiteEspecial;
	double saldo;
	double saque;
	double deposito;
	double novoSaldo;

	;

	double sacar(double saque) {
		return saldo - saque;
	}

	double depositar(double deposito) {
		return saldo + deposito;
	}

	double calcular(double novoSaldo) {
		return novoSaldo = saldo - saque + deposito;

	}
}
