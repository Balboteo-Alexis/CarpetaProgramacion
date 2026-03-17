package ejercicio1;

import java.util.Collections;

public class Atleta {

	public final static String[] 	NOMBREDEF = {"USER","pepe","jose","manolo","fede","arnau", "blizcrank","rana","loco","camilo"};
	
	
	
	
	private String nombre;
	private int edad;
	private int altura;

	public Atleta(String nombre, int edad, int altura) {

		this.nombre = nombre;
		this.edad = edad;
		this.altura = altura;

	}
	
	public Atleta() {
		this(NOMBREDEF[(int)(Math.random()*10)],(int)(Math.random()*50+2),(int)(Math.random()*100+100));
	}

	public String getNombre() {
		return nombre;
	}

	public int getEdad() {
		return edad;
	}

	public int getAltura() {
		return altura;
	}


	@Override
	public String toString() {
		return "Atleta [nombre=" + nombre + ", edad=" + edad + ", altura=" + altura + "]\n";
	}

	
	
	
}
