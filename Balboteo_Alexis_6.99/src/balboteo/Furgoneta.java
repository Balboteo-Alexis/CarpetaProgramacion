/*
 * Objetivo: Hcare la clase transportes playamar
 * Fecha: 18/02/2026
 * Autor: ALEXIS BALBOTEO GONZALEZ
 */

package balboteo;

import java.time.LocalDate;

public class Furgoneta extends TransportesPlayamar {

	// Atributos de clase constantes

	// Atributos de clase variables

	// Atributos de objeto inmutables

	// Atributos de objeto variables
	private double volumenMax;
	private boolean sistRefrigeracion;

	public Furgoneta(String matricula, LocalDate fechaMatriculacion, boolean itv, int tarifaBase, double volumenMax,
			boolean sistRefrigeracion) throws IllegalArgumentException {
		super(matricula, fechaMatriculacion, itv, tarifaBase);

		if (volumenMax < 0) {
			throw new IllegalArgumentException("No puede ser 0 o menor");
		}

		this.volumenMax = volumenMax;
		this.sistRefrigeracion = sistRefrigeracion;

	}
	
	public double calcularTransporte(int kilometros) {
		
		double precio;
		
		precio = this.tarifaBase * kilometros * 3;
		if(this.sistRefrigeracion) {
			precio *= 1.3;
		}
		
		return precio;
	}
	
	@Override
	public String toString() {

		String frase = super.toString() + "\nFurgoneta [volumenMax=" + volumenMax + ", sistRefrigeracion=" + sistRefrigeracion + "]";

		return frase;
	}
	

}
