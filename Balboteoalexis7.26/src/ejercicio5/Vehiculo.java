package ejercicio5;

public abstract class Vehiculo {

	// Atributos de clase constantes

	// Atributos de clase variables

	// Atributos de objeto inmutables
	protected final String matricula;
	protected final String modelo;
	// Atributos de objeto variables

	protected Vehiculo(String matricula, String modelo) {

		this.matricula = matricula;
		this.modelo = modelo;
	}

	
	public abstract String getMatricula() ;

	public abstract String getModelo() ;

	public  abstract String toString();

}
