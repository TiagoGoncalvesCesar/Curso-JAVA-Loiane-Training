package exercicios_classes_atributos;

public class TesteContaCorrente {

	public static void main(String[] args) {
		ContaCorrente conta = new ContaCorrente();
		conta.nome = "Tiago Gonçalves Cesar";
		conta.agencia = "001";
		conta.numero = "3214-6";
		conta.especial = true;
		conta.saldo = 1685.32;
		conta.limiteEspecial = 500;
		
		
		System.out.println("Nome do titular da conta: " +conta.nome);
		System.out.println("Agência da conta: " +conta.agencia);
		System.out.println("Numero da conta: " +conta.numero);
		System.out.println("Saldo da cnta: " +conta.saldo);
		System.out.printf("A conta tem limite especial de:%.2f%n " ,conta.limiteEspecial);
		
		

	}

}
