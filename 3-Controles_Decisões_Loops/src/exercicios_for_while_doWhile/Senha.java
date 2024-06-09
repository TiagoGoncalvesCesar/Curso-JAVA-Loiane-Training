package exercicios_for_while_doWhile;

import java.util.Locale;
import java.util.Scanner;

public class Senha {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner scan = new Scanner(System.in);
		
		String nome;
		String senha;
		String x;
		
		
		
			System.out.println("Digite seu nome de usuário: ");
			nome = scan.nextLine();
			
			System.out.println("Digite sua senha: ");
			senha = scan.nextLine();
			
			x = "sim";
			
			while(nome.equalsIgnoreCase(senha) && x.equals("sim")) {
				System.out.println("Erro");
				System.out.println("Digite seu nome de usuário: ");
				nome = scan.nextLine();
				System.out.println("Digite sua senha: ");
				senha = scan.nextLine();
				System.out.println("Tentar novamente sim/nao? ");
				x = scan.nextLine();
			}
			scan.close();
	}

}
