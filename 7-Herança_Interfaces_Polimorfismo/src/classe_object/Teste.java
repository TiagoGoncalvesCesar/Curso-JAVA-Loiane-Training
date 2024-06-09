package classe_object;

public class Teste {

	public static void main(String[] args) {

		Aluno aluno = new Aluno();

		aluno.setCurso("Curso: Analise e Desenvolvimento de Sistemas");
		double[] notas = { 10, 9, 8, 9 };
		aluno.setNotas(notas);

		System.out.println(aluno);

		String s1 = "jfnfnfjj";
		String s2 = "jfnfnfjJ";

		System.out.println(s1.equalsIgnoreCase(s2));
		System.out.println(s1.equals(s2));

		Aluno aluno2 = new Aluno();

		aluno2.setCurso("Curso: Analise e Desenvolvimento de Sistemas");
		double[] notas2 = { 9, 7, 8, 9 };
		aluno2.setNotas(notas2);

		System.out.println(aluno == aluno2);
		// metodo certo de fazer comparação
		System.out.println(aluno.equals(aluno2));
		
		
	}

}
