package for_each;

public class Foreach_notas {

	public static void main(String[] args) {
		
		System.out.println("Exemplo com arrays multidimenssionais");

		double[][] notasAlunos = new double[3][4];
		notasAlunos[0][0] = 10;
		notasAlunos[0][1] = 7;
		notasAlunos[0][2] = 9;
		notasAlunos[0][3] = 6;

		notasAlunos[1][0] = 9;
		notasAlunos[1][1] = 8;
		notasAlunos[1][2] = 7;
		notasAlunos[1][3] = 9;

		notasAlunos[2][0] = 8;
		notasAlunos[2][1] = 9;
		notasAlunos[2][2] = 10;
		notasAlunos[2][3] = 7;

		for (double[] notasAluno : notasAlunos) {
			for (double nota : notasAluno) {
				System.out.println(nota + " ");
			}
			System.out.println();
		}
	}

}
