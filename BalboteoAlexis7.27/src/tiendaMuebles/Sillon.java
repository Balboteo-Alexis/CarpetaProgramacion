package tiendaMuebles;

public final class Sillon extends Asiento implements Ajustable {

	// Atributos

	public static final byte POS_BAJADO = 0;
	public static final byte POS_SUBIDO = 1;

	private byte numPosicion;

	
	// Constructor
	public Sillon( double precio,String descripcion,  String tapiceria, String color)
			throws IllegalArgumentException {
		super(descripcion, precio, Asiento.MIN_PLAZAS, tapiceria, color);

		this.numPosicion = POS_BAJADO;

	}

	
	
	
	// Metodos
	

	@Override
	public byte obtenerPosicion() {

		return this.numPosicion;
	}

	@Override
	public byte subirPosicion() throws IllegalStateException {

		if (this.numPosicion == POS_SUBIDO) {
			throw new IllegalStateException("Error: no se pueden subir los pies del sillón. Ya están subidos");
		}
		
		this.numPosicion++;

		byte posi = this.numPosicion;
		return posi;

	}

	@Override
	public byte bajarPosicion() throws IllegalStateException {
		if (this.numPosicion == POS_BAJADO) {
			throw new IllegalStateException("Error: no se pueden bajar los pies del sillón. Ya están bajados");
		}
		
		this.numPosicion--;

		byte posi = this.numPosicion;
		return posi;
		
	}

	@Override
	public String toString() {

		String frase;

		frase = super.toString() + " [numPosicion=" + this.numPosicion + "]";

		return frase;

	}

}
