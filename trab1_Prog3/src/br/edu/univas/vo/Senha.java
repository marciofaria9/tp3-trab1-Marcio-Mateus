package br.edu.univas.vo;

public class Senha {
	String caracteresMinusculos = "abcdefghijklmnopqrstuvywxz";
	String caracteresMaiuculos = "ABCDEFGHIJKLMNOPQRSTUVYWXZ";
	String numeros = "0123456789";
	String caracteresEspeciais = "@#$%&*+^><";
	
	public String getCaracteresMinusculos() {
		return caracteresMinusculos;
	}
	public void setCaracteresMinusculos(String caracteresMinusculos) {
		this.caracteresMinusculos = caracteresMinusculos;
	}
	public String getCaracteresMaiuculos() {
		return caracteresMaiuculos;
	}
	public void setCaracteresMaiuculos(String caracteresMaiuculos) {
		this.caracteresMaiuculos = caracteresMaiuculos;
	}
	public String getNumeros() {
		return numeros;
	}
	public void setNumeros(String numeros) {
		this.numeros = numeros;
	}
	public String getCaracteresEspeciais() {
		return caracteresEspeciais;
	}
	public void setCaracteresEspeciais(String caracteresEspeciais) {
		this.caracteresEspeciais = caracteresEspeciais;
	}
	

}
