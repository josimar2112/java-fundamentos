package src.br.com.fundamentos;

public class Tabuada {
	public static void main(String[] args) {

		for (int multiplicador = 1; multiplicador <= 10; multiplicador++) {

			System.out.println("Tabuada do " + multiplicador);
			for (int contador = 0; contador <= 10; contador++) {

				System.out.println(multiplicador + " x " + contador + " = " + multiplicador * contador);
			}
			System.out.println();
		}
	}
}
