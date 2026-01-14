/*
 * 
 *  Esto es un ejercicio donde hay que crear una tabla con valores random, además vamos a pedir ciertos valores con un panel de control.
 * 
 * 
 */



package add1;

import java.util.Scanner;

public class Add1 {

	public static void main(String[] args) {
		
		
		int opmenu, filas, columnas;
		
		Scanner teclado = new Scanner(System.in);
		
		
		System.out.print("Esto es un programa que hace cambios en tablas, para ello crearemos la tabla, "
				+ "dime las dimensiones de la misma."
				+ " \nCuantas filas quiere que tenga tu tabla: ");
		filas = teclado.nextInt();
		System.out.print("Cuantas columnas: ");
		columnas = teclado.nextInt();
		
		
		
		System.out.println("MENU:\n");
		
//		Menu basico
		
		System.out.println("1 - Rellenar tabla con valores random");
		System.out.println("2 - Cambiar valor concreto");
		System.out.println("3 - Dime un numero y te digo cuentas veces se repite en la tabla");
		System.out.println("4 - Poner que una fila tenga el mismo numero");
		System.out.println("5 - Mostrar el valor máximo y mínimo de la tabla");
		System.out.println("6 - Calcula la suma de todos los valores");
		System.out.println("7 - Mostrar la media de cada fila");
		System.out.println("8 - Buscar número y mostrar su posición");
		System.out.println("9 - Ordenar cada fila de la tabla de menor a mayor");
		System.out.println("10 - Mostrar tabla");
		
		
		
		int[][] tabla  =  new int[filas][columnas];
		
		
		
		System.out.print("Digame que quiere hacer: ");
		opmenu = teclado.nextInt();
		
		while(opmenu>11 || opmenu<1) {
			System.out.println("Error de selección");
			System.out.println("\nElige de nuevo: ");
			opmenu = teclado.nextInt();
			
		}
		
		switch (opmenu) {
		
		case 1: {
			
			
			break;
		}

		case 2: {
			
			break;
		}
		case 3: {
	
			break;
		}
		case 4: {
	
			break;
		}
		case 5: {
	
			break;
		}
		default:
			
			
			
		}
		
		
	}
	
	
//	Rellena tabla con numeros aleatorios del 1 al 100
	public static void rellenarTablaRandom(int [][] tablaCualquiera) {
		
		for(int i=0; i<tablaCualquiera.length ; i++) {
			
			for(int j =0 ; j<tablaCualquiera[i].length ; j++) {
		
				tablaCualquiera [i][j] = (int) (Math.random()*100);
			}
		}
	}
	
//	Muestra la tabla por pantalla
	public static void mostrarTabla(int[][] tablaCualquiera) {
		
		for(int i=0; i < tablaCualquiera.length ; i++) {
			
			for(int j =0 ; j< tablaCualquiera[i].length ; j++) {
		
				System.out.print( tablaCualquiera[i][j] + " ");
			}
			System.out.println("\n");
		}
	}
		
		
		
		
}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	


