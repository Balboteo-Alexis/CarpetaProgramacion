package tiendaMuebles;



public final class Estanteria extends Almacenaje {

	// atributos

	private String tipo;

	// constructor
	public Estanteria(String descripcion, double precio, int numMaxModulos, double anchura, double altura, String tipo)
			throws IllegalArgumentException {
		super(descripcion, precio, numMaxModulos, anchura, altura);

		this.tipo = tipo;

	}

	// metodos

	public String getTipo() {
		return this.tipo;
	}
	

	
	
	@Override
	public void añadirModulo(Modulo modulo) throws IllegalStateException, NullPointerException, IllegalArgumentException {
		super.añadirModulo(modulo);
		
//		if(modulo == null) {
//			throw new NullPointerException("\"Error: el módulo a añadir no puede ser nulo");       	me lo puedo ahorrar por que esta en el metodo de la case padre?
//		}
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
