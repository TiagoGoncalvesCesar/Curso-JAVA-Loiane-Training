package exercicios_classes_metodos;

import java.util.Scanner;

public class TesteAluno2 {

	public static void main(String[] args) {
		//exemplo não recomendado.
		Aluno2 aluno = new Aluno2();
		aluno.adicionarDados();
		aluno.adicionarMaterias();
		aluno.adicionarNotas();
		aluno.obterMedia();
		aluno.obterAprovacao();
	}

}
