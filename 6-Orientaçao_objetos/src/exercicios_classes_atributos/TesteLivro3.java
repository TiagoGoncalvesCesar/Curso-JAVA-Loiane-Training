package exercicios_classes_atributos;
import java.util.Date;
public class TesteLivro3 {

	public static void main(String[] args) {
		Livro3 livro = new Livro3();

		System.out.println("Caracteristica do livro: ");
		livro.nome = "Estudo Ads";
		livro.autor = "Tiago Gonçalves Cesar";
		livro.numPagina = 150;
		livro.categoria = "Educação";
		livro.dataLancamento = "08/03/1985";
		livro.emprestadoPara = "Jaqueline Marins";
		livro.dataSaida = new Date();
		livro.dataVolta = new Date();

		System.out.println("nome do livro: " + livro.nome);
		System.out.println("Autor do livro: " + livro.autor);
		System.out.println("Número de paginas do livro: " + livro.numPagina + " paginas");
		System.out.println("Categoria do livro: " + livro.categoria);
		System.out.println("Data de lançamento do livro: " + livro.dataLancamento);
		System.out.println("Emprestado para: " +livro.emprestadoPara);
		System.out.println("Data de entrada: " +livro.dataSaida);
		System.out.println("Data de entrada: " +livro.dataVolta);
	}

}
