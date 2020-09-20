package src.br.com.fundamentos;

import java.util.Scanner;

public class ifPlaca {
public static void main(String[] args) {
	Scanner entrada = new Scanner(System.in);
	
	int finalPlaca = entrada.nextInt();
	
	if(finalPlaca == 1) {
		System.out.println("Vencimento dia 12 de Janeiro");
	}else if (finalPlaca ==2) {
			System.out.println("Vencimento dia 13 de Janeiro");
	}else {
		System.out.println("Vencimento sem data, desculpe");
	}
}
}