package org.martinezCristian.tema8.ej02;

import java.util.Calendar;

public class Utilidades {

	
	public boolean esFinDeSemana(int anyo, int mes, int dia) throws FechaException {
		
		boolean retorno;
		
		Calendar date = Calendar.getInstance();
		date.set(anyo, mes-1, dia);
		
		if ((anyo < 1900) || (anyo >= 3000 && mes>=1 && dia >1 )) {
			throw new FechaException("fecha no válida");
		}else {
			if ((date.get(Calendar.DAY_OF_WEEK) == 7)||(date.get(Calendar.DAY_OF_WEEK) == 1)) {
				retorno= true;
			} else retorno = false;
			
		}
		return retorno;
	}
}
