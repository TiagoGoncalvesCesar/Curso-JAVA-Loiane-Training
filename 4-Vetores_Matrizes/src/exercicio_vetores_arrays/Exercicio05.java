package exercicio_vetores_arrays;

import java.util.Scanner;

public class Exercicio05 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		int[] vetA = new int[10];
		int[] vetB = new int[vetA.length];

		for (int i = 0; i < vetA.length; i++) {

			System.out.print("Entre com o valor da posição " + i + ":");
			vetA[i] = scan.nextInt();
		}
		for (int i = 0; i < vetA.length; i++) {
			vetB[i] = vetA[i] * i;
		}
			 System.out.print("Vetor A = ");
		        for ( int i=0; i<vetA.length; i++){
		            System.out.print(vetA[i] + " ");
		        }
		        System.out.println();

		        System.out.print("Vetor B = ");
		        for ( int i=0; i<vetB.length; i++){
		            System.out.print(vetB[i] + " ");
		        }
		        System.out.println();

	}
}
