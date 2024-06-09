package exercicios_sobrecarga_de_metodos_construtores;

import java.util.Locale;
import java.util.Scanner;

public class Aluno {
	private String nome;
	private String curso;
	private String matricula;
	private double media;
	private double nota1;
	private double nota2;
	private double nota3;
	private String materia1;
	private String materia2;
	private String materia3;
	
	

	public Aluno(String nome, String curso, String matricula, double media, double nota1, double nota2, double nota3,
			String materia1, String materia2, String materia3) {
		super();
		this.nome = nome;
		this.curso = curso;
		this.matricula = matricula;
		this.media = media;
		this.nota1 = nota1;
		this.nota2 = nota2;
		this.nota3 = nota3;
		this.materia1 = materia1;
		this.materia2 = materia2;
		this.materia3 = materia3;
	}

	public Aluno() {
		
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCurso() {
		return curso;
	}

	public void setCurso(String curso) {
		this.curso = curso;
	}

	public String getMatricula() {
		return matricula;
	}

	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}

	public double getMedia() {
		return media;
	}

	public void setMedia(double media) {
		this.media = media;
	}

	public double getNota1() {
		return nota1;
	}

	public void setNota1(double nota1) {
		this.nota1 = nota1;
	}

	public double getNota2() {
		return nota2;
	}

	public void setNota2(double nota2) {
		this.nota2 = nota2;
	}

	public double getNota3() {
		return nota3;
	}

	public void setNota3(double nota3) {
		this.nota3 = nota3;
	}
	public void adicionarMaterias() {
		Scanner scan = new Scanner(System.in);

		System.out.println("Diciplinas que está cursando: ");
		 materia1 = scan.nextLine();
		 materia2 = scan.nextLine();
		 materia3 = scan.nextLine();
	}
	
	public void adicionarNotas() {
		Locale.setDefault(Locale.US);
		Scanner scan = new Scanner(System.in);
		System.out.println("Digite as notas: ");
		nota1 = scan.nextDouble();
		nota2 = scan.nextDouble();
		nota3 = scan.nextDouble();
		
	}public void mostrarDados() {
		System.out.println("Matéria: " +materia1+ ",o aluno obteve nota " +nota1);
		System.out.println("Matéria: " +materia2+ ",o aluno obteve nota " +nota2);
		System.out.println("Matéria: " +materia3+ ",o aluno obteve nota " +nota3);
	}

	public void obterMedia() {
		media = (nota1 + nota2 + nota3) / 3;
		System.out.printf("Média do aluno %.2f%n ", media);
	}
	
	public void obterAprovacao() {

		if (media >= 7) {
			System.out.println("Aluno aprovado.");
		} else {
			System.out.println("Aluno reprovado.");
		}

	}
}
