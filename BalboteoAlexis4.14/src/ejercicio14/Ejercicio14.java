package ejercicio14;

import java.util.Scanner;

public class Ejercicio14 {

	public static void main(String[] args) {

		Scanner teclado = new Scanner(System.in);

		int altura;
		char caracter;
		String palabra;

		System.out.println("Vamos a hacer piramides.");

		System.out.println("De que tamaño quieres la piramide: ");
		altura = teclado.nextInt();
		teclado.nextLine();
		System.out.println("Con que caracter quieres la piramide: ");
		palabra = teclado.nextLine();
		caracter = palabra.charAt(0);

		hacerPiramide(altura, caracter);

	}

	public static void hacerPiramide(int altura, char a) {

		for (int i = 0; i < altura; i++) {

			for (int k = 0; k < altura - i; k++) {
				System.out.print(" ");
			}

			int cantidad = (2 * i + 1);

			for (int j = 0; j < cantidad; j++) {

				System.out.print(a);

			}
			System.out.println();

		}

	}

}
