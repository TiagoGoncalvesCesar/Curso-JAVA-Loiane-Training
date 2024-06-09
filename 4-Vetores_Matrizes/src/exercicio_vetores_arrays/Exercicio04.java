package exercicio_vetores_arrays;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio04 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner scan = new Scanner(System.in);

		int[] vetA = new int[15];
		double[] vetB = new double[vetA.length];

		for (int i = 0; i < vetA.length; i++) {

			System.out.print("Entre com o valor da posição " + i + ":");
			vetA[i] = scan.nextInt();
		}

		for (int i = 0; i < vetA.length; i++) {
			vetB[i] = Math.sqrt(vetA[i]);
			vetB[1] = Math.sqrt(vetA[1]);
			vetB[2] = Math.sqrt(vetA[2]);
			vetB[3] = Math.sqrt(vetA[3]);
			vetB[4] = Math.sqrt(vetA[4]);
			vetB[5] = Math.sqrt(vetA[5]);
			vetB[6] = Math.sqrt(vetA[6]);
			vetB[7] = Math.sqrt(vetA[7]);
			vetB[8] = Math.sqrt(vetA[8]);
			vetB[9] = Math.sqrt(vetA[9]);
			vetB[10] = Math.sqrt(vetA[10]);
			vetB[11] = Math.sqrt(vetA[11]);
			vetB[12] = Math.sqrt(vetA[12]);
			vetB[13] = Math.sqrt(vetA[13]);
			vetB[14] = Math.sqrt(vetA[14]);
			System.out.println();
			System.out.println("Vetor B (raiz quadrada de A): :");
			System.out.printf("O valor de vetB[0] é:%.2f%n", vetB[0]);
			System.out.printf("O valor de vetB[1] é:%.2f%n ", vetB[1]);
			System.out.printf("O valor de vetB[2] é:%.2f%n ", vetB[2]);
			System.out.printf("O valor de vetB[3] é:%.2f%n ", vetB[3]);
			System.out.printf("O valor de vetB[4] é:%.2f%n ", vetB[4]);
			System.out.printf("O valor de vetB[5] é:%.2f%n ", vetB[5]);
			System.out.printf("O valor de vetB[6] é:%.2f%n ", vetB[6]);
			System.out.printf("O valor de vetB[7] é:%.2f%n ", vetB[7]);
			System.out.printf("O valor de vetB[8] é:%.2f%n ", vetB[8]);
			System.out.printf("O valor de vetB[9] é:%.2f%n ", vetB[9]);
			System.out.printf("O valor de vetB[10] é:%.2f%n ", vetB[10]);
			System.out.printf("O valor de vetB[11] é:%.2f%n ", vetB[11]);
			System.out.printf("O valor de vetB[12] é:%.2f%n ", vetB[12]);
			System.out.printf("O valor de vetB[13] é:%.2f%n ", vetB[13]);
			System.out.printf("O valor de vetB[14] é:%.2f%n ", vetB[14]);
			break;
		}

	}
}
