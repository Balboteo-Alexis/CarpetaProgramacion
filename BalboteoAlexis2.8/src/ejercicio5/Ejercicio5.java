/*
 * Descripcion: Pedir 10 números. Mostrar la media de los números positivos, la media de los números negativos y la cantidad de ceros.
 * Autor: Alexis 
 * Fecha: 16/10/2025
 */
package ejercicio5;

import java.util.Scanner;

public class Ejercicio5 {

	public static void main(String[] args) {
		int ceros, numposi, numnega;
		double num, positivos, negativos;

		ceros = 0;
		positivos = 0;
		negativos = 0;
		numposi = 0;
		numnega = 0;

		Scanner teclado = new Scanner(System.in);

		System.out.println("Introduzca 10 números.");
		for (int i = 1; i < 11; i++) {

			System.out.print(i + "º Numero: ");
			num = teclado.nextDouble();
			if (num == 0) {
				ceros++;
			} else {
				if (num < 0) {
					negativos = negativos + num;
					numnega++;
				} else {
					positivos = positivos + num;
					numposi++;
				}

			}
		}

		System.out.println("\n\nMedia de numeros positivos: " + positivos / numposi);
		System.out.println("\nMedia de numeros negativos: " + negativos / numnega);
		System.out.println("\nNumero de ceros: " + ceros);

		teclado.close();
	}

}
