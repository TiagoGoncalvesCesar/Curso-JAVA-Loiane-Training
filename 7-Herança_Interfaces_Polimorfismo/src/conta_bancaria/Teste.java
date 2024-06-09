package conta_bancaria;

public class Teste {

	public static void main(String[] args) {
		  System.out.println("*** Teste ContaBancaria ***");

	        ContaBancaria contaSimples = new ContaBancaria();
	        contaSimples.setNomeCliente("Tiago Gonçalves Cesar");
	        contaSimples.setNumConta("12345-8");

	        contaSimples.depositar(100);

	        realizarSaque(contaSimples, 50);

	        realizarSaque(contaSimples, 70);

	        System.out.println(contaSimples);
	        
	        
	        System.out.println();
	        System.out.println("*** Teste ContaPoupança ***");

	        ContaPoupanca contaPoupacanca = new ContaPoupanca();
	        contaPoupacanca.setNomeCliente("Tiago Gonçalves Cesar");
	        contaPoupacanca.setNumConta("12345-9");
	        contaPoupacanca.setDiaRendimento(3);

	        contaPoupacanca.depositar(100);

	        realizarSaque(contaPoupacanca, 50);

	        realizarSaque(contaPoupacanca, 70);

	        if (contaPoupacanca.calcularNovo(0.5)){
	            System.out.println("Rendimento aplicado, novo saldo é de = " + contaPoupacanca.getSaldo());
	        } else {
	            System.out.println("Hoje não é dia de rendimento, novo saldo não calculado");
	        }

	        System.out.println(contaPoupacanca);
	        
            System.out.println();
	        System.out.println("*** Teste ContaEspecial ***");

	        ContaEspecial contaEspecial = new ContaEspecial();
	        contaEspecial.setNomeCliente("Tiago Gonçalves Cesar");
	        contaEspecial.setNumConta("12345-0");
	        contaEspecial.setLimite(50);

	        contaEspecial.depositar(100);

	        realizarSaque(contaEspecial, 50);

	        realizarSaque(contaEspecial, 70);

	        realizarSaque(contaEspecial, 80);

	        System.out.println(contaEspecial);
	    }

	    private static void realizarSaque(ContaBancaria conta, double valor){
	        if (conta.sacar(valor)){
	            System.out.println("Saque efetuado com sucesso, novo saldo = " + conta.getSaldo());
	        } else {
	            System.out.println("Saldo insuficiente para saque de " + valor + "; saldo de = " + conta.getSaldo());
	        }
	    }
	}