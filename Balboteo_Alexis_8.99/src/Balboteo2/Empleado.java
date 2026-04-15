package Balboteo2;

/*
 * Objetivo: modelar objetos de tipo Empleado para TE899
 * Autor:  Alexis Balboteo González
 * Fecha: 15/04/2026
 * 
 * Observaciones: completa esta clase con los métodos que consideres necesarios
 */

import java.time.LocalDate;
import java.util.Objects;

public class Empleado {
	private String dni;
	private String nombre;
	private int edad;
	private LocalDate fechaIncorporacion;

	// Constructor
	public Empleado(String dni, String nombre, int edad, LocalDate fechaIncorporacion) {
		this.dni = dni;
		this.nombre = nombre;
		this.edad = edad;
		this.fechaIncorporacion = fechaIncorporacion;
	}

	public String getDni() {
		return dni;
	}

	public String getNombre() {
		return nombre;
	}

	@Override
	public int hashCode() {
		return Objects.hash(dni);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Empleado other = (Empleado) obj;
		return Objects.equals(dni, other.dni);
	}

	// Genera objetos de tipo Empleado con valores aleatorios
	public static Empleado generarAleatorio() {
		String[] nombres = { "Ana", "Luis", "Marta", "Carlos", "Elena", "Sofía" };
		int index = (int) (Math.random() * nombres.length);
		int numDni = (int) (Math.random() * 90000000) + 10000000;
		int edadAleatoria = (int) (Math.random() * (65 - 18 + 1)) + 18;
		LocalDate fechaAleatoria = LocalDate.of(2020, 1, 1);

		return new Empleado(String.valueOf(numDni) + "Z", nombres[index], edadAleatoria, fechaAleatoria);
	}

	@Override
	public String toString() {
		return "Empleado [dni=" + dni + ", nombre=" + nombre + ", edad=" + edad + ", fechaIncorporacion="
				+ fechaIncorporacion + "]";
	}

}
