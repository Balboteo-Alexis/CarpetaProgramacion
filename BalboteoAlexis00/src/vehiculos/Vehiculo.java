package vehiculos;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Vehiculo {

	// Atributos de clase constantes
	public static final int MAX_NUM_IDENTIFICADOR = 99999999;

	// Atributos de clase variables
	private static int secuencia;

	// Atributos de objeto inmutables
	private String matricula;

	// Atributos de objeto variables

	public Vehiculo(String matricula) throws IllegalStateException {

		if (!validarMatricula(matricula)) {
			throw new IllegalStateException("Formato de matricula erroneo");
		}
		
		this.matricula = matricula;

	}

	public boolean validarMatricula(String matricula) throws IllegalStateException {
		boolean valida = false;
		String matriculaMan = matricula;
		matriculaMan = formatoMatricula(matricula);

		Pattern patron = Pattern.compile("[A-Z]{4}[-]{1}[0-9]{3}");
		Matcher texto = patron.matcher(matriculaMan);

		System.out.println(matriculaMan);
		
		if (!texto.matches()) {
			throw new IllegalStateException("Formato de matricula erroneo");
		}

		valida = true;

		return valida;
	}

	public String formatoMatricula(String matricula) {

		String matriculaFormateada;

		matriculaFormateada = matricula.substring(0, 4) + "-" + matricula.substring(4, 7);

		return matriculaFormateada;

	}

}
