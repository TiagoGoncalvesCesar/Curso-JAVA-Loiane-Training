package exercicios_classes_metodos;

public class Lampada {
	public String cor;
	String marca;
	double preco;
	String potencia;
	String tamanho;
	String[] tipos;
	boolean ligada;
	boolean desligada;

	void ligar() {
		ligada = true;
	}

	void desligar() {
		ligada = false;
	}

	void mostrarEstado() {
		if (ligada) {
			System.out.println("A lamapada está ligada");
		} else {
			System.out.println("A lamapada está ligada");
		}
	}
		void mudarEstado() {
			if ( ligada) {
				desligar();
			}
			else {
				ligar();
			}
		}
	
}
