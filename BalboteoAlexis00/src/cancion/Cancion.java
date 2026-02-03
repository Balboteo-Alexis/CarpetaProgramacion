package cancion;

public class Cancion {
	
	// Atributos de clase constantes
	public static final String TITULO_DEFAULT = "DEFAULT";
	public static final String AUTOR_DEFAULT = "DEFAULT";
	
	
	
	// Atributos de clase variables


	// Atributos de objeto inmutables
	

	// Atributos de objeto variables

	private  String  titulo;
	private  String  autor;
	
	//constructores
	
	public Cancion(String titulo, String autor) {
		
		
		this.titulo = titulo;
		this.autor = autor;
	}


	public Cancion() {
		this(TITULO_DEFAULT, AUTOR_DEFAULT );
	}
	
	
	//metodos
	public String dameTitulo() {
		String titulo;
		
		titulo = this.titulo;
		
		return titulo;
	}
	
	public String dameAutor() {
		String autor;
		
		autor = this.autor;
		
		return autor;
	}


	public void ponTitulo(String titulo)throws IllegalArgumentException {
		if(titulo.isEmpty()) {
			throw new IllegalArgumentException("No puede estar vacio este campo");
		}
		
		this.titulo = titulo;
		
		
	}


	public void ponAutor(String autor) {
		
		if(autor.isEmpty()) {
			throw new IllegalArgumentException("No puede estar vacio este campo");
		}
		this.autor = autor;
	}
	
	
	public Cancion(Cancion bonita) {
		this(bonita.titulo, bonita.autor);
	}

	
	public static Cancion clonar( Cancion bonita) {
		
		Cancion clon;
		clon = new Cancion(bonita);
		
		return clon;
		
	}


	@Override
	public String toString() {
		return "Cancion [titulo=" + titulo + ", autor=" + autor + "]";
	}
	
	
	
	

}
