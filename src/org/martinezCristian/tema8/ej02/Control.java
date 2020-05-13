package org.martinezCristian.tema8.ej02;

import java.util.Calendar;

public class Control {

	public static void main(String[] args) throws FechaException {

		Calendar date = Calendar.getInstance();

		System.out.println("Resultado Day_of_week");
		
		//hay que restarle 1 al month para que sea el mes real que introduces
		
		date.set(2112, 10-1, 2);
		System.out.println(date.get(Calendar.DAY_OF_WEEK));
//		
//		date.set(2300, 6-1, 15);
//		System.out.println(date.get(Calendar.DAY_OF_WEEK));
//		
//		date.set(2020, 5-1, 3);
//		System.out.println(date.get(Calendar.DAY_OF_WEEK));
//		
//		date.set(2020, 5-1, 4);
//		System.out.println(date.get(Calendar.DAY_OF_WEEK));
//		
//		date.set(2020, 5-1, 5);
//		System.out.println(date.get(Calendar.DAY_OF_WEEK));
//		
//		date.set(2020, 5-1, 6);
//		System.out.println(date.get(Calendar.DAY_OF_WEEK));
//		
//		date.set(2020, 5-1, 7);
//		System.out.println(date.get(Calendar.DAY_OF_WEEK));
//		
//		System.out.println(date.getTime());
	}
}
