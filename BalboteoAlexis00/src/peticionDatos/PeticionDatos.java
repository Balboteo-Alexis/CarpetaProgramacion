/*
 * Descripción: Aprendemos a pedir datos por teclado
 * de varios tipos y la imprimimos en pantalla
 * Autor: Alexis Balboteo González 
 * Fecha: 24/09/2025
 */

package peticionDatos;

import java.util.Scanner;

public class PeticionDatos {

	public static void main(String[] args) 
	{
		Scanner teclado = new Scanner(System.in);
		
		byte edadAlumno;
		String nombre;
		System.out.println("Cual es tu edad?");
		edadAlumno = teclado.nextByte();
		System.out.println("la edad es "+ edadAlumno);
		System.out.println("Cual es tu nombre?");
		teclado.nextLine();  // importante para  que no de fallo, llamar al carro
		nombre = teclado.nextLine();
		System.out.println("tu nombre es: " + nombre);
		
		float altura ;
		
		System.out.println("Cual es tu altura?");	
		
		altura = teclado.nextFloat();
		
		System.out.println("tu altura es de: " +altura +" metros.");
		
		double altura2 ;
		
		System.out.println("Cual es la altura de tu compañero? altura?");	
		
		altura2 = teclado.nextDouble();
		
		System.out.println("la altura de tu compa  es de: " +altura2 +" metros.");
		 
		
		
		
	}

}
