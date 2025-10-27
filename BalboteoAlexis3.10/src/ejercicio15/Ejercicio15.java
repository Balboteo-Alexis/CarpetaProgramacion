/*
 * 
 * 
 * 
 */

package ejercicio15;

import java.util.Arrays;

import java.util.Scanner;

public class Ejercicio15 {

	public static void main(String[] args) {

		int n, m;
		Scanner teclado = new Scanner(System.in);

		System.out.print("Dame dos valores.\n1º: ");
		n = teclado.nextInt();
		System.out.print("2º: ");
		m = teclado.nextInt();

		int[] tabla = new int[n];
		Arrays.fill(tabla, m);

		for (int i = 0; i < n; i++) {

			System.out.print(tabla[i]);
		}

		teclado.close();

	}

}
