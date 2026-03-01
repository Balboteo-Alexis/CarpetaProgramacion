package tiendaMuebles;

public abstract class Mueble {

	public static final double PRECIO_MAX_MUEBLE = 10000.00;
	public static final double PRECIO_MIN_MUEBLE = 0.01;

	private static int contador = 1;

	protected final int identificador;
	protected final String descripcion;

	protected double precio;

	// constructor

	public Mueble(String descripcion, double precio) throws IllegalArgumentException {

		if (precio < PRECIO_MIN_MUEBLE || precio > PRECIO_MAX_MUEBLE) {
			throw new IllegalArgumentException("El precio no está en el rango permitido: XXX,XX");
		}

		this.identificador = contador;
		this.descripcion = descripcion;
		this.precio = precio;

		contador++;
	}

	// Getters

	public static double getPrecioMaxMueble() {
		return PRECIO_MAX_MUEBLE;
	}

	public static double getPrecioMinMueble() {
		return PRECIO_MIN_MUEBLE;
	}

	public static int getContador() {
		return contador;
	}

	public int getIdentificador() {
		return identificador;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public double getPrecio() {
		return precio;
	}

	// toString

	public String toString() {
		return "tipo: "+ this.getClass().getSimpleName() + " identificador=" + this.identificador + ", descripcion=" + this.descripcion + ", precio=" + this.precio;
	}

}
