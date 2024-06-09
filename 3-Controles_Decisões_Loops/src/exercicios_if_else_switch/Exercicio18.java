package exercicios_if_else_switch;

import java.text.SimpleDateFormat;
import java.util.Scanner;

public class Exercicio18 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		System.out.print("Digite uma data no formato dd/mm/aaaa:");
		String data = scan.nextLine();

		if (validarData(data)) {
			System.out.println("data valida");
		}
		else {
			System.out.println("data invalida");
		}
		scan.close();
	}

	private static boolean validarData(String data) {
		// TODO Auto-generated method stub
		return false;
	}

}
