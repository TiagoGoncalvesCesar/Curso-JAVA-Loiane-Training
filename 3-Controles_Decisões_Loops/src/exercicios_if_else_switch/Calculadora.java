package exercicios_if_else_switch;

import java.util.Locale;
import java.util.Scanner;

public class Calculadora {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Digite o primeiro número: ");
		int num1 = scan.nextInt();
		System.out.print("Digite o segundo número: ");
		int num2 = scan.nextInt();
		
		System.out.print("Entre com a operação (+ - * /):");
		String operacao = scan.next();
		
		double resultado = 0;
		boolean valida = true;
		
		switch(operacao){
			case "+": resultado = num1 + num2;break;
			case "-": resultado = num1 - num2;break;
			case "*": resultado = num1 * num2;break;
			case "/": resultado = num1 / num2;break;
			default:
				System.out.println("Operação Inválida.");
		}
		if(valida) {
			
			System.out.println("Resultado: " +resultado);
			
			if ( resultado >= 0) {
				System.out.println("Resultado positivo.");
			}
			else {
				System.out.println("Resultado negativo.");
			}
			if (resultado % 2 == 0) {
				System.out.println("Resultado par.");
			}
			else {
				System.out.println("Resultado impar.");
			}
		}
		
		

	}

}
