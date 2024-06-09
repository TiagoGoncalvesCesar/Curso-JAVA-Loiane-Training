package recursividade;

public class TesteCalculadora {

	public static void main(String[] args) {
		int fatorialNR = Calculadora.fatorialNaoRecursivo(5);
		System.out.println("Fatorial não recursivo de 5 é: " +fatorialNR);
		
		int fatorialR = Calculadora.fatorialNaoRecursivo(5);
		System.out.println("Fatorial recursivo de 5 é: " +fatorialR);


	}

}
