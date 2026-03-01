package tiendaMuebles;



public final class Estanteria extends Almacenaje {

	// atributos

	private String tipo;

	// constructor
	public Estanteria( double precio, String descripcion,  double anchura, double altura,int numMaxModulos, String tipo)
			throws IllegalArgumentException {
		super( precio,descripcion, anchura, altura, numMaxModulos);

		this.tipo = tipo;

	}

	// metodos

	public String getTipo() {
		return this.tipo;
	}
	

	
	
	@Override
	public void anyadirModulo(Modulo modulo) throws IllegalStateException, NullPointerException, IllegalArgumentException {
		super.anyadirModulo(modulo);
		
		if(modulo == null) {
			throw new NullPointerException("Error: el módulo a añadir no puede ser nulo");       	
		}
		if(modulo != Modulo.BALDA) {
			throw new IllegalArgumentException("Solo se pueden añadir baldas");
		}
		
		
		
	}
	
	
	

	@Override
	public String toString() {

		String frase;

		frase = super.toString() + "[tipo=" + tipo + "]";

		return frase;

	}

	



}
