package exercicios_if_else_switch;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio06 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner scan = new Scanner(System.in);

		System.out.println("Digite o primeiro número: ");
		double n1 = scan.nextDouble();
		System.out.println("Digite o segundo número: ");
		double n2 = scan.nextDouble();
		System.out.println("Digite o terceiro número: ");
		double n3 = scan.nextDouble();
		
		if (n1 >= n2 && n1 >= n3){
			System.out.println("O valor maior é n1 com número:" + n1);
		}
		else if (n2 >= n1 && n2 >= n3){
			System.out.println("O valor maior é n2 com número:" + n2);
	}
		else if(n3 >= n1 && n3 >= n2) {
			System.out.println("O valor maior é n3 com número:" + n3);
		}

}
}
