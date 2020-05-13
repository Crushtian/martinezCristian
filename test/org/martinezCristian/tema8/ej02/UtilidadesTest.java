package org.martinezCristian.tema8.ej02;

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
	public void esFinDeSemana01 () throws FechaException{
		assertThrows(FechaException.class, ()-> this.util.esFinDeSemana(1899, 12, 31), "1899/12/31 hace saltar FechaException");
	}
	
	@Test
	public void esFinDeSemana02 () throws FechaException{
		assertThrows(FechaException.class, ()-> this.util.esFinDeSemana(3000, 1, 2), "3000/1/2 hace saltar FechaException");
	}
	
	@Test
	public void esFinDeSemana03 () throws FechaException{
		assertFalse(this.util.esFinDeSemana(1900, 1, 1), "1900/1/1 es Lunes,se espera False");
	}
	
	@Test
	public void esFinDeSemana04 () throws FechaException{
		assertFalse(this.util.esFinDeSemana(3000, 1, 1), "3000/1/1 es Miércoles,se espera False");
	}
	
	@Test
	public void esFinDeSemana05 () throws FechaException{
		assertFalse(this.util.esFinDeSemana(2606, 3, 11), "2606/3/11 es Lunes,se espera False");
	}
	
	@Test
	public void esFinDeSemana06 () throws FechaException{
		assertFalse(this.util.esFinDeSemana(2300, 6, 15), "2300/6/15 es Viernes,se espera False");
	}
	
	@Test
	public void esFinDeSemana07 ()throws FechaException{
		assertTrue(this.util.esFinDeSemana(2112, 10, 2), "2112/10/2 es Domingo, se espera True");
	}
	
	@Test
	public void esFinDeSemana08 ()throws FechaException{
		assertTrue(this.util.esFinDeSemana(2555, 8, 9), "2112/10/2 es Domingo, se espera True");
	}
}
