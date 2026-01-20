package a2;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Persona {
	
	private String dni;
	private String nombre;
	private String apellidos;
	private byte edad;
	 
	public Persona(String nombre, String apellidos, byte edad, String dni) {
		this.nombre = nombre;
		this.apellidos = apellidos;
		this.edad = edad;
		this.dni=dni;
	}
	
	
	public String getDni() {
		return this.dni;
	}
	public String getNombre() {
		return this.nombre;
	}
	public String getApellidos() {
		return this.apellidos;
	}
	public byte getEdad() {
		return this.edad;
	}
	
	
	
	public void setDni(String dni) {
		this.dni=dni;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}
	
	public void setEdad(byte edad) {
		
		this.edad = edad;
	}
	
	public boolean validarDni(String dni) {
		boolean valido = false;
		
		Pattern patron = Pattern.compile("[0-9]{8}[TRWAGMYFPDXBNJZSQVHLCKE]$");
		Matcher texto = patron.matcher(dni);
		
		
		
		if(dni == null) {
			valido = false;
		}else {
			dni = dni.toUpperCase();
			String cadenaNumerosDni = dni.substring(0, 8);
			char letraDni = dni.charAt(8);
		}
	    
	    
	    
	    
		return valido;
	}
	
	
	
	
	
	
	
	
	
	
	

}
