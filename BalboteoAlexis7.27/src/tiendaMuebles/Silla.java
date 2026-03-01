package tiendaMuebles;

public final class Silla extends Asiento implements Ajustable {

	// atributos

	public static final byte MIN_POSICION = 1;
	public static final byte MAX_POSICION = 4;

	private byte numPosicion;

	// constructor
	public Silla(double precio, String descripcion, String tapiceria, String color) {
		super(descripcion, precio, Asiento.MIN_PLAZAS, tapiceria, color);

		this.numPosicion = MIN_POSICION;

	}

	// metodos

	@Override
	public byte obtenerPosicion() {

		return this.numPosicion;
	}

	@Override
	public byte subirPosicion() throws IllegalStateException {

		if (this.numPosicion == MAX_POSICION) {
			throw new IllegalStateException("Error: no se puede subir a la posición " + (MAX_POSICION + 1));
		}

		this.numPosicion++;

		byte posi = this.numPosicion;
		return posi;

	}

	@Override
	public byte bajarPosicion() throws IllegalStateException {
		if (this.numPosicion == MIN_POSICION) {
			throw new IllegalStateException("Error: no se puede bajar a la posición " + (this.numPosicion - 1)
					+ ", ya que la posición mínima es" + MIN_POSICION);
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
