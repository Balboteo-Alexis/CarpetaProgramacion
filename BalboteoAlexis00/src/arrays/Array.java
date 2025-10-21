/*
 * Descripcion: Programa que muestra los números del 1 al 100 utilizando la sentencia do while.
 * Autor: Alexis 
 * Fecha: 16/10/2025
 */
package arrays;

public class Array {

	public static void main(String[] args) {
		
		final int TOTAL_NUM = 20;
		
		int[] numeros = new int[TOTAL_NUM]; //Declarción arrays
		
		for (int posicion = 0; posicion < TOTAL_NUM ;posicion++) 
		{
			numeros[posicion] = (int) (Math.random() * 50);
			
		}
		for (int posicion = 0; posicion < TOTAL_NUM ;posicion++) 
		{
			System.out.println("El valor que hay en la posición: " + posicion + " es: " + numeros[posicion]);
			
		}
		
		
		
	}

}
