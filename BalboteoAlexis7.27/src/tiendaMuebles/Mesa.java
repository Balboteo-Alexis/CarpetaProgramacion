package tiendaMuebles;

public final class Mesa extends Mueble {

	// atributos

	public final static int MIN_COMENSALES = 4;
	public final static int MAX_COMENSALES = 16;

	private String forma;
	private int comensales;

	// constructor
	public Mesa(double precio,String descripcion,  String forma, int comensales) throws IllegalArgumentException {
		super(descripcion, precio);

		if (comensales < MIN_COMENSALES || comensales > MAX_COMENSALES) {
			throw new IllegalArgumentException("el numero de comensales debe estar entre 4 y 16");

		}

		this.forma = forma;
		this.comensales = comensales;

	}

	public String getForma() {
		return this.forma;
	}

	public int getComensales() {
		return this.comensales;
	}

	@Override
	public String toString() {

		String frase;

		frase = super.toString() + "[forma=" + forma + ", comensales=" + comensales + "]";

		return frase;

	}

	// metodos

}
