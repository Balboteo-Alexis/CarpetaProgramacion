package metodos;

import java.util.Scanner;

public class MostrarArray1_2 {

public static void main(String[] args) {
		
		int x, y;
		
		
		
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Hagamos una tabla y mostremosla con metodos");
		
		System.out.println("Digame el numero de filas: ");
		x = teclado.nextInt();
		System.out.println("Digame el numero de columnas: ");
		y = teclado.nextInt();
		
		int[][] tabla = new int[x][y];
		tablaRandom(tabla);
		mostrarTabla(tabla);

	}
	
//	tablaRandom es un metodo para rellenar una tabla con numeros random
//  COGEMOS LA TABLA DEL MAIN PARA MODIFICARLA, EN ESTE CASO DARLE VALORES
	public static void tablaRandom( int[][] tablaCualquiera ){
		
		
		
		for(int i=0; i<tablaCualquiera.length ; i++) {
			
			for(int j =0 ; j<tablaCualquiera[i].length ; j++) {
		
				tablaCualquiera [i][j] = (int) (Math.random()*10);
			}
		}
	}
	
//	mostrarTabla, muestra cualquier array de 2 dimentiones de tipo int
	public static void mostrarTabla(int[][] tablaCualquiera) {
		
		for(int i=0; i < tablaCualquiera.length ; i++) {
			
			for(int j =0 ; j< tablaCualquiera[i].length ; j++) {
		
				System.out.print( tablaCualquiera[i][j] + " ");
			}
			System.out.println("\n");
		}
		
		
		
		
		
	}
	

}
