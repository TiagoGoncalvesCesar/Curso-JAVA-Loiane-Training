package herança_polimorfismo_sobrecarga_de_metodos;

public class Teste {

	public static void main(String[] args) {
		Pessoa pessoa = new Pessoa();
		Pessoa aluno = new Aluno();
		Pessoa professor = new Professor();
		
		pessoa.setEndereco("Rua da jacaqueira, num 45.");
		aluno.setEndereco("Rua do jabuti, num 99.");
		professor.setEndereco("Rua da mangueira, num 72.");
		
		System.out.println(pessoa.getEndereco());
		System.out.println(aluno.getEndereco());
		System.out.println(professor.getEndereco());
		
		System.out.println();
		
		System.out.println(pessoa.obterEtiquetaEndereço());
		System.out.println(aluno.obterEtiquetaEndereço());
		System.out.println(professor.obterEtiquetaEndereço());

	}

}
