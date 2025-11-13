/*
 * Descripción:con valores comprendidos entre 1 y 100 hacemos un par de acciones como la media o acumular los numeros
 * Autor: Alexis Balboteo González
 * Fecha: 12/11/2025
 */

package ejercicio1;

import java.util.Scanner;

public class Ejercicio1 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);

		int[][] tabla = new int[11][10];

		int num, cont0 = 0, cont1 = 0, cont2 = 0, cont3 = 0, cont4 = 0, cont5 = 0, cont6 = 0, cont7 = 0, cont8 = 0,
				cont9 = 0, cont10 = 0;

		double media = 0;

		System.out.println("Dame valores comprendidos entre el 1 y el 100. Cuando quuieras parar introduce el 0.");
		num = teclado.nextInt();

		while (num != 0) {

			switch (num / 10) {
			case 0: {
				tabla[0][cont0] = num;
				cont0++;
				break;
			}
			case 1: {

				tabla[1][cont1] = num;

				cont1++;
				break;
			}
			case 2: {

				tabla[2][cont2] = num;
				cont2++;

				break;
			}
			case 3: {

				tabla[3][cont3] = num;
				cont3++;
				break;
			}
			case 4: {

				tabla[4][cont4] = num;

				cont4++;
				break;
			}
			case 5: {

				tabla[5][cont5] = num;
				cont5++;
				break;
			}
			case 6: {

				tabla[6][cont6] = num;
				cont7++;
				break;
			}
			case 7: {

				tabla[7][cont7] = num;
				cont7++;
				break;
			}
			case 8: {

				tabla[8][cont8] = num;
				cont8++;

				break;
			}
			case 9: {

				tabla[9][cont9] = num;
				cont9++;

				break;
			}
			case 10: {

				if (num == 100) {
					tabla[10][cont10] = num;
					cont10++;
					break;
				}

			}
			default: {
				// así ignoramos otros valores
			}

			}

			num = teclado.nextInt();
		}

		for (int i = 0; i < 11; i++) {

			int cont = 0;
			int sumando = 0;

			for (int j = 0; j < 10; j++) {

				if (tabla[i][j] != 0) {
					sumando = sumando + tabla[i][j];
					cont++;
				}
			}

			media = (double) sumando / cont;

			System.out.println("Para la " + (i + 1) + "º decena hay " + cont + " numeros."); // la decena nº 11 es la de
																								// los 100.
			System.out.println("Su media es de: " + media);

		}

		System.out.println("\nMEDIA ARITMETICA:");

		for (int i = 0; i < 11; i++) {

			for (int j = 0; j < 10; j++) {

				if (tabla[i][j] != 0) {

				}
			}

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
