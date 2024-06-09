package exercicios_classes_atributos;

public class TesteLampada {
	
	public static void main(String[] args) {
		
		Lampada lampada = new Lampada();
		System.out.println("Caracteristicas da lâmpada: ");
		lampada.cor = "branca";
		lampada.marca = "philips";
		lampada.preco = 5.99;
		lampada.potencia = "7w";
		lampada.tamanho = "22cm";
		
		lampada.tipos = new String[5];
		lampada.tipos[0] = "Abajur";
		lampada.tipos[1] = "Lampeão";
		lampada.tipos[2] = "Led";
		
		System.out.println("Cor da lâmpada: " +lampada.cor);
		System.out.println("Marca da lâmpada: " +lampada.marca);
		System.out.println("Preço da lâmpada: " +lampada.preco);
		System.out.println("Potência da lâmpada " +lampada.potencia);
		System.out.println("Tipo de lâmpada: " +lampada.tipos[2]);
		System.out.println("Tamanho da lâmpada: " +lampada.tamanho);
		
		

	}

}
