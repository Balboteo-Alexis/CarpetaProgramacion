package tiendaMuebles;

public final class Armario extends Almacenaje {

	// Atributos

	public final static int MIN_PUERTAS = 1;
	public final static int MAX_PUERTAS = 6;

	private int numPuertas;

	// cosntructor
	public Armario(double precio,String descripcion,   double anchura, double altura,int numMaxModulos, int numPuertas)
			throws IllegalArgumentException {
		super(precio,descripcion, anchura, altura,  numMaxModulos);

		if (numPuertas > MAX_PUERTAS || numPuertas < MIN_PUERTAS) {

			throw new IllegalArgumentException(
					"No se puede crear el Armario. El número de puertas no está en el rango permitido. ");
		}

		this.numPuertas = numPuertas;
	}

	// Metodos
	public int getNumPuertas() {
		return this.numPuertas;
	}

	@Override
	public String toString() {

		String frase;

		frase = super.toString() + "[numPuertas=" + numPuertas + "]";

		return frase;

	}

	@Override
	public void anyadirModulo(Modulo modulo) throws IllegalStateException, NullPointerException {
		
		super.anyadirModulo(modulo);
		
		
	}


}
