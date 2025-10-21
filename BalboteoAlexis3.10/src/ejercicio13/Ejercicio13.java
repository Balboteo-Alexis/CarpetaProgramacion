/*
 * Descripcion:  Crea un programa que permita al usuario almacenar una secuencia aritmética en un array y luego mostrarla.
 * 
 */

package ejercicio13;

import java.util.Scanner;

public class Ejercicio13 {

	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		int tamano, inicio, incremento, vueltas;
		
		
		
		System.out.println("Hagamos una secuencia aritmetica.");
		System.out.print("Por que valor empezamos: ");
		inicio = teclado.nextInt();
		System.out.print("De cuanto es el incremento: ");
		incremento = teclado.nextInt();
		System.out.print("Cuantos numeros componen la secuencia: ");
		tamano = teclado.nextInt();
		
		int[] numeros = new int[tamano];
		
		
		for (int i = 0; i < tamano; i++) {
			
			
			numeros[i] = (int) (inicio + incremento * i);
							
			System.out.print(numeros[i] + " ");
			
		}
		
		
		
	}

}
