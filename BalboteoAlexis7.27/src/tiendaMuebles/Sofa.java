package tiendaMuebles;

public final class Sofa extends Asiento {

	private String composicion;

	// Constructor

	public Sofa(String descripcion, double precio, byte numPlazas, String tapiceria, String color, String composicion)
			throws IllegalArgumentException {
		super(descripcion, precio, numPlazas, tapiceria, color);

		this.composicion = composicion;

	}
	
	
	
	
	public String getComposicion() {
		return this.composicion;
	}




	@Override
	public String toString() {

		String frase;

		frase = super.toString() + " [composicion =" + this.composicion + "]";

		return frase;

	}

}
