package ejercicio5;

import java.util.Scanner;

public class Ejercicio5 {

	public static void main(String[] args) {

		Scanner teclado = new Scanner(System.in);

		String frase;

		System.out.print("Digame que numero de dorsal llevas: ");
		int num = teclado.nextInt();

		if (num < 17 && num > 0) {


			System.out.print("Como te llamas chavalote? ");
			teclado.nextLine();
			String nombre = teclado.nextLine();

			System.out.printf("%s, con el dorsal %d juega el próximo partido como %s", nombre,num, posicionJugador(num));

		} else {

			System.out.println("Numero introducido incorrecto.");
		}

	}

	public static String posicionJugador(int num) {

		String texto;

		if (num == 1) {

			texto = "portero";
		}else if(num<6) {
			texto = "defensa";
		}else if(num<9) {
			texto = "centrocampista";
		}else if(num<12) {
			texto= "delantero";
		}else {
			texto= "suplente";
		}

		return texto;
	}

}
