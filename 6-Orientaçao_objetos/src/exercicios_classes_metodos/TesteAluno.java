package exercicios_classes_metodos;

public class TesteAluno {

	public static void main(String[] args) {
		Aluno aluno = new Aluno();
		aluno.curso = "Análise e Desenvolvimento de Sistemas";
		aluno.nome = "Tiago Gonçalves Cesar";
		aluno.matricula = "12345";
		aluno.Mat1 = "Matemática";
		aluno.Mat2 = "Português";
		aluno.Mat3 = "Rede de sistesmas";
		aluno.notaMat1 = 8.9;
		aluno.notaMat2 = 9.2;
		aluno.notaMat3 = 9.1;
		
		System.out.println("Curso: " +aluno.curso);
		System.out.println("Nome do aluno: " +aluno.nome);
		System.out.println("Número da matrícula: " +aluno.matricula);
		System.out.println("Matéria: " +aluno.Mat1);
		System.out.println("Matéria: " +aluno.Mat2);
		System.out.println("Matéria: " +aluno.Mat3);
		System.out.println("Nota em matemática:" +aluno.notaMat1);
		System.out.println("Nota em português:" +aluno.notaMat2);
		System.out.println("Nota em rede de sistemas:" +aluno.notaMat3);
		
		aluno.passar();
	}

}
