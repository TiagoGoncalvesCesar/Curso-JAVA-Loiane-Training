package exercicios_classes_atributos;

public class TesteLivro {

	public static void main(String[] args) {
		Livro livro = new Livro();

		System.out.println("Caracteristica do livro: ");
		livro.nome = "Estudo Ads";
		livro.autor = "Tiago Gonçalves Cesar";
		livro.numPagina = 150;
		livro.categoria = "Educação";
		livro.dataLancamento = "08/03/1985";

		System.out.println("nome do livro: " + livro.nome);
		System.out.println("Autor do livro: " + livro.autor);
		System.out.println("Número de paginas do livro: " + livro.numPagina + " paginas");
		System.out.println("Categoria do livro: " + livro.categoria);
		System.out.println("Data de lançamento do livro: " + livro.dataLancamento);

	}
}
