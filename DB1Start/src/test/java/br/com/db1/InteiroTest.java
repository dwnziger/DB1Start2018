package br.com.db1;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class InteiroTest {

	@Test
	public void somaDoisNumerosTest() {
		Inteiros inteiros = new Inteiros();
		assertTrue(inteiros.somaDoisNumeros(15, 5) == 20);
		assertFalse(inteiros.somaDoisNumeros(2, 4) == -6);
		}
	
	@Test
	public void subtraiaDoisNumerosTest() {
		Inteiros inteiros = new Inteiros();
		assertTrue(inteiros.subtraiaDoisNumeros(3, 4) == -1);
		assertFalse(inteiros.subtraiaDoisNumeros(15, 3) == 18);
		}

	@Test
	public void multiplicaDoisNumerosTest() {
		Inteiros inteiros = new Inteiros();
		assertTrue(inteiros.multiplicaDoisNumeros(5, 3) == 15);
		assertFalse(inteiros.multiplicaDoisNumeros(2, 4) == 6);
		}
	
	@Test
	public void divideDoisNumerosTest() {
		Inteiros inteiros = new Inteiros();
		assertTrue(inteiros.divideDoisNumeros(8, 2) == 4);
		assertFalse(inteiros.divideDoisNumeros(18, 2) == 8);
		}
	
	@Test
	public void ehParTest(){
		Inteiros inteiros = new Inteiros();
		assertTrue(inteiros.ehPar(2));
		assertFalse(inteiros.ehPar(3));
			}
	
	@Test
	public void ehMaiorTest(){
		Inteiros inteiros = new Inteiros();
		assertTrue(inteiros.ehMaior(10, 5));
		assertFalse(inteiros.ehMaior(10, 30));
	}
}
