package ejercicio4;

public class Trabajador {

	private String nombre;
	private int edad;
	private boolean casado;
	private int salarioBase;

	public Trabajador(String nombre, int edad, boolean casado, int salarioBase) {

		this.nombre = nombre;
		this.edad = edad;
		this.casado = casado;
		this.salarioBase = salarioBase;

	}

	public String getNombre() {
		return this.nombre;
	}

	public int getEdad() {
		return this.edad;
	}

	public boolean isCasado() {
		return this.casado;
	}

	public int getSalarioBase() {
		return this.salarioBase;
	}

	@Override
	public String toString() {
		return "Trabajador [nombre=" + nombre + ", edad=" + edad + ", casado=" + casado + ", salarioBase=" + salarioBase
				+ "]";
	}
	
	
	
	

}
