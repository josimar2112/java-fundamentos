package src.br.com.fundamentos;

import javax.swing.text.StyledEditorKit.BoldAction;

public class TrabalhandoComVariaveis {
	public static void main(String[] args) {
		int quantidade; //declarando variavel inteiro
		quantidade = 10; //atribuindo o valor 10
		
		System.out.println(quantidade);
		
		quantidade = 15;
		
		System.out.println(quantidade);
		
		// tipos primitivos https://medium.com/@mauriciogeneroso/java-oca-1z0-808-2-1-tipos-de-dados-vari%C3%A1veis-vari%C3%A1veis-primitivas-e-de-refer%C3%AAncia-c8f007756bc5
		
		
		double numeroComVirgula;
		numeroComVirgula = 1.3;
		
		System.out.println("Numero decimal = " + numeroComVirgula);
		
		float numeroComVirgulaPontoFlutuante = 1.5f;
		System.out.println("Numero decimal com float = " + numeroComVirgulaPontoFlutuante);
		
		long numeroInteiroGrande = 25l;
		System.out.println(" Numero inteiro com Long = " + numeroInteiroGrande);
		
		boolean alunoMatriculado = true;
		boolean clienteBloquado = false;
		
		char turmaAluno1 = 'A';
		char tipoCliente = '2';
		char simbolo = '@';
		
		String nomePessoa = "Alicio";
		
		long populacaoUberlandia = 650000;
		System.out.println(populacaoUberlandia);
		
		long populacaoMundial = 700000000;
		System.out.println(populacaoMundial);
		
		Float saldoConta = 1030.43f;
		System.out.println(saldoConta);
		
		
		

	}

}
