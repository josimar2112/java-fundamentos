package src.br.com.fundamentos;

public class TestaWhile {
	public static void main(String[] args) {

		int contador = 0;

		while (contador <= 10) {
			System.out.println("Contador -> " + contador);
			// contador = contador +1;
			// contador += 1;
			contador++;
		}
		System.out.println("Valor final do Contador " + contador);

		System.out.println("Decrescente ");
		int decrescente = 10;

		while (decrescente >= 0) {
			System.out.println("Contador = " + decrescente);
			decrescente--;

		}
	}

}
