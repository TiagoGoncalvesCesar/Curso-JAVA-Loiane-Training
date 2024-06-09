package exercicios_classes_atributos;



public class TesteLivro2 {

	public static void main(String[] args) {
		Livro2 livro = new Livro2();

		System.out.println("Caracteristica do livro: ");
		livro.nome = "Estudo Ads";
		livro.autor = "Tiago Gonçalves Cesar";
		livro.numPagina = 150;
		livro.categoria = "Educação";
		livro.dataLancamento = "08/03/1985";
		livro.preco = 79.90;

		System.out.println("nome do livro: " + livro.nome);
		System.out.println("Autor do livro: " + livro.autor);
		System.out.println("Número de paginas do livro: " + livro.numPagina + " paginas");
		System.out.println("Categoria do livro: " + livro.categoria);
		System.out.println("Data de lançamento do livro: " + livro.dataLancamento);
		System.out.println("O livro custa R$: " +livro.preco);
	}

}
