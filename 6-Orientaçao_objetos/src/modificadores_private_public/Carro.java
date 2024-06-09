package modificadores_private_public;

public class Carro {
	String marca;
	String modelo;
	int numPassageiros;
	double capCombustivel;
	private double consumoCombustivel;
	
	public void exibirAutonomia() {
		System.out.println("A autonomia do carro é: " + this.capCombustivel * this.consumoCombustivel + " km");
	}

	public double obterAutonomia() {
		System.out.println("Método obterAutonomia foi chamado.");
		return capCombustivel * this.consumoCombustivel;
	}
	private double divideKmPorConsumoCombustivel(double km) {
		return km / this.consumoCombustivel;
	}

	public double calcularCombustive(double km) {
		return this.divideKmPorConsumoCombustivel(km);
}
}
