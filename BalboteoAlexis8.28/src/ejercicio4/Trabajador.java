package ejercicio4;

public class Trabajador {

	private String nombre;
	private int edad;
	private String sexo;
	private String estadoCivil;
	private int salarioBase;

	public Trabajador(String nombre, int edad,String sexo, String estadoCivil, int salarioBase) {

		this.nombre = nombre;
		this.edad = edad;
		this.sexo = sexo;
		this.estadoCivil = estadoCivil;
		this.salarioBase = salarioBase;

	}

	public String getSexo() {
		return sexo;
	}

	public String getNombre() {
		return this.nombre;
	}

	public int getEdad() {
		return this.edad;
	}

	public String getEstadoCivil() {
		return estadoCivil;
	}

	public int getSalarioBase() {
		return this.salarioBase;
	}

	@Override
	public String toString() {
		return "\nTrabajador [nombre=" + nombre + ", edad=" + edad + ", sexo=" + sexo + ", estadoCivil=" + estadoCivil
				+ ", salarioBase=" + salarioBase + "]";
	}

		

}
