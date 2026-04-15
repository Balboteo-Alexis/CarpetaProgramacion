/*
 * Descripción: Un ejercicico donde creamos un arraylist de empleados y hacemos varias operaciones con ellos
 * Autor: Alexis Balboteo González
 * Fecha: 15/04/2026
 */
package Balboteo1;

import java.time.LocalDate;

public class Revistas extends Publicacion implements Prestamos {
	
	
	public enum Periocidad{SEMANAL,MENSUAL, SEMESTRAL};
	
	public final static Periocidad PERIOCIDAD_DEF = Periocidad.SEMANAL;
	public final static String PAIS_DEF = "España";
	
	private Periocidad periocidad;
	private String pais;
	
	public Revistas(String titulo, String autor, LocalDate fechaPublica, double precio, boolean prestado, Periocidad periocidad, String pais) {
		super(titulo, autor, fechaPublica, precio, prestado);
		this.periocidad = periocidad;
		this.pais = pais;
	}
	
	public Revistas() {
		this(TITULO_DEF,AUTOR_DEF,FECHA_DEF,PRECIO_DEF,PRESTADO_DEF, PERIOCIDAD_DEF,PAIS_DEF);
		
	}
	
	

	public double calcularPrecioPrestamo(int dias) {

		double precio;

		if (this.pais != "España") {

			precio = 0.5 * dias;
			precio = precio +2;

		} else {

			precio = 0.5 * dias;

		}

		return precio;
	}

	@Override
	public String toString() {
		return super.toString() + "[periocidad=" + periocidad + ", pais=" + pais + "]";
	}
	
	
	
	
	

	
}
