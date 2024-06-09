package exercicios;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio13 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner scan = new Scanner(System.in);

		System.out.print("Digite o sexo, F para feminino ou M para masculino: ");
		String sexo = scan.nextLine();

		System.out.print("Digite o peso: ");
		double peso = scan.nextDouble();
		System.out.print("Digite a altura: ");
		double h = scan.nextDouble();

		if (sexo == "M") {
			double imcM = (peso * h) - 58;
			System.out.printf("Peso ideal: %.2f.%n" + imcM);
		}
		if (sexo == "F") {
			double imcF = (peso * h) - 44;
			System.out.printf("Peso ideal: %.2f.%n" + imcF);
		}

		scan.close();

	}

}
