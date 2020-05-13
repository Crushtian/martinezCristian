package org.martinezCristian.tema8.ej04;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class VectorTest {

	private Vector vector;

	@BeforeEach
	public void setUp() {
		this.vector = new Vector();
	}
	@Test
	public void vector01() throws InputDataException {
		int[] a = null;
		assertThrows(InputDataException.class, ()-> this.vector.ordenar(a),"Un array null espera una InputDataException");
	}
	@Test
	public void vector02() throws InputDataException {
		int[] a = new int [5001];
		assertThrows(InputDataException.class, ()-> this.vector.ordenar(a),"Un array con mas de 5000 elementos espera una InputDataException");
	}
	@Test
	public void vector03() throws InputDataException {
		int[] a = {1,27,33,4,68};
		assertArrayEquals(vector.ordenar(a), a);
	}
	
	@Test
	public void vector04() throws InputDataException {
		int[] a = {5,5,5,5};
		assertArrayEquals(vector.ordenar(a), a);
	}

}
