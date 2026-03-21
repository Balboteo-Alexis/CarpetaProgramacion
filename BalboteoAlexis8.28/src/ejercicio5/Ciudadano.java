package ejercicio5;

public class Ciudadano {

	private String nombre;
	private String sexo;
	private String estadoCivil;
	private int edad;
	

	public Ciudadano(String nombre, String sexo, String estadoCivil, int edad) {
		
		this.nombre = nombre;
		this.sexo = sexo;
		this.estadoCivil = estadoCivil;
		this.edad = edad;
	}




	public String getNombre() {
		return nombre;
	}

	public String getSexo() {
		return sexo;
	}

	public String getEstadoCivil() {
		return estadoCivil;
	}

	public int getEdad() {
		return edad;
	}

	@Override
	public String toString() {
		return "Ciudadano [nombre=" + nombre + ", sexo=" + sexo + ", estadoCivil=" + estadoCivil + ", edad=" + edad
				+ "]\n";
	}
	 

}
