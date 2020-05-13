package org.martinezCristian.tema8.ej04;

import java.util.Arrays;

public class Control {

	public static void main(String[] args) throws InputDataException {
		// TODO Auto-generated method stub

		Vector v = new Vector();
		
		int[] ar = {80,60,65,43,23,77};
		
		System.out.println(Arrays.toString(ar));
		
		v.ordenar(ar);
		
		System.out.println(Arrays.toString(ar));
		
		
	}

}
