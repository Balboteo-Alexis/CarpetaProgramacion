package ejercicio6;

import java.time.LocalDate;

public class Alumnos {

	private static int contador = 1;

	private final int codigoAlumno;
	private String nombre;
	private String apellidos;
	private String direccion;
	private String telefono;
	private int codigoCiclo;
	private int cursosAprobados;
	private LocalDate fechaIngreso;

	public Alumnos(String nombre, String apellidos, String direccion, String telefono, int codigoCiclo,
			int cursosAprobados, LocalDate fechaIngreso) {
		this.codigoAlumno = contador++;
		this.nombre = nombre;
		this.apellidos = apellidos;
		this.direccion = direccion;
		this.telefono = telefono;
		this.codigoCiclo = codigoCiclo;
		this.cursosAprobados = cursosAprobados;
		this.fechaIngreso = fechaIngreso;
	}

	public static int getContador() {
		return contador;
	}

	public int getCodigoAlumno() {
		return codigoAlumno;
	}

	public String getNombre() {
		return nombre;
	}

	public String getApellidos() {
		return apellidos;
	}

	public String getDireccion() {
		return direccion;
	}

	public String getTelefono() {
		return telefono;
	}

	public int getCodigoCiclo() {
		return codigoCiclo;
	}

	public int getCursosAprobados() {
		return cursosAprobados;
	}

	public LocalDate getFechaIngreso() {
		return fechaIngreso;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}
	

	public void setCodigoCiclo(int codigoCiclo) {
		this.codigoCiclo = codigoCiclo;
	}

	public void setCursosAprobados(int cursosAprobados) {
		this.cursosAprobados = cursosAprobados;
	}

	@Override
	public String toString() {
		return "\nAlumnos [codigoAlumno=" + codigoAlumno + ", nombre=" + nombre + ", apellidos=" + apellidos
				+ ", direccion=" + direccion + ", telefono=" + telefono + ", codigoCiclo=" + codigoCiclo
				+ ", cursosAprobados=" + cursosAprobados + ", fechaIngreso=" + fechaIngreso + "]";
	}

}
