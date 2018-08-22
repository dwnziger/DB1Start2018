package br.com.db1;

import java.util.ArrayList;
import java.util.List;

import br.com.db1.type.Uf;

public class Cidade {
	
	private String nome;

	private Uf uf;
	
	List<Endereco> listaEndereco = new ArrayList<Endereco>();

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Uf getUf() {
		return uf;
	}

	public void setUf(Uf uf) {
		this.uf = uf;
	}

	public List<Endereco> getListaEndereco() {
		return listaEndereco;
	}

	public void setListaEndereco(List<Endereco> listaEndereco) {
		this.listaEndereco = listaEndereco;
	}

}
