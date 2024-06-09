package aula13operadores;

public class OperadoresAritmeticos {

	public static void main(String[] args) {
		int resultado = 1 + 2;
		System.out.println(resultado);
		
		resultado = resultado - 1;
		System.out.println(resultado);
		
		resultado = resultado * 2;
		System.out.println(resultado);
		
		resultado = resultado / 2;
		System.out.println(resultado);
		
		resultado = resultado + 8;
		System.out.println(resultado);
		
		resultado = resultado % 7;
		System.out.println(resultado);
		
		String primeiroNome = "Esta é ";
		String segundoNome = "uma String concatenada.";
		System.out.println(primeiroNome + segundoNome);
		
		String terceiroNome = primeiroNome + segundoNome;
		System.out.println(terceiroNome);
		
		resultado = resultado + 1;
		System.out.println(resultado);
		
		resultado++;
		System.out.println(resultado);
		
		System.out.println(resultado++);
		//mesma coisa que:
		//System.out.println(resultado);
		//resultado = resultado + 1;
		//rsultado += 1;
		
		System.out.println(++resultado);
		// mesma coisa que: 
		//resultado += 1;
		//System.out.println(resultado);
		
		resultado --;
		System.out.println(resultado);
		System.out.println(resultado--);
		System.out.println(--resultado);
		
		

	}

}
