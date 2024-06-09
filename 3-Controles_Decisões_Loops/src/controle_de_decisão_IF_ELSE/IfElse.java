package controle_de_decisão_IF_ELSE;

import java.util.Scanner;

public class IfElse {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Entre com sua idade: ");
		int idade = scan.nextInt();
		
		if (idade >= 18 ) {
			System.out.println("È maior de idade: ");
		}
		else  {
			System.out.println("È menor de idade: ");
		}
		System.out.println();
		
		System.out.print("Entre com preço do item: ");
		double valor = scan.nextDouble();
		
		if (valor <= 10 ){
			System.out.println("Está barato, pode comprar:");
		}
		 else if (valor > 10 && valor < 15 ){
			System.out.println("Pedir desconto:");
		}
		 else if (valor >= 15 && valor <17) {
				System.out.println("Pesquisar mais"); 
		 }
		 else   {
				System.out.println("Muito caro:");
		 }

	}

}
