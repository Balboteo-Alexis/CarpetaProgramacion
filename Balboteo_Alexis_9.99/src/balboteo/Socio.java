package balboteo;

import java.util.Objects;

/*
 * Objetivo: clase que modela al objeto de tipo Socio
 * Autor: Profe
 * Fecha: 29/04/26
 */

public class Socio {
    private int id;
    private String nombre;
    private byte antiguedad; // en años

    public Socio(int id, String nombre, byte antiguedad) {
        this.id = id;
        this.nombre = nombre;
        this.antiguedad = antiguedad;
    }

    
    
    
    
    
    
	public byte getAntiguedad() {
		return antiguedad;
	}







	public String getNombre() {
		return nombre;
	}







	@Override
	public int hashCode() {
		return Objects.hash(id);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Socio other = (Socio) obj;
		return id == other.id;
	}

	@Override
	public String toString() {
		return "\nSocio [id=" + id + ", nombre=" + nombre + ", antiguedad=" + antiguedad + "]";
	}

   
}
