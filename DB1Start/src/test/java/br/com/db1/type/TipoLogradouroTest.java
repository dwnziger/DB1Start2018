package br.com.db1.type;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class TipoLogradouroTest {

	@Test
	public void siglaLogradouroTest() {
		assertEquals("R",TipoLogradouro.RUA.getSiglaLogradouro());		
		assertEquals("PC",TipoLogradouro.PRACA.getSiglaLogradouro());	
		assertEquals("FZ",TipoLogradouro.FAZENDA.getSiglaLogradouro());	
		assertEquals("AV",TipoLogradouro.AVENIDA.getSiglaLogradouro());	
	}
	
	@Test
	public void descricaoLogradouro() {
		assertEquals("Rua",TipoLogradouro.RUA.getDescricaoLogradouro());
		assertEquals("Avenida",TipoLogradouro.AVENIDA.getDescricaoLogradouro());	
		assertEquals("Fazenda",TipoLogradouro.FAZENDA.getDescricaoLogradouro());	
		assertEquals("Praça",TipoLogradouro.PRACA.getDescricaoLogradouro());	
	}
}
