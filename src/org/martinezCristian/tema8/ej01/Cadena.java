package org.martinezCristian.tema8.ej01;

public class Cadena {

	private String cadena;

	public Cadena(String cadena) {
		super();
		this.cadena = cadena;
	}

	public String getCadena() {
		return this.cadena;
	}

	public void cDelante(String s) {

		this.cadena = s + this.cadena;
	}

	public void cDetras(String s) {

		this.cadena = this.cadena + s;

	}

	public void quitar(char c) {

		this.cadena = this.cadena.replaceAll(c + "", "");

	}

	public void quitar(char c, int i) {

		while (i > 0) {
			this.cadena = this.cadena.replaceFirst("" + c, "");
			i--;
		}

	}

}
