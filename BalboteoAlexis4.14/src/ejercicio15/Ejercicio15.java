package ejercicio15;

public class Ejercicio15 {

	public static void main(String[] args) {

		int[] tabla = new int[50];
		rellenarArray(tabla);

		mostrarTabla(tabla);

		System.out.println("dima la suma de la tabla: " + sumaTabla(tabla));

		System.out.println("dima la media de la tabla: " + mediaTabla(tabla));

	}

	public static void rellenarArray(int[] tabla) {

		for (int i = 0; i < tabla.length; i++) {

			tabla[i] = (int) ((Math.random() * 50) + 50);

		}

	}

	public static int sumaTabla(int[] tabla) {

		int total = tabla[0];
		for (int i = 1; i < tabla.length; i++) {

			total = tabla[i] + total;

		}

		return total;
	}

	public static double mediaTabla(int[] tabla) {

		double media = (double) sumaTabla(tabla) / tabla.length;

		return media;
	}

	// Muestra la tabla por pantalla
	public static void mostrarTabla(int[] tablaCualquiera) {

		for (int j = 0; j < tablaCualquiera.length; j++) {

			System.out.print(tablaCualquiera[j] + " ");
		}
		System.out.println();

	}

}
