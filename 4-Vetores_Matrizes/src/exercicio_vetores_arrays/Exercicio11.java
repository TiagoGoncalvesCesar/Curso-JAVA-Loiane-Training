package exercicio_vetores_arrays;

import java.util.Scanner;

public class Exercicio11 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		int[] vetA = new int[10];
		int[] vetB = new int[vetA.length];

		for (int i = 0; i < vetA.length; i++) {

			System.out.print("Entre com o valor da posição " + i + ":");
			vetA[i] = scan.nextInt();
		}
		int i = 0;
			if (vetA[i] % 2 == 0) {
			
					System.out.print(vetA[i] + " ");
				}
			}
		}
	

