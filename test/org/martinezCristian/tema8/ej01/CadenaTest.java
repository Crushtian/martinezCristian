package org.martinezCristian.tema8.ej01;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class CadenaTest {

	// ==========================test cDelante=================================

	@Test
	public void cDelante01() {
		// ARRANGE
		Cadena actual = new Cadena("botellas");

		// ACT
		actual.cDelante("abre");

		// ASSERT
		assertEquals("abrebotellas", actual.getCadena(), "abre + botellas = abrebotellas");
	}

	@Test
	public void cDelante02() {
		// ARRANGE
		Cadena actual = new Cadena("");

		// ACT
		actual.cDelante("abre");

		// ASSERT
		assertEquals("abre", actual.getCadena(), "abre + NULL = abre");
	}

	@Test
	public void cDelante03() {
		// ARRANGE
		Cadena actual = new Cadena("botellas");

		// ACT
		actual.cDelante("");

		// ASSERT
		assertEquals("botellas", actual.getCadena(), "NULL + botellas = botellas");
	}

	// ==========================test cDetras=================================

	@Test
	public void cDetras01() {
		// ARRANGE
		Cadena actual = new Cadena("saca");

		// ACT
		actual.cDetras("puntas");

		// ASSERT
		assertEquals("sacapuntas", actual.getCadena(), "saca + puntas = sacapuntas");

	}

	@Test
	public void cDetras02() {
		// ARRANGE
		Cadena actual = new Cadena("saca");

		// ACT
		actual.cDetras("");

		// ASSERT
		assertEquals("saca", actual.getCadena(), "saca + NULL = saca");

	}

	@Test
	public void cDetras03() {
		// ARRANGE
		Cadena actual = new Cadena("");

		// ACT
		actual.cDetras("puntas");

		// ASSERT
		assertEquals("puntas", actual.getCadena(), "NULL + puntas = puntas");

	}

	// ==========================test quitar(char)=================================

	@Test
	public void quitarChar01() {
		// ARRANGE
		Cadena actual = new Cadena("coche");

		// ACT
		actual.quitar('h');

		// ASSERT
		assertEquals("coce", actual.getCadena(), "coche - h = coce");

	}

	@Test
	public void quitarChar02() {
		// ARRANGE
		Cadena actual = new Cadena("");

		// ACT
		actual.quitar('a');

		// ASSERT
		assertEquals("", actual.getCadena(), "NULL - h = NULL");

	}

	@Test
	public void quitarChar03() {
		// ARRANGE
		Cadena actual = new Cadena("alfa5656");

		// ACT
		actual.quitar('6');

		// ASSERT
		assertEquals("alfa55", actual.getCadena(), "alfa5656 - 6 = alfa55");

	}

	// ==========================test quitar(char int)=================================
	
	@Test
	public void quitarCharInt01() {
		// ARRANGE
		Cadena actual = new Cadena("Cocodrilo");

		// ACT
		actual.quitar('o',2);

		// ASSERT
		assertEquals("Ccdrilo", actual.getCadena(), "Cocodrilo - 2 primeras o = Ccdrilo");

	}
	
	@Test
	public void quitarCharInt02() {
		// ARRANGE
		Cadena actual = new Cadena("Cocodrilo");

		// ACT
		actual.quitar('C',0);

		// ASSERT
		assertEquals("Cocodrilo", actual.getCadena(), "Cocodrilo - 0 primera C = Cocodrilo");

	}
	
	@Test
	public void quitarCharInt03() {
		// ARRANGE
		Cadena actual = new Cadena("");

		// ACT
		actual.quitar('r',100);

		// ASSERT
		assertEquals("", actual.getCadena(), "NULL - 100 primeras r = NULL");

	}
}
