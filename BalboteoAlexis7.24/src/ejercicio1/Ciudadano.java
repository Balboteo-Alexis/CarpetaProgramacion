package ejercicio1;

public class Ciudadano extends Humano {

	// Atributos de clase constantes

	// Atributos de clase variables

	// Atributos de objeto inmutables

	// Atributos de objeto variables
	protected String documento;

	// constructor

	public Ciudadano(String nombre, String apellidos, String documento) {

		super(nombre, apellidos);

		this.documento = documento;
	}

	// metodo

	@Override
	public String getNombreCompleto() {

		String frase;

		frase = String.format("%s, %s", super.getNombreCompleto(), this.documento);

		return frase;
	}

	
	

}
