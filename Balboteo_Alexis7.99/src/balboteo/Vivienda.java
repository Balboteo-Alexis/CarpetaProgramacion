/*
 * Descripción: Clase vivienda, clase abstracta y padre de unifamiliar y apartamento
 * Autor: Alexis Balboteo González
 * Fecha: 25/03/2026
 */


package balboteo;

import java.time.LocalDate;

public abstract class Vivienda {

	
	public static final int MAX_CONTADOR = 9999;
	public static final LocalDate FECHA_CONSTR_DEF = LocalDate.of(1980, 10, 10);
	public static final String DIRECCION_DEF = "Sin dirección";
	public static final boolean DISPONIBLE_DEF = true;
	
	
	private static int contador = 0;
	
	
	
	protected final String identificador;

	protected LocalDate fechaConstruccion;
	protected String direccion;
	protected boolean disponible;

	
	// constructor
	public Vivienda(LocalDate fechaConstruccion, String direccion, boolean disponible) throws IllegalArgumentException, IllegalStateException{

		if(contador>= 999) {
			new IllegalStateException("Numero maximo de viviendas creadas");
		}

		
		
		
		this.identificador = generarId();

		this.fechaConstruccion = fechaConstruccion;
		this.direccion = direccion;
		this.disponible = disponible;
		
		contador++;

	}
	
	
	// generamosel id de las casas con este metodo
	public String generarId() {

		int anno = LocalDate.now().getYear() %100; 
		
		String id = String.format("%d-%03d", anno,contador);
		
		
		return id;
		
	}


	// nos devuelve si la casa esta disponible para venta
	
	public void setDisponible(boolean disponible) {
		this.disponible = disponible;
	}


	// nos devuelte el numero de id que tendrá la casa
	public static int getContador() {
		return contador;
	}


	// metodo abstracto para calcular precios emn las clases hijas
	public abstract double calcularPrecio(int dinero);
	

	@Override
	public String toString() {
		return "\nVivienda [identificador=" + identificador + ", fechaConstruccion=" + fechaConstruccion + ", direccion="
				+ direccion + ", disponible=" + disponible + "]";
	}
	
	
	

}
