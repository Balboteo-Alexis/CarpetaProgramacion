package ejercicio2;

import java.time.LocalDate;

public class Deportivo extends Coche {

	public enum Traccion {
		DELANTERA, TOTAL
	}

	// Atributos de clase constantes

	// Atributos de clase variables

	// Atributos de objeto inmutables

	// Atributos de objeto variables

	private Traccion traccion;

	public Deportivo(String nombre, short cilindrada, LocalDate fechaMatricula, short potencia, String matricula,
			Traccion traccion) {

		super(nombre, cilindrada, fechaMatricula, potencia, matricula);
		this.traccion = traccion;

	}

	public Traccion getTraccion() {
		return traccion;
	}

	@Override
	public String toString() {

		String frase = super.toString();

		frase += "\nDeportivo [traccion=" + traccion + "]";

		return frase;
	}

}
