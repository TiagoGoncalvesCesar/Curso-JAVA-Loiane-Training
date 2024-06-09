package exercicio_vetores_arrays;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Exercicio09 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		System.out.println("Vetores da posição vetA:");
		int[] vetA = new int[10];
		for (int i = 0; i < vetA.length; i++) {

			System.out.print("Entre com o valor da posição de vetA " + i + ":");
			vetA[i] = scan.nextInt();
		}
		System.out.println("Vetores da posição vetB:");
		int[] vetB = new int[10];
		for (int i = 0; i < vetB.length; i++) {

			System.out.print("Entre com o valor da posição de vetB " + i + ":");
			vetB[i] = scan.nextInt();
		}
		System.out.print("Vetor A = ");
		for (int i = 0; i < vetA.length; i++) {
			System.out.print(vetA[i] + " ");
		}
		System.out.println();
		System.out.print("Vetor B = ");
		for (int i = 0; i < vetB.length; i++) {
			System.out.print(vetB[i] + " ");
		}
		double[] vetC = new double[vetA.length];
		for (int i = 0; i < vetA.length; i++) {
			vetC[i] = vetA[i] / vetB[i];
		}
		System.out.println();
		DecimalFormat df = new DecimalFormat("###,###.##");
		System.out.print("Vetor C = ");
		for (int i = 0; i < vetC.length; i++) {
			System.out.print(vetC[i] + " ");
		}
	}

}

