package exercicio_vetores_arrays;

import java.util.Scanner;

public class Vetores {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		int[] vetA = new int[5];
		vetA[0] = 1;
		vetA[1] = 2;
		vetA[2] = 3;
		vetA[3] = 4;
		vetA[4] = 5;

		System.out.println("O valor de vetA[0] é: " + vetA[0]);
		System.out.println("O valor de vetA[1] é: " + vetA[1]);
		System.out.println("O valor de vetA[2] é: " + vetA[2]);
		System.out.println("O valor de vetA[3] é: " + vetA[3]);
		System.out.println("O valor de vetA[4] é: " + vetA[4]);

		int[] vetB = new int[5];

		for (int i = 0; i < vetA.length; i++) {
			vetB = vetA;
			System.out.println();
			System.out.println("O valor de vetB[0] é: " + vetB[0]);
			System.out.println("O valor de vetB[1] é: " + vetB[1]);
			System.out.println("O valor de vetB[2] é: " + vetB[2]);
			System.out.println("O valor de vetB[3] é: " + vetB[3]);
			System.out.println("O valor de vetB[4] é: " + vetB[4]);
			break;
		}
	}

}
