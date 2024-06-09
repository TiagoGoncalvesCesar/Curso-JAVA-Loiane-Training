package exercicios_if_else_switch;

import java.util.Locale;
import java.util.Scanner;

public class Exericio22 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Digite um número:");
		int num = scan.nextInt();
		
		if(num % 2 == 0) {
			System.out.println("número par.");
		}
			else if  (num % 2 != 0) {
				System.out.println("número impar.");
			}
			
		}

	}


