package org.martinezCristian.tema8.ej04;

import java.util.Arrays;

public class Vector {

	public int[] ordenar(int[] vector) throws InputDataException {

		if (vector == null || vector.length > 5000) {
			throw new InputDataException("Array vacia o supera el número de elementos permitidos");
		} else {
			Arrays.sort(vector);
		}

		return vector;
	}
}
