package ejercicio1;

public class Humano {

	// Atributos de clase constantes

	// Atributos de clase variables

	// Atributos de objeto inmutables

	// Atributos de objeto variables

	protected String nombre;
	protected String apellidos;

	
	
	// constructores

	public Humano(String nombre, String apellidos) {

		this.nombre = nombre;
		this.apellidos = apellidos;

	}

	
	
	public Humano() {
		this("Juan", "Garcia");
	}

	
	// Devuelve el nombre completo del humano
	public String getNombreCompleto() {
		String frase;

		frase = String.format("%s, %s", this.nombre, this.apellidos);

		return frase;
	}

	
	// Modifica el nombre
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	// Modifica los apellidos
	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}

}
