package ejercicio5;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Terrestre extends Vehiculo {

	// Atributos de clase constantes

	// Atributos de clase variables

	// Atributos de objeto inmutables
	protected final byte numRuedas;

	// Atributos de objeto variables

	protected Terrestre(String matricula, String modelo, byte numRuedas) throws IllegalArgumentException {
		super(matricula, modelo);
		if (!validarMatricula(matricula)) {
			throw new IllegalArgumentException("Matricula mal");

		}
		if(numRuedas<2) {
			throw new IllegalArgumentException("necesitas mas ruedas");
		}
		
		this.numRuedas = numRuedas;

	}

	@Override
	public String getMatricula() {
		return this.matricula;
	}

	@Override
	public String getModelo() {
		return this.modelo;
	}

	public byte getNumRuedas() {
		return numRuedas;
	}

	@Override
	public String toString() {
		return null;
	}

	private static boolean validarMatricula(String matricula) {

		Pattern patron = Pattern.compile("[0-9]{4}-[TRWAGMYFPDXBNJZSQVHLCKE]{3}");

		boolean comprobado;

		matricula = matricula.toUpperCase();

		Matcher texto = patron.matcher(matricula);

		if (texto.matches()) {
			comprobado = true;
		} else {
			comprobado = false;
		}

		return comprobado;
	}
}
