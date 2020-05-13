package org.martinezCristian.tema8.ej03;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class UtilidadesTest {

	private Utilidades util;

	@BeforeEach
	public void setUp() {
		this.util = new Utilidades();
	}

	@Test
	public void esPrimo01() throws NumeroException {
		assertThrows(NumeroException.class, () -> this.util.esPrimo(-1),
				"-1 está fuera del rango permitido,hace saltar Exception");
	}

	@Test
	public void esPrimo02() throws NumeroException {
		assertThrows(NumeroException.class, () -> this.util.esPrimo(1000001),
				"1000001 está fuera del rango permitido,hace saltar Exception");
	}

	@Test
	public void esPrimo03() throws NumeroException {
		assertFalse(this.util.esPrimo(0), "0 no es primo,se espera False");
	}

	@Test
	public void esPrimo04() throws NumeroException {
		assertFalse(this.util.esPrimo(1000000), "1000000 no es primo,se espera False");
	}
	@Test
	public void esPrimo05() throws NumeroException {
		assertFalse(this.util.esPrimo(1), "1 no es primo,se espera False");
	}
	@Test
	public void esPrimo06() throws NumeroException {
		assertFalse(this.util.esPrimo(999999), "999999 no es primo,se espera False");
	}
	@Test
	public void esPrimo07() throws NumeroException {
		assertTrue(this.util.esPrimo(2), "2 es primo,se espera True");
	}
	@Test
	public void esPrimo08() throws NumeroException {
		assertTrue(this.util.esPrimo(999983), "999983 es primo,se espera True");
	}
}
