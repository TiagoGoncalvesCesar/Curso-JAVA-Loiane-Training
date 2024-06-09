package exercicios_classes_metodos;

import java.util.Locale;
import java.util.Scanner;

public class Aluno2 {
	String nome;
	String curso;
	String matricula;
	double media;
	double nota1;
	double nota2;
	double nota3;

	void adicionarDados() {
		Scanner scan = new Scanner(System.in);

		System.out.println("Digite o nome do curso que está fazendo: ");
		String curso = scan.nextLine();
		System.out.println("Digite o nome do aluno: ");
		String nome = scan.nextLine();
		System.out.println("Digite o número da Matrícula: ");
		String matricula = scan.nextLine();
	}

	void adicionarMaterias() {
		Scanner scan = new Scanner(System.in);

		System.out.println("Diciplinas que está cursando: ");
		String materia1 = scan.nextLine();
		String materia2 = scan.nextLine();
		String materia3 = scan.nextLine();
	}

	public void adicionarNotas() {
		Locale.setDefault(Locale.US);
		Scanner scan = new Scanner(System.in);
		System.out.println("Digite as notas: ");
		nota1 = scan.nextDouble();
		nota2 = scan.nextDouble();
		nota3 = scan.nextDouble();
	}

	public void obterMedia() {
		media = (nota1 + nota2 + nota3) / 3;
		System.out.println("Média do aluno " + media);
	}

	public void obterAprovacao() {

		if (media >= 7) {
			System.out.println("Aluno aprovado.");
		} else {
			System.out.println("Aluno reprovado.");
		}

	}

}
