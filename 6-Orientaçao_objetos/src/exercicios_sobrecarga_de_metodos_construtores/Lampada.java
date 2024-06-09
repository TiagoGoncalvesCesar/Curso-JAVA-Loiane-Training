package exercicios_sobrecarga_de_metodos_construtores;

public class Lampada {
	private String cor;
	private String marca;
	private double preco;
	private String potencia;
	private String tamanho;
	private String[] tipos;
	private boolean ligada;
	private boolean desligada;
	
	
	public Lampada(String cor, String marca, double preco, String potencia, String tamanho, String[] tipos,
			boolean ligada, boolean desligada) {
		super();
		this.cor = cor;
		this.marca = marca;
		this.preco = preco;
		this.potencia = potencia;
		this.tamanho = tamanho;
		this.tipos = tipos;
		this.ligada = ligada;
		this.desligada = desligada;
	}
	public Lampada() {
		
	}
	public String getCor() {
		return cor;
	}
	public void setCor(String cor) {
		this.cor = cor;
	}
	public String getMarca() {
		return marca;
	}
	public void setMarca(String marca) {
		this.marca = marca;
	}
	public double getPreco() {
		return preco;
	}
	public void setPreco(double preco) {
		this.preco = preco;
	}
	public String getPotencia() {
		return potencia;
	}
	public void setPotencia(String potencia) {
		this.potencia = potencia;
	}
	public String getTamanho() {
		return tamanho;
	}
	public void setTamanho(String tamanho) {
		this.tamanho = tamanho;
	}
	public String[] getTipos() {
		return tipos;
	}
	public void setTipos(String[] tipos) {
		this.tipos = tipos;
	}
	public boolean isLigada() {
		return ligada;
	}
	public void setLigada(boolean ligada) {
		this.ligada = ligada;
	}
	public boolean isDesligada() {
		return desligada;
	}
	public void setDesligada(boolean desligada) {
		this.desligada = desligada;
	}
	public void ligar() {
		
		setLigada (true);
	}

	public void desligar() {
		
		setLigada (false);
	}

	public void mostrarEstado() {
		if (isLigada()) {
			System.out.println("A lamapada está ligada");
		} else {
			System.out.println("A lamapada está ligada");
		}
	}
		void mudarEstado() {
			if ( isLigada()) {
				desligar();
			}
			else {
				ligar();
			}
		}
	
}

