package exercicios_classes_metodos;

public class Teste_Conta_Corrente {

	public static void main(String[] args) {
		ContaCorrente conta =  new ContaCorrente();
		conta.nome = "Tiago Gonçalves Cesar";
		conta.agencia = "001";
		conta.numero = "35624-7";
		conta.limiteEspecial = 500.00;
		conta.saldo = 1000;
		
		System.out.println("Nome do cliente: " +conta.nome);
		System.out.println("Agência: " +conta.agencia);
		System.out.println("Número da conta: " +conta.numero);
		System.out.println("Limite do cheque especial: " +conta.limiteEspecial);
		System.out.println("Saldo em conta: " +conta.saldo);
		
		System.out.println("Saldo após o saque: " +conta.sacar(200));
		System.out.println("Saldo após depósito: " +conta.depositar(300));
		System.out.println("Novo saldo: " +conta.calcular(0));
		}
	}


