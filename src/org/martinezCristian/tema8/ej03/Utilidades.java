package org.martinezCristian.tema8.ej03;

public class Utilidades {

	public boolean esPrimo(int num) throws NumeroException {

		if (num < 0 || num > 1000000) {
			throw new NumeroException("numero fuera de rango");
		} else {

			int cont = 2;
			boolean primo = true;

			while ((primo) && (cont != num)) {
				if (num % cont == 0) {
					primo = false;

				} else {

					cont++;
				}
			}

			if (primo == true) {
				System.out.println("es primo");
			} else
				System.out.println("no es primo");

			return primo;
		}

	}
}
