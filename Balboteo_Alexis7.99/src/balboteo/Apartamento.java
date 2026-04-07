/*
 * Descripción: Clase apartamento, definimos apartamento , hija de vivienda
 * Autor: Alexis Balboteo González
 * Fecha: 25/03/2026
 */


package balboteo;

import java.time.LocalDate;

public class Apartamento extends Vivienda {
	
	
	public static final double M2_DEF = 80;
	public static final double DISTANCIA_DEF = 1000;
	public static final LocalDate FECHA_ULT_REFOR_DEF = LocalDate.of(2000, 10, 10);
	
	
	

	private double m2;
	private double distanciaCentro;   // EN METROS
	private LocalDate fechaUltimaReforma;

	// constructor
	
	public Apartamento(LocalDate fechaConstruccion, String direccion, boolean disponible, double m2,
			double distanciaCentro, LocalDate fechaUltimaReforma)
			throws IllegalArgumentException, IllegalStateException {
		super(fechaConstruccion, direccion, disponible);

		if(fechaUltimaReforma.isAfter(LocalDate.now())) {
			new IllegalArgumentException("no puede ser posterior a la fecha actual");
			
		}
		
		this.m2 = m2;
		this.distanciaCentro = distanciaCentro;
		this.fechaUltimaReforma = fechaUltimaReforma;
		
		
		
		
	}
	// constructor 1 parametro
	public Apartamento(LocalDate fecha, double distancia) {
		this(FECHA_CONSTR_DEF,DIRECCION_DEF,DISPONIBLE_DEF,M2_DEF, distancia, fecha);
		
		
	}
	
	// constructor sin parametros
	public Apartamento() {
		this(FECHA_CONSTR_DEF,DIRECCION_DEF,DISPONIBLE_DEF,M2_DEF,DISTANCIA_DEF,FECHA_ULT_REFOR_DEF);
		
		
		
	}
	

	// calcula el precio de la casa dependiendo de lo que valga el m2
	@Override
	public double calcularPrecio(int dinero) {
		double precio;
		
		
		precio = this.m2 * m2 *dinero;
		
		if(this.distanciaCentro<2000) {
			
			precio = precio *1.15;
			
		}
		
		
		return precio;
	}

	
	// nos devuelve si la casa es moderna o no
	public boolean moderno() {
		
		boolean resultado = false;
		
		int annosReforma = this.fechaUltimaReforma.getYear()-LocalDate.now().getYear();
		
		if(annosReforma<5) {
			resultado=true;
			
		}
		return resultado;
		
	}
	
	@Override
	public String toString() {
		return super.toString()  + "\nApartamento [m2=" + m2 + ", distanciaCentro=" + distanciaCentro + ", fechaUltimaReforma="
				+ fechaUltimaReforma + "]";
	}

	
	
	
	
}
