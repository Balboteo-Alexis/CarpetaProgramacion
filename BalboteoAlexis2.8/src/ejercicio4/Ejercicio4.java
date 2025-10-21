/*
 * Descripcion: Ussamos bucle while para hacer la suma de numeros que entran por tteclado yluego sacar la media
 * Autor: Alexis 
 * Fecha: 16/10/2025
 */
package ejercicio4;

import java.util.Scanner;

public class Ejercicio4 {

	public static void main(String[] args) {
		int cantidad;
		double media, num, total;
		Scanner teclado = new Scanner(System.in);

		cantidad = 0;
		total = 0;

		System.out
				.print("Por favor introduce numeros positivos, para parar introduzca el valor 0.\n\nNumero positivo: ");
		num = teclado.nextDouble();

		while (num != 0) {

			cantidad = cantidad + 1;
			total = total + num;
			System.out.print("Numero positivo: ");
			num = teclado.nextDouble();
		}

		media = total / cantidad;
		System.out.print("\nHas introducido " + cantidad + " numeros." + "\nLa media ha sido: " + media);
		teclado.close();

	}

}
