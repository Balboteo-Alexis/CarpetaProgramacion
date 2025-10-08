/*
 * Descripción: Programa con entrada y salida, pregunta un nombre y lo devuelve por pantalla.
 * Autor: Alexis Balboteo
 * Fecha: 6/10/2025
 */

package ejercicio1;
import java.util.Scanner;
public class Ejercicio1 
{

	public static void main(String[] args)
	{
		
		Scanner teclado = new Scanner(System.in);
		
		String name;
		
		System.out.print("¿Cómo te llamas?");
		name = teclado.nextLine();
		System.out.print("\nHola "+name);
		
		teclado.close();
	
	}
	
}
