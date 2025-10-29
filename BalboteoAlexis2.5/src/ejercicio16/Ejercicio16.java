package ejercicio16;

import java.util.Scanner;

public class Ejercicio16 {

	public static void main(String[] args) {

		Scanner teclado = new Scanner(System.in);

		int num, resul, resto;
		resul = 0;

		System.out.println("Digame un numero entero: ");
		num = teclado.nextInt();

		while (num > 0) {

			resto = num % 10;

			resul = resto + resul;
			num = num / 10;

		}

		System.out.println("la suma de sus digitos es de: " + resul);

	}

}
