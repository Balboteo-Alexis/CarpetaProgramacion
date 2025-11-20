package ejercicio5;

import java.util.Scanner;

public class Ejercicio5 {

	public static void main(String[] args) {

		Scanner teclado = new Scanner(System.in);
		
		System.out.print("Digame que numero de dorsal llevas: ");
		
		posicionJugador(num);
		
		System.out.print("Como te llamas chavalote? ");
		String nombre = teclado.nextLine();
		
	}

	public static String posicionJugador(int num) {

		String texto;

		if (num < 17 || num > 0) {

		} else {

			texto = "Numero introducido incorrecto.";
		}

		return texto;
	}

}
