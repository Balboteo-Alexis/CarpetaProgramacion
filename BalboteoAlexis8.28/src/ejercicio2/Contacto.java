package ejercicio2;

import java.time.LocalDate;
import java.util.Objects;

public class Contacto {

	
	public final static String[] 	NOMBREDEF = {"USER","pepe","jose","manolo","fede","arnau", "blizcrank","rana","loco","camilo"};
	
	public final static String[] 	FECHANACIMIENTODEF = {"01/01/2020",
		    "14/02/2021",
		    "30/03/2022",
		    "05/04/2023",
		    "19/05/2024",
		    "07/06/2025",
		    "18/07/2026",
		    "09/08/2027",
		    "22/09/2028",
		    "31/12/2029"};
	
	
	
	
	private final String telefono;

	private String nombre;
	private String email;
	private LocalDate fechaNac;

	public Contacto(String telefono, String nombre, String email, LocalDate fechaNac) {

		this.telefono = telefono;
		this.nombre = nombre;
		this.email = email;
		this.fechaNac = fechaNac;

	}
	
	public String getTelefono() {
		return telefono;
	}

	public String getNombre() {
		return nombre;
	}

	public String getEmail() {
		return email;
	}

	public LocalDate getFechaNac() {
		return fechaNac;
	}

	@Override
	public String toString() {
		return "Contacto [telefono=" + telefono + ", nombre=" + nombre + ", email=" + email + ", fechaNac=" + fechaNac
				+ "]\n";
	}

	
	
	@Override
	public int hashCode() {
		return Objects.hash(telefono);
	}

	
	
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Contacto other = (Contacto) obj;
		return Objects.equals(telefono, other.telefono);
	}
	
	
	
	
	
	
	
	
	

}
