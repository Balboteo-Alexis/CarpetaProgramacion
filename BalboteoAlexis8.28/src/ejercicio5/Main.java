package ejercicio5;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.Collections;


public class Main {

	public static void main(String[] args) {

		ArrayList<Ciudadano> poblacion = new ArrayList<Ciudadano>();
		Scanner teclado = new Scanner(System.in);
		
		
		
		for (int i = 0; i < 10; i++) {


			poblacion.add(generarCiudadano());
		}
		
		
		Collections.sort(poblacion, new Comparador());
		
		
		System.out.println(poblacion.toString());
		
		
		System.out.println("Buscamos hombres o mujeres( H / M ):");
		
		String texto = teclado.nextLine();
		char sexo = texto.toUpperCase().charAt(0);
		
		System.out.printf("hay un total de: %d , %s", contarSexo(poblacion, sexo), sexo);
		
		System.out.println();
		
	
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
	
	
	
	
	
	private static Object Comparador() {
		// TODO Auto-generated method stub
		return null;
	}





	public static int contarSexo(ArrayList<Ciudadano> lista , char sexo){
		
		int cont =0;
		
		if(sexo == 'M') {
			
			for (Ciudadano ciudadano : lista) {
				
				if( ciudadano.getSexo() == "Mujer") {
					
					cont++;
					
				}
				
			}
			
		}else {
			
			for (Ciudadano ciudadano : lista) {
				
				if( ciudadano.getSexo() == "Hombre") {
					
					cont++;
					
				}
				
			}
			
			
		}
		
		
		
		return cont;
		
	}
	
	
	
	
	
	
	
	
	public static Ciudadano generarCiudadano() {
		
		String[] nombres = { "USER", "pepe", "jose", "manolo", "fede", "arnau", "blizcrank", "rana", "loco", "camilo" };
		String[ ] sexos = {"Hombre","Mujer"};
		String[] estados = { "Soltero","Casado", "Divorciado", "Viudo"};
		
		
		String nombre = nombres[(int) (Math.random() * 10)];
		String sexo = sexos[(int)(Math.random()*2)];
		String estadoCivil = estados[(int)(Math.random()*4)];
		int edad = (int)(Math.random()*100);
		
		Ciudadano ciudadano;
		
		ciudadano = new Ciudadano(nombre, sexo, estadoCivil, edad);
		
		
		return ciudadano;
		
	}
	
	
	
	
	
	
	
	

}
