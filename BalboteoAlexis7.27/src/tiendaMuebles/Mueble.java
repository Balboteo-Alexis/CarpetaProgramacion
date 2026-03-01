package tiendaMuebles;

public abstract class Mueble {

	public static final double MAX_PRECIO  = 10000.00;
	public static final double MIN_PRECIO = 0.01;

	private static int contador = 1;

	protected final int identificador;
	protected final String descripcion;

	protected double precio;

	// constructor

	public Mueble(String descripcion, double precio) throws IllegalArgumentException {

		if (precio < MIN_PRECIO || precio > MAX_PRECIO) {
			throw new IllegalArgumentException("El precio no está en el rango permitido: "+ MAX_PRECIO);
		}

		this.identificador = contador;
		this.descripcion = descripcion;
		this.precio = precio;

		contador++;
	}

	// Getters

	public static double getPrecioMaxMueble() {
		return MAX_PRECIO;
	}

	public static double getPrecioMinMueble() {
		return MIN_PRECIO;
	}

	public static int getContador() {
		return contador;
	}

	public int getId() {
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
