package ejercicio5;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Aereo extends Vehiculo {


	// Atributos de clase constantes

	// Atributos de clase variables

	// Atributos de objeto inmutables
	protected final byte numAsientos;

	// Atributos de objeto variables

	
	
	
	
	
	
	
	
	
	
	
	protected Aereo(String matricula, String modelo, byte numAseintos) {
		super(matricula, modelo);
		if (!validarMatricula(matricula)) {
			throw new IllegalArgumentException("Matricula mal");

		}
		if(numAsientos<0) {
			throw new IllegalArgumentException("El piloto necesita sentarse");
			
		}
		
		
		
		
		
		
		
	}

	
	
	
	
	
	
	
	
	
	
	
	
	
	@Override
	public String getMatricula() {
		
		return null;
	}

	@Override
	public String getModelo() {
		
		return null;
	}

	@Override
	public String toString() {
		
		return null;
	}
	

	private static boolean validarMatricula(String matricula) {

		Pattern patron = Pattern.compile("[0-9]{4}-[TRWAGMYFPDXBNJZSQVHLCKE]{6}");

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
