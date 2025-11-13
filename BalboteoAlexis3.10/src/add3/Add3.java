package add3;

import java.util.Scanner;

public class Add3 {

	public static void main(String[] args) {

		Scanner teclado = new Scanner(System.in);

		int[][] array2Dimendiones = creadorDeTablas(teclado);
		System.out.println("\n");
		rellenarTablaRandom(array2Dimendiones);
		mostrarTabla(array2Dimendiones);

		
		
	}
	
//	Crea un array de 2 dimensiones
	
	public static int[][] creadorDeTablas(Scanner teclado) {

		System.out.println("Dime el numero de FILAS de nuestra tabla: ");
		int filas = teclado.nextInt();
		System.out.println("Dime el numero de COLUMNAS de nuestra tabla: ");
		int columnas = teclado.nextInt();

		int[][] tabla = new int[filas][columnas];


		return tabla;

	}

	
	//Muestra la tabla por pantalla
		public static void mostrarTabla(int[][] tablaCualquiera) {

			for (int i = 0; i < tablaCualquiera.length; i++) {

				for (int j = 0; j < tablaCualquiera[i].length; j++) {

					System.out.print(tablaCualquiera[i][j] + " ");
				}
				System.out.println("\n");
			}
		}
		
	//Rellena tabla con numeros aleatorios del 1 al 100
		
		public static void rellenarTablaRandom(int[][] tablaCualquiera) {

			for (int i = 0; i < tablaCualquiera.length; i++) {

				for (int j = 0; j < tablaCualquiera[i].length; j++) {

					tablaCualquiera[i][j] = (int) (Math.random() * 100);
				}
			}
		}
	
}
