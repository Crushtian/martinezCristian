package org.martinezCristian.tema9.ej01;


public class RefactorizacionPrueba {

	public void separadorGeneral(int lineas, int numCarac, char carac) {
		for (int y = 0; y < lineas; y++) {
			for (int x = 0; x < numCarac; x++) {
				System.out.print(carac);
			}
			System.out.println();
		}
	}

	public static void saltos(int s) {
		for (int i = 0; i < s; i++) {
			System.out.println();
		}
	}

	// ============= Encabezado y Pie Pequeños ===========
	public void tituloP(String titulo) {

		separadorGeneral(2, 15, '=');
		System.out.println(titulo);
		separadorGeneral(2, 15, '=');
	}

	public void cuerpoFPe(String fin) {
		System.out.println(fin);
		separadorGeneral(2, 15, '=');
	}

	// ============= Encabezado y Pie Grandes ===========
	public void tituloG(String titulo) {

		separadorGeneral(2, 20, '=');
		System.out.println(titulo);
		separadorGeneral(2, 20, '=');

	}

	public void cuerpoFGr(String fin) {
		System.out.println(fin);
		separadorGeneral(2, 20, '=');
	}

	// ================= Cuerpo ========================
	public void cuerpoT(String cuerpo) {

		System.out.println(cuerpo);
		separadorGeneral(1, 7, '*');
	}

	public void f() {

		tituloP("TEMA 1. CONTROL DE VERSIONES");
		cuerpoT("1. Conceptos Generales");
		cuerpoT("2. Repositorio centralizado. SVN");
		cuerpoFPe("3. Repositorio Distribuido. GIT");

		saltos(2);

		tituloG("REFACTORIZACIÓN");
		cuerpoT("1. Bad smells");
		cuerpoT("2. Refactorizaciones habituales");
		cuerpoFGr("3. Refactorizaciones con Eclipse");

	}

	public static void main(String[] args) {
		new RefactorizacionPrueba().f();
	}

}
