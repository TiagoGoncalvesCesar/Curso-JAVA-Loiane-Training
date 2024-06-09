package encapsulamento_getteres_setteres;

public class TesteCarro {

	public static void main(String[] args) {
		Carro van = new Carro();
		van.setMarca ("Fiat");
		van.setModelo("Ducato");
		van.setNumPassageiros(10);
		van.setCapCombustivel(45);
		van.setConsumoCombustivel(10);
		
		
		System.out.println("Marca do carro: " +van.getMarca());
		System.out.println("Modelo do carro: " +van.getModelo());
		System.out.println("Número de passageiros: " +van.getNumPassageiros());
		System.out.println("Capacidade do tanque do carro: " +van.getCapCombustivel());
		System.out.println("Consumo do carro: " +van.getConsumoCombustivel());
	}

}
