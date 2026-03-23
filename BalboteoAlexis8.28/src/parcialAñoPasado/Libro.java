package parcialAñoPasado;

import java.time.LocalDate;

public abstract class Libro {

	
	public static enum  generos {CUENTO, NOVELA,FICCION};
	
	public static final String TITULO_POR_DEFECTO = "Sin título";
    public static final String AUTOR_POR_DEFECTO = "Anónimo";
    public static final LocalDate FECHA_PUBLICACION_POR_DEFECTO = LocalDate.of(2000, 1, 1);
    public static final String GENERO_POR_DEFECTO = "CUENTO";
    public static final boolean DISPONIBILIDAD_POR_DEFECTO = true;
	
	
	
	
	
	
	
	private static int contador = 1;

	protected final String identificador;
	protected String titulo;
	protected String autor;
	protected LocalDate fechaPublicacion;
	protected String genero;
	protected boolean disponibilidad;

	public Libro( String titulo, String autor, LocalDate fechaPublicacion, String genero,
			boolean disponibilidad)throws IllegalArgumentException {
		
		if( generos.valueOf(genero) != generos.CUENTO &&  generos.valueOf(genero) != generos.FICCION &&  generos.valueOf(genero) != generos.NOVELA) {
			
			new IllegalArgumentException("error al escoger genero");
			
		}
		if(fechaPublicacion.isAfter(LocalDate.now())) {
			
			new IllegalArgumentException("error en la fecha, no puede ser posterior a hoy");
		}
		
		
		
		
		this.titulo = titulo;
		this.autor = autor;
		this.fechaPublicacion = fechaPublicacion;
		this.genero = genero;
		this.disponibilidad = disponibilidad;
		
		this.identificador = generarId();
		
		contador++;
		
	}

	public static int getContador() {
		return contador;
	}

	public static void setContador(int contador) {
		Libro.contador = contador;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getAutor() {
		return autor;
	}

	public void setAutor(String autor) {
		this.autor = autor;
	}

	public LocalDate getFechaPublicacion() {
		return fechaPublicacion;
	}

	public void setFechaPublicacion(LocalDate fechaPublicacion) {
		this.fechaPublicacion = fechaPublicacion;
	}

	public String getGenero() {
		return genero;
	}

	public void setGenero(String genero) {
		this.genero = genero;
	}

	public boolean isDisponibilidad() {
		return disponibilidad;
	}

	public void setDisponibilidad(boolean disponibilidad) {
		this.disponibilidad = disponibilidad;
	}

	public String getIdentificador() {
		return identificador;
	}

	protected abstract String generarId();
	protected abstract double calcularPrecio();
	
	
	
	
	
	public int annosDesdePublicacion() {
		int resultado;
		
		resultado = LocalDate.now().getYear() - getFechaPublicacion().getYear();
		
		
		return resultado;
	}
	
	
	

	@Override
	public String toString() {
		return "Libro [identificador=" + identificador + ", titulo=" + titulo + ", autor=" + autor
				+ ", fechaPublicacion=" + fechaPublicacion + ", genero=" + genero + ", disponibilidad=" + disponibilidad
				+ "]";
	}
	
	
	
	

}
