package comandos_Break_Continue;

import java.util.Scanner;

public class Comando_Continue {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		System.out.print("Digite um número: ");
		int num = scan.nextInt();
		System.out.print("Digite um limite: ");
		int max = scan.nextInt();

		for (int i = num; i <= max; i++) {
			if (i % 7 == 0) {
				continue;
			}
			System.out.println("o valor de i: " + i);
		}

		System.out.println();
		System.out.println("i difeferente de 7:");
		// imprime só os números divisiveis por 7.
		for (int i = num; i <= max; i++) {
			if (i % 7 != 0) {
				continue;
			}
			System.out.println("o valor de i: " + i);
		}
	}

}
