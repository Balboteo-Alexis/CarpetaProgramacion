package ejercicio1;

import java.util.Objects;

public class Alumno {

	private String curso;
	private String nombre;
	private int mates;
	private int lengua;
	private int ingles;
	private int fisica;
	private int plastica;

	public Alumno(String curso, String nombre, int mates, int lengua, int ingles, int fisica, int plastica) {
		super();
		this.curso = curso;
		this.nombre = nombre;
		this.mates = mates;
		this.lengua = lengua;
		this.ingles = ingles;
		this.fisica = fisica;
		this.plastica = plastica;
	}

	public String getCurso() {
		return curso;
	}

	public String getNombre() {
		return nombre;
	}
	
	
	
	

	@Override
	public int hashCode() {
		return Objects.hash(nombre);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Alumno other = (Alumno) obj;
		return Objects.equals(nombre, other.nombre);
	}

	@Override
	public String toString() {
		return "Alumno [curso=" + curso + ", nombre=" + nombre + ", mates=" + mates + ", lengua=" + lengua
				+ ", ingles=" + ingles + ", fisica=" + fisica + ", plastica=" + plastica + "]"+ "\n";
	}

}
