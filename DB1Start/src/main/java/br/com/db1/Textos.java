package br.com.db1;

import java.util.Arrays;

public class Textos {

	public String retornaMaiusculas(String texto) {
		return texto.toUpperCase();
	}
	
	public String retornaMinusculas(String texto) {
		return texto.toLowerCase();
	}
	
	public Integer retornaQuantidadeLetras(String texto) {
		return texto.length();
	}
	
	public Integer retornaQuantidadeLetrasComEspaco(String texto) {
		return texto.length();
	}
	
	public Integer retornaQuantidadeLetrasSemEspaco(String texto) {
		return (texto.trim()).length();
	}
	
	public String exibe4Letras(String texto) {
		return texto.substring(0, 4);
	}
	
	public String exibeAPartirDa3(String texto) {
		return texto.substring(3, texto.length());
	}
	
	public String exibe4UltimasLetras(String texto) {
		return texto.substring(texto.length()-4, texto.length());
	}
	
	public String exibeTextosSeparados(String texto) {
		return Arrays.toString(texto.split(","));
	}
	
	public Integer exibeVogais(String texto) {
		Integer vogal = 0;
		for (Integer inicio = 0; inicio < texto.length(); inicio++) {
			if (texto.charAt(inicio) == 'a' | texto.charAt(inicio) == 'e' | texto.charAt(inicio) == 'i' | texto.charAt(inicio) == 'o' | texto.charAt(inicio) == 'u') {
				vogal++;
			}
		}
		return vogal;
	}
	
	public String devolveInvertido(String texto) {
		return new StringBuilder(texto).reverse().toString();
	}
}
