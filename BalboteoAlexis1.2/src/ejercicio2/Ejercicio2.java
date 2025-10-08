/*
 * Descripción: Un programa que solicita al usuario datos relativos a un equipo de fútbol
 * Autor: Alexis Balboteo
 * Fecha:26/09/2025 
 */

package ejercicio2;
import java.util.Scanner;
public class Ejercicio2 
{

	public static void main(String[] args)
	{
		Scanner teclado = new Scanner(System.in);
		
		String nombreEquipo, nombreEstadio,nombreCapitan;
		int año;
		
		//Pedir datos
		
		System.out.print("Proporciona el nombre de tú equipo: ");
		nombreEquipo = teclado.nextLine();
		System.out.print("Año de fundación: ");
		año = teclado.nextInt();
		teclado.nextLine();
		System.out.print("Nombre del estadio: ");
		nombreEstadio = teclado.nextLine();
		System.out.print("Nombre del capitán: ");
		nombreCapitan = teclado.nextLine();
		
		//Mostrar datos
		
		System.out.println("\n*******************************************");
		System.out.println("****Nombre del Equipo: "+ nombreEquipo);
		System.out.println("****Fundado en: "+ año );
		System.out.println("****Estadio: "+ nombreEstadio);
		System.out.println("****Capitan: "+ nombreCapitan);
		
		teclado.close();
	}

}
