/*
 * Descripción: Programa que solicita a teclado varios datos.
 * Autor: Alexis Balboteo González 
 * Fecha: 25/09/2025
 */

package ejercicio1;
import java.util.Scanner;

public class Ejercicio1 
{

	public static void main(String[] args)
	{
		Scanner teclado = new Scanner(System.in);
		
		String nombre, apellidos, direccion;
		double altura, peso;
		byte edad;
		
		//Pedir datos
		
		System.out.print("Por favor introduzca los siguientes datos:\nNombre: ");
		nombre= teclado.nextLine();
		System.out.print("Apellidos: ");
		apellidos= teclado.nextLine();
		System.out.print("Dirección: ");
		direccion= teclado.nextLine();
		
		
		System.out.print("Edad: ");
		edad= teclado.nextByte();
		System.out.print("Altura: ");
		altura= teclado.nextDouble();
		System.out.print("Peso: ");
		peso= teclado.nextDouble();
		

		// Mostrar datos
		
		System.out.println("\nGracias por su colaboración.\n\nDatos:"); // he puesto dos \n para dejar mas espacio a proposito, simplemente visual
		System.out.println("Nombre: "+ nombre +"\nApellidos: " + apellidos+"\nDireccion: "+direccion+ "\nEdad: "+edad +"\nAltura: "+altura+"\nPeso: "+peso);
		
		teclado.close();
		
	}

}
