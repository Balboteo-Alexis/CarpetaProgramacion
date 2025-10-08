/*
 * Descripción: Ejercicio reuelto 2 
 * Autor: Alexis Balboteo González 
 * Fecha: 25/09/2025
 */
package ejercicio2resuelto;

import java.util.Scanner;

public class Ejercicio2resuelto 
{
	public static void main(String[] args) 
	{
		
		int num1,num2;
		double result1, result2, result3, result4;
				
		Scanner teclado = new Scanner(System.in);
		
		
		//Primer bloque
		
		System.out.println("CÁLCULOS ARITMETICOS"+ "\n--------------------");
		System.out.println("Introduzca dos números reales:");
		System.out.print("Primer número:");
		num1 = teclado.nextInt();
		System.out.print("Segundo número:");
		num2 = teclado.nextInt();
		
		
		//Segundo bloque, resultados
		
		result1 = num1 * 2;
		result2 = num2 / 2;
		result3 = (num1+num2)*(num1+num2);
		result4 = (num1*num1+num2*num2)/ 10;
		
		
		
		
		
		System.out.println("\nRESULTADO \n--------");
		
		System.out.println("Doble del primer número: "+ result1);
		System.out.println("Mitad del segundo número: "+ result2);
		System.out.println("Cuadrado de la suma de ambos números: "+ result3);		
		System.out.println("Décima parte de la suma de los cuadrados de ambos números: "+ result4);
		
		
	}
	
	
}
