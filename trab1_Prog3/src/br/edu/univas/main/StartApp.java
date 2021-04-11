package br.edu.univas.main;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import br.edu.univas.view.View;
import br.edu.univas.vo.Senha;
import java.util.Random;
import java.io.*;

public class StartApp {

	private static Scanner scanner = new Scanner(System.in);
	private static View view = new View();

	public static void main(String[] args) throws IOException {

		Senha senha = new Senha();

		String pass = "";
		String valida = "^";
		String password = "";
		boolean isTrue = false;

		int choice = 0;

		view.printStart();

		view.printInformeTamanhoMinimo();
		int tamanhoMin = readInt();

		view.printInformeTamanhoMaximo();
		int tamanhoMax = readInt();

		view.printInformeLetraMaiuscula();
		choice = readInt();

		if (choice == 1) {
			pass = senha.getCaracteresMaiuculos();
			valida = valida + "(?=.*[A-Z])";
		}

		view.printInformeLetraMinuscula();
		choice = readInt();

		if (choice == 1) {
			pass = pass + senha.getCaracteresMinusculos();
			valida = valida + "(?=.*[a-z])";
		}

		view.printInformeNumero();
		choice = readInt();

		if (choice == 1) {
			pass = pass + senha.getNumeros();
			valida = valida + "(?=.*\\d)";
		}

		view.printInformeCaracteresEspeciais();
		choice = readInt();

		if (choice == 1) {
			pass = pass + senha.getCaracteresEspeciais();
			valida = valida + "(?=.*[@#$%&*+^><])";
		}

		valida = valida + ".{" + tamanhoMin + "," + tamanhoMax + "}$";

		do {

			password = createPassword(pass, tamanhoMin, tamanhoMax);
			isTrue = isValidPassword(password, valida);

		} while (isTrue == false);

		savePassword(password);

	}

	public static String createPassword(String pass, int tamanhoMin, int tamanhoMax) {
		char[] ch = new char[pass.length()];
		for (int i = 0; i < pass.length(); i++) {
			ch[i] = pass.charAt(i);

		}

		StringBuilder builder = new StringBuilder();
		Random random = new Random();

		int idx = random.nextInt((tamanhoMax - tamanhoMin) + 1) + tamanhoMin;

		for (int i = 0; i < idx; i++) {
			int posicao = (int) (Math.random() * ch.length);
			builder.append(ch[posicao]);

		}

		String password = builder.toString();
		return password;

	}

	public static int readInt() {
		int value = scanner.nextInt();
		scanner.nextLine();

		return value;
	}

	public static boolean isValidPassword(String password, String validate) {
		Pattern pattern = Pattern.compile(validate);
		Matcher matcher = pattern.matcher(password);
		return matcher.matches();
	}

	public static void savePassword(String password) throws IOException {
		view.informSaveLocal();

		String saveLocal = scanner.nextLine();

		File arquivo = new File(saveLocal, "secret_password.txt");
		BufferedWriter bf = new BufferedWriter(new FileWriter(arquivo));
		bf.write(password);
		bf.flush();
		bf.close();

		view.printSuccessMessage();

	}

}
