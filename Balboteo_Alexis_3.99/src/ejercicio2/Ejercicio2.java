/* Descripción: Con un atabla proporcionada, daremos respuesta a las preguntas relacionadas con la tabla de los ciberataques
 * Autor: Alexis Balboteo González
 * Fecha: 26/11/2025
 */

package ejercicio2;

import java.util.Scanner;

public class Ejercicio2 {

	public static void main(String[] args) {

		Scanner teclado = new Scanner(System.in);

		String[] provincias = { "Almería", "Cádiz", "Córdoba", "Granada", "Huelva", "Jaén", "Málaga", "Sevilla" };

		int[][] tabla = { { 0, 31, 1, 0, 0, 0, 0, 0, 0, 0, 0, 7, 0, 33, 42, 22 },
				{ 24, 56, 7, 0, 0, 0, 0, 0, 0, 0, 2, 12, 2, 10, 30, 29 },
				{ 17, 22, 5, 0, 0, 0, 0, 0, 0, 1, 2, 9, 1, 13, 36, 32 },
				{ 2, 41, 2, 0, 0, 0, 0, 0, 0, 0, 1, 7, 0, 11, 13, 32 },
				{ 0, 3, 0, 0, 0, 0, 0, 0, 0, 0, 0, 6, 0, 11, 58, 3 },
				{ 18, 8, 2, 0, 0, 0, 0, 0, 0, 0, 0, 11, 1, 7, 50, 36 },
				{ 1, 14, 0, 0, 0, 0, 0, 0, 0, 0, 0, 8, 0, 17, 35, 64 },
				{ 7, 3, 1, 0, 0, 0, 0, 0, 0, 0, 5, 7, 0, 26, 23, 0 } };

		System.out.println("Calcularemos:");
		System.out.println("El día con más ataques para cada provincia: \n");

		diaAtaques(tabla, provincias);

		System.out.println("\n\nAhora para cada dia ¿Qué provincia registró más ataques?");

		ataquesProvincia(tabla, provincias);

		System.out.println("\n\nQue dia registro más ataques en andalucia:");

		diaAndalucia(tabla, provincias);

		System.out.println("Dime un dia y una provincia y te digo si hubo ataque");
		System.out.println("Provincia: ");
		String provincia = teclado.nextLine();

		System.out.println("Dia: ");
		int dia = teclado.nextInt();

		algunAtaque(tabla, provincias, dia, provincia);

	}

	public static void algunAtaque(int[][] tabla, String[] vector, int dia, String provincia) {

		int columna = 0;
		for (int i = 0; i < vector.length; i++) {

			if (provincia.equals(vector[i])) {
				columna = i;
			}
		}

		if (tabla[columna][(dia-1)] > 0) {
			System.out.println("Hubo al menos un ataque");
		} else {
			System.out.println("No hubo ataques");
		}

	}

	public static void diaAndalucia(int[][] tabla, String[] vector) {

		int diaAtacado = 0, diaConcreto = 0;

		for (int i = 0; i < 16; i++) {
			int sumaDia = 0;

			for (int j = 0; j < vector.length; j++) {

				sumaDia = sumaDia + tabla[j][i];

			}

			if (diaAtacado < sumaDia) {

				diaAtacado = sumaDia;
				diaConcreto = i;

			}

		}

		System.out.println("El dia mas atacado en andalucia fue el dia: " + (diaConcreto + 1));

	}
// uifugyfuyfjbku
	public static void ataquesProvincia(int[][] tabla, String[] vector) {

		for (int i = 0; i < 16; i++) {

			String provinciaAtacada = vector[0];
			int masAtaques = tabla[0][i];

			for (int j = 0; j < vector.length; j++) {

				if (masAtaques < tabla[j][i]) {
					masAtaques = tabla[j][i];
					provinciaAtacada = vector[j];
				}

			}

			System.out.println(
					"Para el dia " + (i + 1) + " la provincia con mayor numero de ataques fue: " + provinciaAtacada);

		}

	}

	public static void diaAtaques(int[][] tabla, String[] vector) {

		for (int i = 0; i < vector.length; i++) {
			int diaMasAtaque = 0;
			int masAtaque = tabla[i][0];

			for (int j = 0; j < tabla[i].length; j++) {

				if (masAtaque < tabla[i][j]) {
					masAtaque = tabla[i][j];
					diaMasAtaque = j;
				}

			}

			System.out.println("Para la provincia: " + vector[i]);
			System.out.println("El dia con más ataques ha sido el dia : " + (diaMasAtaque + 1));
		}

	}

	// Muestra la tabla por pantalla
	public static void mostrarTabla(int[][] tablaCualquiera) {

		for (int i = 0; i < tablaCualquiera.length; i++) {

			for (int j = 0; j < tablaCualquiera[i].length; j++) {

				System.out.print(tablaCualquiera[i][j] + " ");
			}
			System.out.println("\n");
		}
	}

}
