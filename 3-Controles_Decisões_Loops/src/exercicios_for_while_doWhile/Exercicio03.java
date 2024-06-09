package exercicios_for_while_doWhile;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio03 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Digite o nome: ");
		String nome = scan.nextLine();

		if (nome.length() < 3) {
			System.out.println("nome não pode ser menor que 3 caracteres.");
			System.out.print("Digite o nome: ");
			nome = scan.nextLine();
		}
		System.out.print("Digite a idade: ");
		int idade = scan.nextInt();

		while (idade < 0 || idade > 150) {
			System.out.println("Idade deve de 0 a 150 anos");
			System.out.print("Digite a idade: ");
			idade = scan.nextInt();
		}
		System.out.print("Digite o sálario R$: ");
		double salario = scan.nextDouble();
		if (salario <= 0) {
			System.out.println("Sálario deve ser maior que 0 e menor 150: ");
			System.out.print("Digite o sálario: ");
			salario = scan.nextDouble();
		}

		System.out.print("Digite sexo: 'f' ou 'm': ");
		String sexo = scan.next();

		String mensagem;
		switch (sexo) {
		case ("M"):
		case ("m"):
			System.out.println("Sexo: masculino");
			break;
		case ("F"):
		case ("f"):
			System.out.println("Sexo: feminino");
			break;
		default:
			System.out.println("Valor inválido.");
			System.out.print("Digite sexo: 'f' ou 'm': ");
			sexo = scan.next();
			break;
		}

		System.out.print("Digite estado civil: 's','c', 'v' ou 'd': ");
		String estadoCivil = scan.next();

		String mensagem1;
		switch (estadoCivil) {
		case ("s"):
		case ("S"):
			System.out.print("Estado civil : solteiro");
			break;
		case ("c"):
		case ("C"):
			System.out.print("Estado civil : casado");
			break;
		case ("v"):
		case ("V"):
			System.out.print("Estado civil : viúvo");
			break;
		case ("d"):
		case ("D"):
			System.out.print("Estado civil : divorciado");
			break;
		default:
			System.out.println("Valor inválido.");
			System.out.print("Digite estado civil: 's','c', 'v' ou 'd': ");
			estadoCivil = scan.next();
			break;
		}
		System.out.println();
		System.out.println();
		System.out.println("As seguintes informações foram coletadas: ");
		System.out.println("Nome: " +nome);
		System.out.println("Idade: " +idade+ " anos");
		System.out.println("Salário R$: " +salario+ " reais");
		System.out.println("Sexo: " +sexo);
		System.out.println("Estado Cívil: " +estadoCivil);
		scan.close();
	}
}
