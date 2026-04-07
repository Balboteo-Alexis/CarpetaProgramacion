package pruebas;

import java.util.Objects;

public class Alumno {
	
	
	 private final String dni;   // identidad -> NO debería cambiar
	    private String nombre;
	    private int edad;

	    public Alumno(String dni, String nombre, int edad) {
	        this.dni = dni;
	        this.nombre = nombre;
	        this.edad = edad;
	    }

	    public String getDni() { return dni; }
	    public String getNombre() { return nombre; }
	    public int getEdad() { return edad; }

	    public void setNombre(String nombre) { this.nombre = nombre; }
	    public void setEdad(int edad) { this.edad = edad; }

	    @Override
		public int hashCode() {
			return Objects.hash(dni, nombre);
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
			return Objects.equals(dni, other.dni) && Objects.equals(nombre, other.nombre);
		}

		@Override
	    public String toString() {
	        return "Alumno{dni='" + dni + "', nombre='" + nombre + "', edad=" + edad + "}";
	    }

}
