package exercicios_sobrecarga_de_metodos_construtores;

import java.util.Locale;
import java.util.Scanner;

public class TesteAluno {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Digite o nome do curso que está fazendo: ");
		String curso = scan.nextLine();
		System.out.println("Digite o nome do aluno: ");
		String nome = scan.nextLine();
		System.out.println("Digite o número da Matrícula: ");
		String matricula = scan.nextLine();
		
		
		Aluno aluno = new Aluno();
		aluno.adicionarMaterias();
		aluno.adicionarNotas();
		aluno.obterMedia();
		aluno.mostrarDados();
		aluno.obterAprovacao();

	}

}
