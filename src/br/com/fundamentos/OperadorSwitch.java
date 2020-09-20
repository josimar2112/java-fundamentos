package src.br.com.fundamentos;

import java.util.Scanner;

public class OperadorSwitch {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);

		System.out.println("Digite o final da Placa : ");
		int finalPlaca = entrada.nextInt();

		switch (finalPlaca) {
		case 1:
			System.out.println("Vencimento em 11 de Janeiro");
			break;
		case 2:
			System.out.println("Vencimento em 12 de Janeiro");
			break;

		default:
			System.out.println("Vencimento sem data, desculpe");
			break;

		}
	}
}
