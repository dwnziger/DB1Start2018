package br.com.db1;

public class Inteiros {
	
	public Integer somaDoisNumeros(Integer valor1, Integer valor2) {
		return valor1 + valor2;
		}
	
	public Integer subtraiaDoisNumeros(Integer valor1, Integer valor2) {
		return valor1 - valor2;
	}
	
	public Integer multiplicaDoisNumeros(Integer valor1, Integer valor2) {
		return valor1 * valor2;
	}
	
	public Integer divideDoisNumeros(Integer valor1, Integer valor2) {
		return valor1 / valor2;
	}

	public Boolean ehPar(Integer valor) {
		return valor % 2 == 0;
	}
	
	public Boolean ehMaior(Integer valor1, Integer valor2) {
		return valor1 > valor2;
		}

}
