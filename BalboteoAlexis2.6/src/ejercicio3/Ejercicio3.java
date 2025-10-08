/*
 * Descripción: Es un programa que pide datos y usa un if para determinar i seguir preguntando o no
 * Autor: Alexis Balboteo
 * 07/10/2025
 */

package ejercicio3;
import java.util.Scanner;
public class Ejercicio3 {

	public static void main(String[] args) 
	{
			Scanner teclado = new Scanner(System.in);
			
			
			int edad;
			String nombre, apellidos;
			
			System.out.print("Qué edad tiene: ");
			edad = teclado.nextInt();
			
			if(edad<18)
			{
				System.out.print("No tiene la edad requerida para realizar estos estudios.");
			}
			else
			{
				teclado.nextLine();
				System.out.print("Dime tu nombre:");
				nombre = teclado.nextLine();
				System.out.print("Dime tu apellidos:");
				apellidos = teclado.nextLine();
				
				System.out.print("\n\nNombre: "+nombre+"\nApellidos: "+apellidos+"\nEdad: "+edad+"\n\nUsted ha sido admitido.");
				
			}

			
			
			teclado.close();
	}

}
