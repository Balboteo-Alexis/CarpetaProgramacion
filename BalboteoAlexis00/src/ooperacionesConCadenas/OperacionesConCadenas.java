package ooperacionesConCadenas;

import java.util.Scanner;

public class OperacionesConCadenas {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);

		System.out.print("Dime un nombre: ");
		String nombre = teclado.nextLine();
		String inicial, mayuscula;
		int tamano = nombre.length();

		System.out.println("el numero de caracteres de tu nombre es de: " + tamano);

		inicial = nombre.substring(0, 1);

		mayuscula = inicial.toUpperCase();
		nombre = mayuscula + nombre.substring(1, tamano);
		System.out.println("nombre ahora:" + nombre);

	}

}
