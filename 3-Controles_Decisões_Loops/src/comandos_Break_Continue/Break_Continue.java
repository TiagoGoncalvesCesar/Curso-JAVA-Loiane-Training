package comandos_Break_Continue;

import java.util.Scanner;

public class Break_Continue {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Digite um número: ");
		int num = scan.nextInt();
		System.out.print("Digite um limite: ");
		int max = scan.nextInt();
		
		for(int i = num;i <= max;i++) {
			System.out.println(i);
			if (i % 7 == 0) {
				System.out.println("o valor de i: "+i);
				break;
			}
		}

	}

}
