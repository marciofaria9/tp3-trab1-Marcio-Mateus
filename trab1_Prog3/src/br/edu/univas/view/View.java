package br.edu.univas.view;

public class View {

	public void printStart() {
		System.out.println("Gerador de senha\n");

	}

	public void printInformeTamanhoMinimo() {
		System.out.println("Informe o tamanho m�nimo de caracteres que deseja para a senha: ");

	}

	public void printInformeTamanhoMaximo() {
		System.out.println("Informe o tamanho m�ximo de caracteres que deseja para a senha: ");

	}

	public void printInformeLetraMaiuscula() {
		System.out.println("Informe se a senha ter� letras mai�sculas: ");
		System.out.println("Digite 1 para sim e 0 para n�o: ");
	}

	public void printInformeLetraMinuscula() {
		System.out.println("Informe se a senha ter� letras min�scula: ");
		System.out.println("Digite 1 para sim e 0 para n�o: ");
	}

	public void printInformeNumero() {
		System.out.println("Informe se a senha ter� n�meros: ");
		System.out.println("Digite 1 para sim e 0 para n�o: ");
	}

	public void printInformeCaracteresEspeciais() {
		System.out.println("Informe se a senha ter� caracteres especiais: ");
		System.out.println("Digite 1 para sim e 0 para n�o: ");
	}

	public void informSaveLocal() {

		System.out.println("Informe o diret�rio onde deseja salvar sua senha:");

	}

	public void printSuccessMessage() {
		System.out.println("Sua senha foi salva com sucesso!!!!");

	}

}
