/*
 * Descripción: Un ejercicio de produccion donde nos dan datos y tenemos que hacer unas operaciones con ellos
 * Autor: Alexis Balboteo González
 * Fecha: 28/01/2026
 */

package ejercicio1;

public class Ejercicio1 {

	public static void main(String[] args) {

		int[][] tablaProduccion = new int[4][5];

		// Rellenamos tabla con los parametros dados en el enunciado
		rellenarTablaRandom(tablaProduccion);
		// Mostramos la tabla como pide el enunciado
		mostrarTabla(tablaProduccion);

		// Calculos

		System.out.println("\nCALCULOS:\n");

		// Produccion semanal de cada uno
		System.out.println("PRODUCCION SEMANAL: ");

		System.out.println("Producción semanal de Juan es de: " + produccionSemanal(0, tablaProduccion));
		System.out.println("Producción semanal de Jose es de: " + produccionSemanal(1, tablaProduccion));
		System.out.println("Producción semanal de Pedro es de: " + produccionSemanal(2, tablaProduccion));
		System.out.println("Producción semanal de Luis es de: " + produccionSemanal(3, tablaProduccion));

		// Produccion media cada dia

		System.out.println("\nPRODUCCION MEDIA DIARIA: ");

		System.out.println("Produccion media del Lunes: " + produccionMedia(0, tablaProduccion));
		System.out.println("Produccion media del Martes: " + produccionMedia(1, tablaProduccion));
		System.out.println("Produccion media del Miercoles: " + produccionMedia(2, tablaProduccion));
		System.out.println("Produccion media del Jueves: " + produccionMedia(3, tablaProduccion));
		System.out.println("Produccion media del Viernes: " + produccionMedia(4, tablaProduccion));

		// El dia con la media mas baja
		
		
		
		System.out.println( "\nEl dia con menos produccion es el: " + diaMediaBaja(tablaProduccion));
		

	}
// La produccion media diaria mas baja
	public static String diaMediaBaja(int[][] tabla) {

		String[] dias = { "Lunes","Martes", "Miercoles", "Jueves", "Viernes" };

		String dia = dias[0];

		double valorMax = produccionMedia(0, tabla);

		for (int i = 1; i < 5; i++) { // empieza en uno ya que el 0 esta contemplado al inicializarlo

			if (valorMax > produccionMedia(i, tabla)) {
				valorMax = produccionMedia(i, tabla);
				dia = dias[i];
			}

		}

		return dia;
	}
// Produccion media diaria
	public static double produccionMedia(int dia, int[][] tabla) {

		int total = 0;
		double media;

		for (int i = 0; i < 4; i++) {
			total = tabla[i][dia] + total;

		}

		media = total / 4;

		return media;
	}
	// Calcula la produccion semanal de cada operario
	public static int produccionSemanal(int operario, int[][] tabla) {

		int total = 0;

		for (int i = 0; i < 5; i++) {
			total = tabla[operario][i] + total;
		}

		return total;
	}

	// Rellena tabla con numeros aleatorios del 100 al 300
	public static void rellenarTablaRandom(int[][] tablaCualquiera) {

		for (int i = 0; i < tablaCualquiera.length; i++) {

			for (int j = 0; j < tablaCualquiera[i].length; j++) {

				tablaCualquiera[i][j] = (int) (Math.random() * 20 + 10) * 10;
			}
		}
	}

	// Muestra la tabla por pantalla
	public static void mostrarTabla(int[][] tablaCualquiera) {

		System.out.println("\tLunes\tMartes\tMierco\tJueves\tViernes");

		String[] nombres = { "Juan", "Jose", "Pedro", "Luis" };

		for (int i = 0; i < tablaCualquiera.length; i++) {
			System.out.print(nombres[i] + "\t");
			for (int j = 0; j < tablaCualquiera[i].length; j++) {

				System.out.print(tablaCualquiera[i][j] + "\t");
			}
			System.out.println("\n");
		}
	}

}
