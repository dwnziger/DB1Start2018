package br.com.db1.type;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class EstadosDoBrasilTest {

	@Test
	public void SiglaEstadoTest(){
	assertEquals("PR",EstadosDoBrasil.PARANA.getUf());	
	assertEquals("SC",EstadosDoBrasil.SANTA_CATARINA.getUf());
	assertEquals("RS",EstadosDoBrasil.RIO_GRANDE_DO_SUL.getUf());
	assertEquals("SP",EstadosDoBrasil.SAO_PAULO.getUf());
	assertEquals("RJ",EstadosDoBrasil.RIO_DE_JANEIRO.getUf());
	assertEquals("MG",EstadosDoBrasil.MINAS_GERAIS.getUf());
	}
	
	@Test
	public void EstadoTest() {
	assertEquals("Paraná",EstadosDoBrasil.PARANA.getNomeDoEstado());
	assertEquals("Santa Catarina",EstadosDoBrasil.SANTA_CATARINA.getNomeDoEstado());
	assertEquals("Rio Grande do Sul",EstadosDoBrasil.RIO_GRANDE_DO_SUL.getNomeDoEstado());
	assertEquals("São Paulo",EstadosDoBrasil.SAO_PAULO.getNomeDoEstado());
	assertEquals("Rio de Janeiro",EstadosDoBrasil.RIO_DE_JANEIRO.getNomeDoEstado());
	assertEquals("Minas Gerais",EstadosDoBrasil.MINAS_GERAIS.getNomeDoEstado());
	}
}
