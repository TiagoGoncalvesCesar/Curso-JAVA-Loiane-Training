package exercicios;

import java.util.Scanner;

public class Exercicio03 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
	System.out.print("Digite um número: " );
	int n1 = scan.nextInt();
	System.out.print("Digite um número: " );
	int n2 = scan.nextInt();
	
	int soma = n1 + n2;
	
	System.out.print("Soma: " + soma);
	
	scan.close();

	}

}
