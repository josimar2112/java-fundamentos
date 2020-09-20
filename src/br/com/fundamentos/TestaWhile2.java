package src.br.com.fundamentos;

public class TestaWhile2 {
	public static void main(String[] args) {

		int contador = 0;
		int total = 0;

		while (contador <= 10) {

			total = total + contador;
			System.out.println("Somado do contador " + contador + " Total = " + total);

			contador++;
		}
	}

}
