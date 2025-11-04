package ejercicio3;

import java.util.Scanner;

public class Ejercicio3 {

	public static void main(String[] args) {

		Scanner teclado = new Scanner(System.in);

		int filas, columnas;

		System.out.println("Dime numero de filas: ");
		filas = teclado.nextInt();
		System.out.println("Dime numero de columnas: ");
		columnas = teclado.nextInt();
		System.out.println("Ahora valores para la tabla");

		int[][] tabla = new int[filas][columnas];

		for (int i = 0; i < filas; i++) {

			for (int j = 0; j < columnas; j++) {

				System.out.print("Valor: ");

				tabla[i][j] = teclado.nextInt();

			}
		}

		System.out.println("\n");

		for (int i = 0; i < filas; i++) {

			for (int j = 0; j < columnas; j++) {

				System.out.print(tabla[i][j]);

			}
			System.out.println();
		}

	}

}
