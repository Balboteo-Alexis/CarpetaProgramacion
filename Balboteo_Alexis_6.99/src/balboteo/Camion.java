/*
 * Objetivo: Hcare la clase transportes playamar
 * Fecha: 18/02/2026
 * Autor: ALEXIS BALBOTEO GONZALEZ
 */

package balboteo;

import java.time.LocalDate;

public class Camion extends TransportesPlayamar {

	// Atributos de clase constantes

	// Atributos de clase variables

	// Atributos de objeto inmutables

	// Atributos de objeto variables

	private double toneladas;

	public Camion(String matricula, LocalDate fechaMatriculacion, boolean itv, int tarifaBase, double toneladas)
			throws IllegalArgumentException {
		super(matricula, fechaMatriculacion, itv, tarifaBase);

		if (toneladas < 0.5 || toneladas > 20) {
			throw new IllegalArgumentException("Las toneladas deben serr entre 0.5 y 20 toneladas");

		}

		this.toneladas = toneladas;

	}
	
	public double calcularTransporte(int kilometros) {
		
		double precio;
		
		precio = this.tarifaBase * kilometros * 5;
		
		return precio;
	}
	

	@Override
	public String toString() {

		String frase = super.toString() +	"\nCamion [toneladas=" + toneladas + "]";

		return frase;
	}
	

	
	

}
