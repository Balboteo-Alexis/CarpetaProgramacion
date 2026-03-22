package ejercicio7;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner teclado = new Scanner(System.in);

		ArrayList<Venta> ventas = new ArrayList<Venta>();

		// MENÚ
		int op = 0;

		do {
			System.out.println("------- MENÚ --------");

			System.out.print("1.- Introducir la venta de coches de cada uno de los meses del año.\n"
					+ "2.- Mostrar las ventas introducidas en el punto anterior.\n"
					+ "3.- Mostrar la suma total de ventas de coches del año.\n"
					+ "4.- Mostrar las ventas totales de los meses que empiezan por la letra A. (Utiliza el método correspondiente de la clase String)\n"
					+ "5.- Mostrar el nombre del mes con más ventas.\n" + "6.- Salir del programa\n"
					+ "------------------\n\n" + "Cual es tú eleccion: ");

			op = teclado.nextInt();

			switch (op) {
			case 1: {

				introducirVentas(ventas);

				System.out.println("\nProceso terminado.");

				break;
			}
			case 2: {

				Collections.sort(ventas, new Comparador());
				
				System.out.println(ventas.toString());

				break;
			}
			case 3: {

				int totalVentas = totalVentas(ventas);

				System.out.printf("El total de venats en el año he sido %d.", totalVentas);

				break;
			}
			case 4: {

				int ventasA = ventasMesA(ventas);

				System.out.printf("El total de ventas de los meses que empiezan por A es: %d", ventasA);

				break;
			}
			case 5: {

				String mesVentas = mesMasVentas(ventas);

				System.out.printf("El mes con mas ventas del año es: %s", mesVentas);

				break;
			}
			case 6: {
				System.out.println("Hasta luegooo.");
				break;
			}
			default:

				System.out.println("Eleccion erronea");

			}

			System.out.println("\n\n\n");

		} while (op != 6);

	}

	public static String mesMasVentas(ArrayList<Venta> lista) {

		String resultado;

		Venta compara = lista.getFirst();

		for (Venta venta : lista) {

			if (compara.getVentaCochesMes() < venta.getVentaCochesMes()) {

				compara = venta;

			}

		}

		resultado = compara.getMes();

		return resultado;
	}

	public static int ventasMesA(ArrayList<Venta> lista) {
		int resultado = 0;

		for (Venta venta : lista) {

			if (venta.getMes().charAt(0) == 'A') {

				resultado += venta.getVentaCochesMes();

			}

		}

		return resultado;
	}

	public static int totalVentas(ArrayList<Venta> lista) {

		int resultado = 0;

		for (Venta venta : lista) {
			resultado += venta.getVentaCochesMes();
		}

		return resultado;
	}

	public static void introducirVentas(ArrayList<Venta> lista) {

		Scanner teclado = new Scanner(System.in);

		String[] meses = { "Enero", "Febrero", "Marzo", "Abril", "Mayo", "Junio", "Julio", "Agosto", "Septiembre",
				"Octubre", "Noviembre", "Diciembre" };

		for (int i = 0; i < 12; i++) {

			System.out.printf("Para el mes %s, cuantas ventas se han hecho:", meses[i]);
			int numVentas = teclado.nextInt();

			lista.add(new Venta(meses[i], numVentas));

		}

	}

}
