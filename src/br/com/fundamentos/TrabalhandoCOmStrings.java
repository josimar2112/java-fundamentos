package src.br.com.fundamentos;

public class TrabalhandoCOmStrings {
	// String nao é um tipo primitivo e sim uma classe (possui metodos)

	public static void main(String[] args) {
		char data[] = { 'a', 'b', 'c' };
		String str = new String(data);
		System.out.println(str);

		System.out.println();

		String valor = "Trabalhando com strings ";
		System.out.println(valor.charAt(0));

		System.out.println();

		System.out.println(valor.codePointAt(0));

		System.out.println();

		String treinamento = "Treinamento com String";
		System.out.println(treinamento.compareTo("Treinamento com String") == 0 ? true : false);
		System.out.println(treinamento.compareTo("TREINAMENTO COM STRING") == 0 ? true : false);
		System.out.println(treinamento.compareToIgnoreCase("TREINAMENTO COM STRING") == 0 ? true : false);

		System.out.println();

		System.out.println(treinamento.endsWith("Treinamento"));
		System.out.println(treinamento.startsWith("Trei"));
		System.out.println(treinamento.startsWith("in", 3));

		System.out.println();

		System.out.println("tamanho da String -> " + treinamento.length());

		// foreach exclusivo
		for (char c : treinamento.toCharArray()) {
			System.out.println("Char :" + c);
		}
		System.out.println();

		for (byte b : treinamento.getBytes()) {
			System.out.println("byte : " + b);
		}
		System.out.println();

		String nome = "";
		System.out.println(nome.isEmpty());

		System.out.println();

		String curso = "fundamento-em-java";
		String[] valorComSplit = curso.split("-");

		for (String s : valorComSplit) {
			System.out.println(s);

		}
	}
}
