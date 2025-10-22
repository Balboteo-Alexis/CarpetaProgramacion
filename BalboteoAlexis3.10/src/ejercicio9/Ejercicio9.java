/*
 * 
 * 
 * 
 */

package ejercicio9;

import java.util.Scanner;

public class Ejercicio9 {

	public static void main(String[] args) {

		final int TAMANO_ARRAY = 100;
		int numero;

		Scanner teclado = new Scanner(System.in);
		int[] numeros = new int[TAMANO_ARRAY];

		for (int i = 0; i < 100; i++) {

			numeros[i] = (int) (1 + Math.random() * 10);

			System.out.print(numeros[i] + " ");

		}

		System.out.print("\nDigame un valor y te diré en que posiciones está: ");

		numero = teclado.nextInt();

		System.out.print("El valor indicado (" + numero + ") está en la posición: ");

		for (int i = 0; i < 100; i++) {

			if (numero == numeros[i]) {

				System.out.print(i + " ");

			}
			teclado.close();
		}
	}

}
