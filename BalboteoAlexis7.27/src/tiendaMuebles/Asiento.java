package tiendaMuebles;

public abstract class Asiento extends Mueble {

	// Atributos

	public static final byte MIN_PLAZAS = 1;
	public static final byte MAX_PLAZAS = 9;

	private final byte numPlazas;
	private final String tapiceria;

	private String color;

	// constructor
	public Asiento(String descripcion, double precio, byte numPlazas, String tapiceria, String color)
			throws IllegalArgumentException {
		super(descripcion, precio);

		if (numPlazas < MIN_PLAZAS || numPlazas > MAX_PLAZAS) {
			throw new IllegalArgumentException(" El número de plazas no está en el rango permitido");
		}

		this.numPlazas = numPlazas;
		this.tapiceria = tapiceria;
		this.color = color;

	}

	// Metodos

	public String getColor() {
		return this.color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public byte getNumPlazas() {
		return this.numPlazas;
	}

	public String getTapiceria() {
		return this.tapiceria;
	}

	@Override
	public String toString() {

		String frase;

		frase = super.toString() + "[numPlazas=" + this.numPlazas + ", tapiceria=" + this.tapiceria + ", color=" + this.color + "]";
		
//		String.format("%-14s Tapicería: %-14s Color:%-10s Número de plazas:%-2d"
//				super.toString(),
//				this.getTapiceria(),
//				this.getColor(),
//				this.getNumPlazas() );
		

		return frase;
	}

}
