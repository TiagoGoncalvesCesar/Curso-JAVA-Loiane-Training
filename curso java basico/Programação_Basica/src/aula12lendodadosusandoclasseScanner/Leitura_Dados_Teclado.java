package aula12lendodadosusandoclasseScanner;

import java.util.Locale;
import java.util.Scanner;

public class Leitura_Dados_Teclado {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Digite seu nome completo: ");
		String nomeCompleto = scan.nextLine();
		System.out.println("Seu nome completo é :" +nomeCompleto);
		
		System.out.println("Digite seu primeiro nome : ");
		String primeiroNome = scan.next();
		System.out.println("Seu nome completo é: " +primeiroNome);
		
		System.out.println("digite a sua idade: ");
		int idade = scan.nextInt();
		System.out.println("Sua idade é: " +idade);
		
		System.out.println("Digite sua altura: ");
		double altura = scan.nextDouble();
		System.out.println("A sua altura é: " +altura);
		
		System.out.println("Digite seu primeiro nome, idade, quantidade de filhos, altura e se tem bichinho de estimação: ");
		String primeiroNome1 = scan.next();
		 int idade1 = scan.nextInt();
		byte qtdFilhos = scan.nextByte();
		float altura1 = scan.nextFloat();
		boolean temPet = scan.nextBoolean();
		
		System.out.println("Você digitou os seguintes dados: ");
		System.out.println("Primeiro nome: " +primeiroNome1);
		System.out.println("Idade: " +idade1);
		System.out.println("Quantidade de filhos: " +qtdFilhos);
		System.out.println("Altura: " +altura1);
		System.out.println("Tem bichinho de estimação? " +temPet);
		
		
	}

}
