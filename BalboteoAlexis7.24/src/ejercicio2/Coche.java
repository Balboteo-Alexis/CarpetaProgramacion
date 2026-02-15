package ejercicio2;

import java.time.LocalDate;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Coche {

	// Atributos de clase constantes

	public static String NOMBRE_DEF = "Usuario";
	public static short CILINDRADA_DEF = (short) 2000;
	public static short POTENCIA_DEF = (short) 150;
	public static String MARTRICULA_DEF = "0000AAA";

	// Atributos de clase variables

	// Atributos de objeto inmutables

	protected final LocalDate fechaMatricula;

	// Atributos de objeto variables

	protected String matricula;

	protected String nombre;

	protected short cilindrada;

	protected short potencia;

	// Constructores

	public Coche(String nombre, short cilindrada, LocalDate fechaMatricula, short potencia, String matricula)
			throws IllegalArgumentException {

		if (!validarMatricula(matricula)) {

			throw new IllegalArgumentException("Matricula erronea");
		}
		if (nombre == null || nombre.isEmpty()) {

			throw new IllegalArgumentException("Nombre está Blanco");
		}
		if (cilindrada < 0) {

			throw new IllegalArgumentException("Cilindrada no puede ser negativa");
		}
		if (potencia < 0) {

			throw new IllegalArgumentException("Potencia no puede ser negativa");
		}

		this.nombre = nombre;
		this.cilindrada = cilindrada;
		this.fechaMatricula = fechaMatricula;
		this.potencia = potencia;
		this.matricula = matricula;

	}

	public Coche() {
		this(NOMBRE_DEF, CILINDRADA_DEF, LocalDate.now(), POTENCIA_DEF, MARTRICULA_DEF);

	}

	private static boolean validarMatricula(String matricula) {

		boolean valida = false;

		matricula = matricula.toUpperCase();
		Pattern patron = Pattern.compile("[0-9]{4}[A-Z]{3}");
		Matcher texto = patron.matcher(matricula);

		if (!texto.matches()) {
			throw new IllegalStateException("Formato de matricula erroneo");
		} else {
			valida = true;

		}

		return valida;
	}

	// GETTERS Y SETTERS

	public String getMatricula() {
		return matricula;
	}

	public String getNombre() {
		return nombre;
	}

	public short getCilindrada() {
		return cilindrada;
	}

	public short getPotencia() {
		return potencia;
	}

	public LocalDate getFechaMatricula() {
		return fechaMatricula;
	}

	public void setMatricula(String matricula) throws IllegalArgumentException {

		if (!validarMatricula(matricula)) {
			throw new IllegalArgumentException("Matricula incoñrrecta");

		}

		this.matricula = matricula;

	}

	public void setNombre(String nombre) throws IllegalArgumentException  {

		if (nombre == null || nombre.isEmpty()) {

			throw new IllegalArgumentException("Nombre está Blanco");
		}

		this.nombre = nombre;
	}

	public void setPotencia(short potencia)  throws IllegalArgumentException{
		
		if (potencia < 0) {

			throw new IllegalArgumentException("Potencia no puede ser negativa");
		}
		
		
		this.potencia = potencia;
	}
	
	public void setCilindrada(short cilindrada) throws IllegalArgumentException {
		if (cilindrada < 0) {

			throw new IllegalArgumentException("Cilindrada no puede ser negativa");
		}
		
		
		this.cilindrada = cilindrada;
	}
	
	
	
	
	
	

	public String toString() {
		return "Coche [fechaMatricula=" + fechaMatricula + ", matricula=" + matricula + ", nombre=" + nombre
				+ ", cilindrada=" + cilindrada + ", potencia=" + potencia + "]";
	}

}
