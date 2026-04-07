/*
 * Descripción: Clase Unifamiliar, definimos una casa unifamiliar, hija de vivienda
 * Autor: Alexis Balboteo González
 * Fecha: 25/03/2026
 */

package balboteo;

import java.time.LocalDate;

public class Unifamiliar extends Vivienda {

	public static final double M2_DEF = 80;
	public static final boolean PATIO_DEF = true;

	private double m2;
	private boolean patio;

	// constructor
	public Unifamiliar(LocalDate fechaConstruccion, String direccion, boolean disponible, double m2, boolean patio)
			throws IllegalArgumentException, IllegalStateException {
		super(fechaConstruccion, direccion, disponible);

		if (m2 <= 0) {

			new IllegalArgumentException("no puede ser un valor negativo");

		}

		this.m2 = m2;
		this.patio = patio;

	}

	// constructor 1 parametro
	public Unifamiliar(double m2) {
		this(FECHA_CONSTR_DEF, DIRECCION_DEF, DISPONIBLE_DEF, m2, PATIO_DEF);

	}

	// constructor sin parametros
	public Unifamiliar() {
		this(FECHA_CONSTR_DEF, DIRECCION_DEF, DISPONIBLE_DEF, M2_DEF, PATIO_DEF);

	}
	// devuelve si hay patio
	public void setPatio(boolean patio) {
		this.patio = patio;
	}
	
	
	
// calcula el precio de la casa dependiendo de lo que valga el m2
	@Override
	public double calcularPrecio(int dinero) {
		double precio;

		precio = this.m2 * m2 * 1.5 * dinero;

		if (isPatio()) {

			precio = precio * 1.25;

		}

		return precio;
	}

	public double getM2() {
		return m2;
	}

	public boolean isPatio() {
		return patio;
	}

	
	// nos dice si la casa es grande o no
	public boolean grande() {

		boolean resultado = false;

		if (getM2() > 100 && isPatio()) {

			resultado = true;
		}

		return resultado;
	}

	@Override
	public String toString() {
		return super.toString() + "\nUnifamiliar [m2=" + m2 + ", patio=" + patio + "]";
	}

}
