package exercicios_matrizes;

import java.util.Random;

public class Exercicio01 {

	public static void main(String[] args) {
		
		int[][]matrizM = new int[4][4];
		   Random matrizRandom = new Random();
		    
		   for(int i = 0; i < matrizM.length; i++) {
			   for(int j = 0; j < matrizM.length; j++ ) {
				   matrizM[i][j] = matrizRandom.nextInt(100);
			   }
		   }
			   int maior = 0;
			   int linha = 0;
			   int coluna = 0;
			   
			   for(int i = 0; i < matrizM.length; i++) {
				   for(int j = 0; j < matrizM.length; j++ ) {
					 if (matrizM[i][j] > maior) {
						 maior = matrizM[i][j];
						 linha = i;
						 coluna = j;
					 }
				   }
			   }
			   for(int i = 0; i < matrizM.length; i++) {
				   for(int j = 0; j < matrizM.length; j++ ) {
					 System.out.print(matrizM[i][j] + " ");
				   }
				   System.out.println();
			   }
			   System.out.println("Maior valor: " +maior);
			   System.out.println("Linha: " +linha);
			   System.out.println("Coluna: " +coluna);
	}

}
