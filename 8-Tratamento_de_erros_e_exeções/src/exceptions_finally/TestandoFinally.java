package exceptions_finally;

public class TestandoFinally {

	public static void main(String[] args) {
		int[] numeros = { 4, 8, 16, 32, 64, 128 };
		int[] demon = { 2, 0, 4, 8, 0 };

		for (int i = 0; i < numeros.length; i++) {
			try {
				System.out.println(numeros[i] + "/" + demon[i] + " = " + (numeros[i] / demon[i]));
			} catch (ArithmeticException e1) {
				System.out.println("Erro ao dividir por zero");
			} catch (ArrayIndexOutOfBoundsException e2) {
				System.out.println("Ultimo numero do array não tem demon" + " para dividir ");
			}
			finally {
				System.out.println("Essa linha é impressa sempre após o try ou catch");
			}
		}
	}
}
