/*
 * Objetivo: Hcare la clase transportes playamar
 * Fecha: 18/02/2026
 * Autor: ALEXIS BALBOTEO GONZALEZ
 */

package balboteo;

import java.time.LocalDate;

public class TransportesPlayamar {

	// Atributos de clase constantes

	public static final String MATRICULA_DEF = "1111 AAA";
	public static final LocalDate FECHA_DEF = LocalDate.now();
	public static final boolean ITF_DEF = false;
	public static final int TARIFA_DEF = 50;
	
	
	// Atributos de clase variables
	private static short numConsecutivo = 1;
	private static short anno;
	private static int numVehiculos = 0;

	// Atributos de objeto inmutables
	protected final String identificador;

	// Atributos de objeto variables

	protected String matricula;
	protected LocalDate fechaMatriculacion;
	protected boolean itv;
	protected int tarifaBase;


	
	
	
	// constructor
	public TransportesPlayamar(String matricula, LocalDate fechaMatriculacion, boolean itv, int tarifaBase)
			throws IllegalArgumentException {

		if (fechaMatriculacion.getYear() < 2000) {
			throw new IllegalArgumentException("La fecha nno puede ser anterior a  1/1/2000");

		}

		anno = (short) LocalDate.now().getYear();

		this.identificador = generarId();

		this.matricula = matricula;
		this.fechaMatriculacion = fechaMatriculacion;
		this.itv = itv;
		this.tarifaBase = tarifaBase;

		
		 
		numVehiculos++;
		numConsecutivo++;
	}

	public String generarId() {
		String id;

		id = String.format("%d 00%d", anno-2000, numConsecutivo);

		return id;
	}

	
	public static int getNumVehiculos() {
		return numVehiculos;
	}

	public String toString() {
		return "TransportesPlayamar [identificador=" + identificador + ", matricula=" + matricula
				+ ", fechaMatriculacion=" + fechaMatriculacion + ", itv=" + itv + ", tarifaBase=" + tarifaBase
				+ ", numVehiculos=" + numVehiculos + "]";
	}

}
