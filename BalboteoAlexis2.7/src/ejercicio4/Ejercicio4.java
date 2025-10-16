/*
 * Descripcion:Usamos la clase Math.
 * Autor: Alexis 
 * Fecha: 14/10/2025
 */

package ejercicio4;

import java.util.Scanner;

public class Ejercicio4 {

	public static void main(String[] args) {
		
		double nota1, nota2, nota3, nota4, notamedia;
		
		
		Scanner teclado = new Scanner(System.in);
		
		System.out.print("Dime la nota media de Programación: ");
		nota1 = teclado.nextDouble();
		System.out.print("Dime la nota media de Base de datos: ");
		nota2 = teclado.nextDouble();
		System.out.print("Dime la nota media de Lenguaje de marcas: ");
		nota3 = teclado.nextDouble();
		System.out.print("Dime la nota media de Entornos de desarrollo: ");
		nota4 = teclado.nextDouble();
		
		notamedia = ( nota1 + nota2 + nota3 + nota4 ) / 4;
		
		System.out.print("\nTu nota media es de: " + notamedia);
		System.out.print("\nTu nota media redondeada el alza es de: " + Math.round(notamedia) );
		System.out.print("\nTu nota media redondeada a la baja es de: " + Math.floor(notamedia));
		
		if(notamedia > 8 ) 
		{
			System.out.println( "\n\nPuede acceder a estudios superiores.");
		}
		else 
		{
			System.out.println( "\n\nLo sentimos pero NO puede acceder a estudios superiores, no ha obtenido la nota necesaria.");
		}
		
		
		
		teclado.close();
		
	}

}
