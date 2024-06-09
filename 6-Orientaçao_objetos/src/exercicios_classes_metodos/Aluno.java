package exercicios_classes_metodos;

public class Aluno {
	String nome;
	String matricula;
	String curso;
	String Mat1;
	String Mat2;
	String Mat3;
	double notaMat1;
	double notaMat2;
	double notaMat3;
	
	void passar() {
		if (notaMat1 > 7 && notaMat2 > 7 && notaMat3 > 7) {
			System.out.println("Aluno Aprovado");
		}
			else  {
				System.out.println("Aluno Reprovado");
			}
		}
	}

