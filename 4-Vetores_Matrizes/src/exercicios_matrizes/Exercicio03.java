package exercicios_matrizes;

import java.util.Scanner;

public class Exercicio03 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		int countPares = 0;
		int countImpares = 0;

		int[][] matrizM = new int[3][3];

		for (int i = 0; i < matrizM.length; i++) {
			for (int j = 0; j < matrizM.length; j++) {
				System.out.println("Digite o valor da posição [" + i + "," + j + "]");
				matrizM[i][j] = scan.nextInt();
			}

		}

		for (int i = 0; i < matrizM.length; i++) {
			for (int j = 0; j < matrizM.length; j++) {
				if (matrizM[i][j] % 2 == 0)
					countPares++;
				else if (matrizM[i][j] % 2 != 0)
					countImpares++;

			}
		}
		for (int i = 0; i < matrizM.length; i++) {
			for (int j = 0; j < matrizM.length; j++) {
				System.out.print(matrizM[i][j] + " ");
			}
			System.out.println();
		}
		System.out.println("Quantidade numeros pares:" + countPares);
		System.out.println("Quantidade numeros impares:" + countImpares);

	}

}
