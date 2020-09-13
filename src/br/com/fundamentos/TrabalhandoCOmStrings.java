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

		String usandoSplitELimit = "fundamento - java - software - engenharia - computação ";
		String[] valorComSplitComLimit = usandoSplitELimit.split("-", 2);

		for (String s : valorComSplitComLimit) {
			System.out.println(s);
		}

		System.out.println(valor.subSequence(0, 5));
		System.out.println(valor.substring(0, 5));

		System.out.println();

		String maiusculoEMinusculo = " Treinamento em Java - trabalhando Com Classe string";
		System.out.println(maiusculoEMinusculo.toLowerCase());
		System.out.println(maiusculoEMinusculo.toUpperCase());
		System.out.println(maiusculoEMinusculo.trim());

		System.out.println();

		boolean myBoolean = true;
		System.out.println(String.valueOf(myBoolean));

		System.out.println();

		float myFloat = -10;
		System.out.println(String.valueOf(myFloat));

		System.out.println();

		int myInt = 9;
		System.out.println(String.valueOf(myInt));

		System.out.println();

		double myDouble = 10.30;
		System.out.println(String.valueOf(myDouble));

		String result = String.format(" Hoje nos processamos %,d transações ", 100000);
		System.out.println(result);

		result = String.format(" 10 / 3 = %2f", 10.0 / 3.0);
		System.out.println(result);

	}
}
