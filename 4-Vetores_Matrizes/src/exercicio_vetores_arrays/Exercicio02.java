package exercicio_vetores_arrays;

import java.util.Scanner;

public class Exercicio02 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		int[] vetA = new int[8];
		int[] vetB = new int[vetA.length];

		for (int i = 0; i < vetA.length; i++) {

			System.out.print("Entre com o valor da posição " + i + ":");
			vetA[i] = scan.nextInt();
		}

		for (int i = 0; i < vetA.length; i++) {
			vetB[i] = vetA[i] * 2;
			vetB[1] = vetA[1] * 2;
			vetB[2] = vetA[2] * 2;
			vetB[3] = vetA[3] * 2;
			vetB[4] = vetA[4] * 2;
			vetB[5] = vetA[5] * 2;
			vetB[6] = vetA[6] * 2;
			vetB[7] = vetA[7] * 2;
			System.out.println();
			System.out.println("Elementos do vetorB multiplicados por 2:");
			System.out.println("O valor de vetB[0] é: " + vetB[0]);
			System.out.println("O valor de vetB[1] é: " + vetB[1]);
			System.out.println("O valor de vetB[2] é: " + vetB[2]);
			System.out.println("O valor de vetB[3] é: " + vetB[3]);
			System.out.println("O valor de vetB[4] é: " + vetB[4]);
			System.out.println("O valor de vetB[5] é: " + vetB[5]);
			System.out.println("O valor de vetB[6] é: " + vetB[6]);
			System.out.println("O valor de vetB[7] é: " + vetB[7]);
			break;
		}
	}

}
