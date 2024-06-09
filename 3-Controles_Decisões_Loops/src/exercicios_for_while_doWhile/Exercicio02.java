package exercicios_for_while_doWhile;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio02 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner scan = new Scanner(System.in);

		boolean infoValidas = false;
		String nome;
		String senha;
		do {
			System.out.print("Digite nome do usuario: ");
			 nome = scan.nextLine();
			System.out.print("digite sua senha: ");
			 senha = scan.nextLine();

			if (nome.equalsIgnoreCase(senha)) {
				System.out.println("Senha igual a usuário, digite novamente.");
			}

			else {
				infoValidas = true;
				System.out.println("Senha e usuário válidos.");
			}
		} while (!infoValidas);
	}
}
