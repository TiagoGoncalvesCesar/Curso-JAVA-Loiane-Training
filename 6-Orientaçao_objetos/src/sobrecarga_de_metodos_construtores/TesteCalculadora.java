package sobrecarga_de_metodos_construtores;

public class TesteCalculadora {

	public static void main(String[] args) {
		MinhaCalculadora calc = new MinhaCalculadora();
		calc.soma(1, 2);
		System.out.println("Soma = " +calc.soma(1, 2));
		
		calc.soma(1.0, 2.0);
		System.out.println("Soma = " +calc.soma(1.0, 2.0));
		
		calc.soma(1, 2, 3);
		System.out.println("Soma = " +calc.soma(1, 2, 3));
		
		calc.soma(1, 2, 3);
		System.out.println("Soma = " +calc.soma(1, 2, 3));


	}

}
