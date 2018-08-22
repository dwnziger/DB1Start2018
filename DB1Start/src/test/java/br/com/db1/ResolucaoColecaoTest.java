package br.com.db1;

import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class ResolucaoColecaoTest {
	
	@Test
	public void exercicio1Test() {
		ResolucaoColecao ex = new ResolucaoColecao();
		assertTrue(ex.exercicio1().get(0).equals("Azul"));
	}

	@Test
	public void exercicio2Test() {
		ResolucaoColecao ex = new ResolucaoColecao();
		assertTrue(ex.exercicio2() == 2);		
	}
	
	@Test
	public void exercicio3Test() {
		ResolucaoColecao ex = new ResolucaoColecao();
		assertTrue(ex.exercicio3().get(0) != "pai");
		}

	@Test
	public void exercicio4Test() {
		ResolucaoColecao ex = new ResolucaoColecao();
		assertTrue(ex.exercicio4().get(1) != "Umuarama");
	}
	
	@Test
	public void exercicio5Test() {
		ResolucaoColecao ex = new ResolucaoColecao();
		assertTrue(ex.exercicio5().get(0) == "Azul");
	}
	
	@Test
	public void exercicio6Test() {
		ResolucaoColecao ex = new ResolucaoColecao();
		assertTrue(ex.exercicio6().get(1) != "Azul");
	}
	
	@Test
	public void exercicio7Test() {
		ResolucaoColecao ex = new ResolucaoColecao();
		assertTrue(ex.exercicio7().get(0) != "Ana");
	}
	
	@Test
	public void exercicio8Test() {
		ResolucaoColecao ex = new ResolucaoColecao();
		assertTrue(ex.exercicio8().get(0) == 2);
	}

}
