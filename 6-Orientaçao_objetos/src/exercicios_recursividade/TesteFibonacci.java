package exercicios_recursividade;

import java.util.Scanner;

public class TesteFibonacci {

	public static void main(String[] args) {
		Fibonacci calculadora = new Fibonacci();
		Scanner leitor = new Scanner(System.in);
		int numero;
		System.out.println("Digite o termo Fibonacci: ");
		numero = leitor.nextInt();

	
		for (int i = 1; i <= numero; i++) {
			System.out.println("Posicao " + i + ": " + calculadora.fibonacci(i));

	

		
	}

	}
}
