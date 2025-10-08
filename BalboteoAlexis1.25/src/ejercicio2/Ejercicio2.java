/*
 * Descripción: 
 * Autor: Alexis Balboteo
 * Fecha: 6/10/2025
 */

package ejercicio2;
import java.util.Scanner;
public class Ejercicio2 
{
	public static void main(String[] args)
	{
		
		Scanner teclado = new Scanner(System.in);
		
		
		String name, direccion;
		int num;
		
		
		System.out.print("¿Cúal es tu nombre? ");
		name = teclado.nextLine();
		System.out.print("¿Dirección? ");
		direccion = teclado.nextLine();
		System.out.print("¿Número de telefono? ");
		num = teclado.nextInt();
		
		System.out.print("\nFicha del cliente: \nNombre: "+name+"\nDirección: "+direccion+"\nNúmero de telefono: "+num);
		
		
		
		
		
		teclado.close();
	
	}
}
