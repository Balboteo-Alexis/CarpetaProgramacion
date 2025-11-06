package metodos;

import java.util.Scanner;

public class MostrarArray {

	public static void main(String[] args) {
		
		int x, y;
		
		
		
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Hagamos una tabla y mostremosla con metodos");
		
		System.out.println("Digame el numero de filas: ");
		x = teclado.nextInt();
		System.out.println("Digame el numero de columnas: ");
		y = teclado.nextInt();
		
		int[][] tabla = new int[x][y];
		
		tabla = tablaRandom(x,y);
		mostrarTabla(tabla);

	}
	
//	tablaRandom es un metodo para rellenar una tabla con numeros random
	
	public static int[][] tablaRandom( int x, int y){
		
		int[][] tabla = new int[x][y];
		
		for(int i=0; i<x ; i++) {
			
			for(int j =0 ; j<y ; j++) {
		
				tabla[i][j] = (int) (Math.random()*10);
			}
		}
		
		return tabla;
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
