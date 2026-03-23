package parcialAñoPasado;

import java.time.LocalDate;

public class LibroDigital extends Libro {
	
	public static enum documento {pdf, epub, mobi};
	
	private double tamañoArchivo;
	private String formatoDocumento;
	
	
	public LibroDigital(String titulo, String autor, LocalDate fechaPublicacion, String genero, boolean disponibilidad,  double tamañoArchivo)
			throws IllegalArgumentException {
		super(titulo, autor, fechaPublicacion, genero, disponibilidad);
		
		
		this.tamañoArchivo = tamañoArchivo;
		this.formatoDocumento = "epub";
		
	}
	
	public LibroDigital(double tamañoArchivo, String documento) {
		super(TITULO_POR_DEFECTO,AUTOR_POR_DEFECTO,FECHA_PUBLICACION_POR_DEFECTO,GENERO_POR_DEFECTO,DISPONIBILIDAD_POR_DEFECTO);
		
		this.tamañoArchivo = tamañoArchivo;
		
		
		this.formatoDocumento = documento;
		
		
		
	}


	public double getTamañoArchivo() {
		return tamañoArchivo;
	}


	public String getFormatoDocumento() {
		
		
		return  this.formatoDocumento;
	}


	@Override
	protected String generarId() {

		
		String id;

		id = String.format("%s-%s-%04d", getClass().getSimpleName().toUpperCase().substring(5).charAt(0),
				getGenero().substring(0, 3), getContador());

		return id;
		
	}


	@Override
	protected double calcularPrecio() {

		double resultado;

		resultado = getTamañoArchivo() * 0.45;
		
		if(documento.valueOf(getFormatoDocumento()) != documento.epub ) {
			
			resultado = resultado +1.5;
		}

		return resultado;
	}

	@Override
	public String toString() {
		return super.toString() + "LibroDigital [tamañoArchivo=" + tamañoArchivo + ", formatoDocumento=" + formatoDocumento + "]";
	}
	
	
	
	
	
	
}
