package exercicios_matrizes;

import java.util.Random;

public class Exercicio02 {

	public static void main(String[] args) {

		int[][] matrizM = new int[10][10];
		Random matrizRandom = new Random();

		for (int i = 0; i < matrizM.length; i++) {
			for (int j = 0; j < matrizM.length; j++) {
				matrizM[i][j] = matrizRandom.nextInt(100);
			}
		}
		for (int i = 0; i < matrizM.length; i++) {
			for (int j = 0; j < matrizM.length; j++) {
				System.out.print(matrizM[i][j] + " ");
			}
			System.out.println();
		}

		int maiorL5 = 0;
		int menorL5 = 101;
		int linha5 = 5;

		for (int i = 0; i < matrizM[linha5].length; i++) {
			if (matrizM[linha5][i] > maiorL5) {
				maiorL5 = matrizM[linha5][i];
			}

			if (matrizM[linha5][i] < menorL5) {
				menorL5 = matrizM[linha5][i];
			}
		}
			System.out.println("Maior valor da linha 5: " + maiorL5);
			System.out.println("Menor valor da linha 5: " + menorL5);
			System.out.println("Linha: " + linha5);
		
		int maiorC7 = 0;
		int menorC7 =101;
		int coluna7 = 7;

		for (int i = 0; i < matrizM.length; i++) {
			if (matrizM[i][coluna7] > maiorC7) {
				maiorC7 = matrizM[i][coluna7];
			}
			if (matrizM[i][coluna7] < menorC7) {
				menorC7 = matrizM[i][coluna7];
			}
		}
			System.out.println("Maior valor da coluna 7: " + maiorC7);
			System.out.println("Menor valor da coluna 7: " + menorC7);
			System.out.println("Coluna: " + coluna7);
		}
}