package exercicios_if_else_switch;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio15 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner scan = new Scanner(System.in);

		System.out.print("Digite o primeiro lado do triângulo: ");
		int lado1 = (int) scan.nextDouble();
		System.out.print("Digite o segundo lado do triângulo: ");
		int lado2 = (int) scan.nextDouble();
		System.out.print("Digite o terceiro lado do triângulo: ");
		int lado3 = (int) scan.nextDouble();
		
		if (((lado1 + lado2) > lado3) || ((lado1 + lado3) > lado2) && 
				((lado2 + lado3) > lado1)){

		if (lado1 == lado2  && lado1 == lado3 && lado2 == lado3)  {
			System.out.println("Triângulo Equilátero");
		} else if (lado1 != lado2 && lado1 != lado3 && lado3 != lado2) {
			System.out.println("Triângulo Escaleno");
		}
		else if (lado1 == lado2 || lado1 == lado3 || lado2 == lado3) {
			System.out.println("Triângulo Isóceles");
		}
		
		else {
			System.out.println("Não forma um triângulo");
		}
		}
		scan.close();
	}
	}

