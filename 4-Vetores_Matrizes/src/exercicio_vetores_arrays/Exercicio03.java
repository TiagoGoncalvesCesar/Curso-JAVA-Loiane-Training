package exercicio_vetores_arrays;

import java.util.Scanner;

public class Exercicio03 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		int[] vetA = new int[15];
		int[] vetB = new int[vetA.length];

		for (int i = 0; i < vetA.length; i++) {

			System.out.print("Entre com o valor da posição " + i + ":");
			vetA[i] = scan.nextInt();
		}
		for (int i = 0; i < vetA.length; i++) {
			vetB[i] = vetA[i] * vetA[i];
			vetB[1] = vetA[1] * vetA[1];
			vetB[2] = vetA[2] * vetA[2];
			vetB[3] = vetA[3] * vetA[3];
			vetB[4] = vetA[4] * vetA[4];
			vetB[5] = vetA[5] * vetA[5];
			vetB[6] = vetA[6] * vetA[6];
			vetB[7] = vetA[7] * vetA[7];
			vetB[8] = vetA[8] * vetA[8];
			vetB[9] = vetA[9] * vetA[9];
			vetB[10] = vetA[10] * vetA[10];
			vetB[11] = vetA[11] * vetA[11];
			vetB[12] = vetA[12] * vetA[12];
			vetB[13] = vetA[13] * vetA[13];
			vetB[14] = vetA[14] * vetA[14];
			System.out.println();
			System.out.println("Elementos do vetorB multiplicados por vetroA:");
			System.out.println("O valor de vetB[0] é: " + vetB[0]);
			System.out.println("O valor de vetB[1] é: " + vetB[1]);
			System.out.println("O valor de vetB[2] é: " + vetB[2]);
			System.out.println("O valor de vetB[3] é: " + vetB[3]);
			System.out.println("O valor de vetB[4] é: " + vetB[4]);
			System.out.println("O valor de vetB[5] é: " + vetB[5]);
			System.out.println("O valor de vetB[6] é: " + vetB[6]);
			System.out.println("O valor de vetB[7] é: " + vetB[7]);
			System.out.println("O valor de vetB[8] é: " + vetB[8]);
			System.out.println("O valor de vetB[9] é: " + vetB[9]);
			System.out.println("O valor de vetB[10] é: " + vetB[10]);
			System.out.println("O valor de vetB[11] é: " + vetB[11]);
			System.out.println("O valor de vetB[12] é: " + vetB[12]);
			System.out.println("O valor de vetB[13] é: " + vetB[13]);
			System.out.println("O valor de vetB[14] é: " + vetB[14]);
			break;
	}

}
}