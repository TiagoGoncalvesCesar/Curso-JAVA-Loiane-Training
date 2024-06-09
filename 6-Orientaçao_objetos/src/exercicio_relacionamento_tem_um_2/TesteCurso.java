package exercicio_relacionamento_tem_um_2;

import java.util.Scanner;

public class TesteCurso {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		Aluno[] alunos = new Aluno[5];
		System.out.println("Entre com as informações dos alunos: ");
		for (int i = 0; i < 5; i++) {
			System.out.print("Digite o nome do aluno(a) " + (i + 1) + ": ");
			String nomeAluno = scan.nextLine();
			System.out.print("Digite o número da matricula do aluno(a)");
			String matricula = scan.nextLine();
			System.out.println("Notas:");
			for (int j = 0; j < 4; j++) {
				String notas = scan.nextLine();
			}
		}

		System.out.println("Média = " + alunos);
	}

}
