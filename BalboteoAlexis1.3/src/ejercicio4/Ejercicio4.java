/*
 * Descripcion: Demostraciones de la clase Math
 * Autor: Alexis Balboteo 
 * Fecha: 3/10/2025
 */
package ejercicio4;
import java.util.Scanner;
public class Ejercicio4 
{

	public static void main(String[] args) 
	{
		Scanner teclado = new Scanner(System.in);
		
		double  num1;
		
		System.out.print("dame un numero: ");
		num1 = teclado.nextDouble();
		
		System.out.println(Math.ceil(num1)); // Vemos como escoje el siguiente numero entero sin decimales  a num1
		System.out.println(Math.floor(num1));// Al contario que ceil, escoje el numero entero sin decimales. 
		System.out.println(Math.round(num1));// redondea el numero a un entero
		
		teclado.close();
		
		
	}
	
}
