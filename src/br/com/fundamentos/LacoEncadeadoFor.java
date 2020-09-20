package src.br.com.fundamentos;

public class LacoEncadeadoFor {
	public static void main(String[] args) {

		for (int linha = 1; linha <= 10; linha++) {

			for (int coluna = 1; coluna <= 10; coluna++) {
				if (linha > coluna)
					break;				
			System.out.print(" * ");

			}
			System.out.println();
		}
	}

}
