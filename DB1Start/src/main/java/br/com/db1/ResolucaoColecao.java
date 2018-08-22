package br.com.db1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ResolucaoColecao {
	
	public static void main(String[] args) {
		exercicio1();
		exercicio2();
		exercicio3();
		exercicio4();
		exercicio5();
		exercicio6();
		exercicio7();
		exercicio8();

	}

	public static List<String> exercicio1() {
		List<String> cores = new ArrayList<String>();
		cores.add("Azul");
		cores.add("Verde");
		cores.add("Preto");
		cores.add("Cinza");

		System.out.println(cores);
		return cores;
	}

	public static Integer exercicio2() {
		List<String> nomes = new ArrayList<String>();
		nomes.add("Eliezer");
		nomes.add("Danziger");
		return nomes.size();
	}

	public static List<String> exercicio3() {
		List<String> parentes = new ArrayList<String>();
		parentes.add("pai");
		parentes.add("mae");
		parentes.add("irma");
		parentes.add("irmao");
		parentes.add("tios");
		parentes.add("tias");
		parentes.add("primos");

		parentes.remove("pai");
		parentes.remove("mae");
		System.out.println(parentes);

		return parentes;
	}

	public static List<String> exercicio4() {
		List<String> cidades = new ArrayList<String>();
		cidades.add("Cruzeiro do Oeste");
		cidades.add("Umuarama");
		cidades.add("Maringá");

		cidades.remove("Umuarama");
		System.out.println(cidades);

		return cidades;
	}

	public static List<String> exercicio5() {
		List<String> cores = new ArrayList<String>();
		cores = exercicio1();

		Collections.sort(cores);
		System.out.println(cores);

		return cores;
	}

	public static List<String> exercicio6() {
		List<String> cores2 = new ArrayList<String>();
		cores2.add("Preto");
		cores2.add("Azul");
		cores2.add("Verde");
		cores2.add("Cinza");

		cores2.remove("Azul");
		System.out.println(cores2);

		return cores2;
	}

	public static List<String> exercicio7() {
		List<String> parentes = new ArrayList<String>();
		parentes.add("Ana");
		parentes.add("André");
		parentes.add("Edna");
		parentes.add("Eliézer");

		Collections.reverse(parentes);
		System.out.println(parentes);

		return parentes;
	}

	public static List<Integer> exercicio8() {
		List<Integer> pares = new ArrayList<Integer>();
		List<Integer> impares = new ArrayList<Integer>();
		List<Integer> total = new ArrayList<Integer>();

		for (Integer inicio = 1; inicio <= 20; inicio++) {
			if (inicio % 2 == 0) {
				pares.add(inicio);
			}
			if (inicio % 2 != 0) {
				impares.add(inicio);
			}
		}
		total.addAll(pares);
		total.addAll(impares);

		System.out.println(total);
		return total;

	}

}
