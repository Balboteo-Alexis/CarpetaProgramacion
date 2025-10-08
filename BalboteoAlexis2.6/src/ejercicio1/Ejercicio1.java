/*
 * Descripción: Comparar numeros y decir cual es mayor o si son iguales.
 * Autor: Alexis Balboteo
 * Fecha:07/10/2025
 * 
 */

package ejercicio1;
import java.util.Scanner;
public class Ejercicio1
{
	public static void main(String[] args)
	{
		
		Scanner teclado = new Scanner(System.in);
		
		double num1,num2;
		System.out.print("Digame el primer numero: ");
		num1 = teclado.nextDouble();
		System.out.print("Digame el segundo numero: ");
		num2 = teclado.nextDouble();
		
		teclado.close();
		
		if (num1>num2)
		{
			System.out.print("El primer numero es mayor al segundo");		
		}
		else 
		{
			if(num1<num2) 
			{
				System.out.print("El primer numero es menor al segundo");
			}
			else 
			{
				System.out.print("Los numeros son iguales.");	
			}	
		}
	}
}
