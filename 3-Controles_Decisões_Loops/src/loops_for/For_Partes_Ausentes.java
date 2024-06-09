package loops_for;

public class For_Partes_Ausentes {

	public static void main(String[] args) {
		int count = 0;

		for (; count < 10;) {
			System.out.println("Count = " + count);
			count += 2;
		}
		System.out.println();
		
		for(int cont = 0; cont < 10; cont = cont += 2) {
			System.out.println("Cont = " +cont);
		}
		
		System.out.println();
		
		int soma = 0;
		for (int i = 1;i < 5; soma += i++); 
			System.out.println("O valor da soma é  "+ soma);
		
		System.out.println();
		
		for (  int i = 0; i < 5; i++)
		System.out.println("i = " + i);
		
	}

}
