/*
 * Descripción: Un ejercicico donde creamos un arraylist de empleados y hacemos varias operaciones con ellos
 * Autor: Alexis Balboteo González
 * Fecha: 15/04/2026
 */

package Balboteo1;

import java.time.LocalDate;

public class Libros extends Publicacion implements Prestamos {

	public Libros(String titulo, String autor, LocalDate fechaPublica, double precio, boolean prestado) {
		super(titulo, autor, fechaPublica, precio, prestado);
		
		
	}
	
	
	public Libros(String autor) {
		this(TITULO_DEF,autor,FECHA_DEF,PRECIO_DEF,PRESTADO_DEF);
		
	}
	
	
	
	
	

	@Override
	public double calcularPrecioPrestamo(int dias) {

		double precio;

		if (dias > 10) {

			precio = 0.01 * this.precio * dias;
			precio = precio * 0.95;

		} else {

			precio = 0.01 * this.precio * dias;

		}

		return precio;
	}
	

}
