/*
 * Descripción: Un programa que pide cinco datos con los cuales hace diferentes operaciones
 * y las muestra por pantalla, como por ejemplo el calculo del area de un circulo
 * Autor: Alexis Balboteo González
 * Fecha: 29/10/2025
 */

package ejercicio1;

import java.util.Scanner;

public class Ejercicio1 {

	public enum Operaciones {
		OPERACION, FUERZA_PESO, NUMERO_VUELTAS, AREA_CIRCULO
	}

	public static void main(String[] args) {

		int  masa, tiempo, result3, x;
		double  frecuencia, radio, g, result1, result2, result4;
		g = 9.8;

		Operaciones op1 = Operaciones.OPERACION;
		Operaciones op2 = Operaciones.FUERZA_PESO;
		Operaciones op3 = Operaciones.NUMERO_VUELTAS;
		Operaciones op4 = Operaciones.AREA_CIRCULO;

		Scanner teclado = new Scanner(System.in);

		System.out.println("CÁLCULO DE EXPRESIONES FÍSICAS/MATEMÁTICAS  \n------------------------------------------");

		System.out.print("Introduce el valor de X: ");
		x = teclado.nextInt();
		System.out.print("Introduce la masa (Kg): ");
		masa = teclado.nextInt();
		System.out.print("Introduce el tiempo (s): ");
		tiempo = teclado.nextInt();
		System.out.print("Introduce LA FRECUENCIA (HZ): ");
		frecuencia = teclado.nextDouble();
		System.out.print("Introduce el radio del irculo (m): ");
		radio = teclado.nextDouble();

		result1 = ((x + (x / 4.0)) / (6.0 - (x / 2.0)));  // Operacion matemática
		result2 = masa * g; 							// Calculo de fuerza peso
		result3 = (int) (frecuencia * tiempo);			// Formul calcula vueltas y usamos un casting para poder guardar 
														// el resultado de tipo real en un entero, que es el result3
		result4 = Math.PI * radio * radio;				// Formula de area de un círculo

		System.out.println("\nRESULTADOS \n-----------");
		System.out.println(op1 + ": " + result1);
		System.out.println(op2 + ": " + result2);
		System.out.println(op3 + ": " + result3);
		System.out.println(op4 + ": " + result4);
		
		teclado.close();

	}

}
