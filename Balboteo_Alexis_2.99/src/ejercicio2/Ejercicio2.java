/*
 * Descripción: Tenemos un programa que con un array de tamaño 30 y numero aleatorios hace un par de funciones como: 
 * decir numeros impares dentro de un rango y otra funcion de mostrar numeros y posiciones menosres a un numero pedido
 * Autor: Alexis Balboteo González
 * Fecha: 12/11/2025
 */

package ejercicio2;

import java.util.Scanner;

public class Ejercicio2 {

	public static void main(String[] args) {

		final int TAMANO = 30;
		int num, pos1, pos2;

		Scanner teclado = new Scanner(System.in);

		int[] vector = new int[TAMANO];

		rellenarTablaRandom(vector);
		mostrarVector(vector);

		System.out.print("\nDigame un numero y te dire todos los menores de ese número que estén en la tabla: ");
		num = teclado.nextInt();
		while (num < 0 || num > 300) {

			System.out.println("\nIntroduzca un numero dentro del rango.");
			System.out.print("Numero: ");
			num = teclado.nextInt();

		}

		for (int i = 0; i < TAMANO; i++) {

			if (vector[i] < num) {
				System.out.println("El numero " + vector[i] + " es menor y esta en la posición: " + (i + 1));	// i+1 es para que al usuario no le aparezca la 
																												// posicion 0, sino que empiece en 1
			}
		}

		System.out.println(
				"\nAhora dame dos posiciones (teniendo en cuenta que la primera posicion es el 0) y te dire los número impares que aparecen dentro de las dos posiciones.");
		System.out.print("Posición 1: ");
		pos1 = teclado.nextInt();
		System.out.print("Posición 2: ");
		pos2 = teclado.nextInt();
		System.out.println("\nLos numeros impares entre las posiciones definidas son: ");
		for (int i = pos1; i < pos2; i++) {

			if ((vector[i] % 2) != 0) {

				System.out.print(vector[i] + "\t");

			}

		}

		teclado.close();

	}

	// Rellena vectot con numeros aleatorios del 0 al 300
	public static void rellenarTablaRandom(int[] vector) {

		for (int i = 0; i < vector.length; i++) {

			vector[i] = (int) (Math.random() * 300);
		}
	}

	// Muestra el vector por pantalla
	public static void mostrarVector(int[] Vector) {

		int cont = 0;

		for (int i = 0; i < Vector.length; i++) {

			cont++;
			System.out.print(Vector[i] + "\t");

			if (cont == 10) {
				System.out.println();
				cont = 0;
			}

		}
	}
}
