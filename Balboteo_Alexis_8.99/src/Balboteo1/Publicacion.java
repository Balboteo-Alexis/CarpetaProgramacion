/*
 * Descripción: Un ejercicico donde creamos un arraylist de empleados y hacemos varias operaciones con ellos
 * Autor: Alexis Balboteo González
 * Fecha: 15/04/2026
 */



package Balboteo1;

import java.time.LocalDate;

public abstract class Publicacion {
	
	public final static String TITULO_DEF = "sin titulo";
	public final static String AUTOR_DEF = "sin autor";
	public final static LocalDate FECHA_DEF = LocalDate.of(2000, 1, 1);
	public final static double PRECIO_DEF = 0;
	public final static boolean PRESTADO_DEF = false;
	
	
	
	
	private static int contador = 0;
	
	
	protected String id;
	protected String titulo;
	protected String autor;
	protected LocalDate fechaPublica;
	protected double precio;
	protected boolean prestado;
	
	
	
	
	
	
	
	public Publicacion(String titulo, String autor, LocalDate fechaPublica, double precio, boolean prestado) throws IllegalArgumentException {
		
		if (fechaPublica.isBefore(LocalDate.of(1950, 1, 1)) || fechaPublica.isAfter(LocalDate.now())) {
			
			new IllegalArgumentException("Fecha incorrecta");
		}
		
		
		this.id = generarId();
		
		
		this.titulo = titulo;
		this.autor = autor;
		this.fechaPublica = fechaPublica;
		this.precio = precio;
		this.prestado = prestado;
		
		contador++;
	}

	
	


	public void setFechaPublica(LocalDate fechaPublica) throws IllegalArgumentException {
		if (fechaPublica.isBefore(LocalDate.of(1950, 1, 1)) || fechaPublica.isAfter(LocalDate.now())) {
			
			new IllegalArgumentException("Fecha incorrecta");
		}
		
		
		this.fechaPublica = fechaPublica;
	}





	public String getTitulo() {
		return titulo;
	}





	public String generarId() {

		int anno = LocalDate.now().getYear() % 100;

		String id = String.format("%s-%d-%03d", getClass().getSimpleName().charAt(0), anno, contador);

		return id;

	}
	
	
	
	@Override
	public String toString() {
		return "Publicacion [id=" + id + ", titulo=" + titulo + ", autor=" + autor + ", fechaPublica=" + fechaPublica
				+ ", precio=" + precio + ", prestado=" + prestado + "]";
	}
	
	
	

}
