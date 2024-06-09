package exercicios_classes_metodos;

public class Cc {
	private int numeroConta = 12345;
	private double saldo = 500;
	
	public Cc() {
		
	}

	public int getNumeroConta() {
		return numeroConta;
	}

	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
	
	public void depositar(double valor) {
		setSaldo(getSaldo() + valor);
	}
	public void sacar(double valor) {
		if(getSaldo()>= valor) {
			setSaldo(getSaldo()-valor);
		}else {
			System.out.println("Valor não pode ser maior que o seu saldo");
		}
		 
	}

}
