/*
 * Descripción: consumo electrico semanal y calcular un par de cuestiones con metodos
 * Autor: Alexis Balboteo González
 * Fecha: 17/12/2025
 */

package ejercicio1;



public class Ejercicio1 {

	public static void main(String[] args) {

		
		int[][] tabla = { {21,26,40,32,32,15,27,15,31,3,20,32,2,18,27,2,40,31,24,37,15,24,10,36},
				{5,25,28,5,10,30,14,6,35,33,29,9,32,15,8,37,15,39,19,30,40,14,18,2},
				{39,7,17,14,2,12,34,21,3,40,29,31,1,18,14,9,31,1,6,37,11,5,37,30},
				{1,12,37,6,7,30,31,3,15,35,2,38,6,30,32,31,2,32,6,14,14,21,21,38},
				{8,23,37,16,0,28,5,13,35,10,22,18,28,6,12,21,12,38,26,15,39,24,37,4},
				{28,7,27,5,21,27,37,17,39,8,29,30,22,10,6,32,39,18,34,0,25,35,4,29},
				{2,16,16,36,33,9,34,23,4,26,14,26,10,11,12,31,27,17,20,12,24,32,11,33} };
		
		String [] semana = {"lunes","martes", "miercoles","jueves","viernes", "sabado","domingo"};
		
		
		
// a la ultima hora que se produjo el consumo minimo
		
		for(int i = 0; i<7;i++) {
			System.out.printf("Para el dia %s, la ultima hora en la que se produjo el consumo minimo fue a las %d H %n", semana[i], consumoMinimo(tabla, i) );
		}
		
// b dia y hora consumo minimo
		System.out.println();
		diaHora(tabla);
		
// c diia mas consumo
		
		System.out.printf("El dia con mas consumo fue el, %s.", semana[diaConsumo(tabla)]);
		
	
		
	}
	
// duce a que hora feu el consumo miimo
	public static int consumoMinimo (int[][]tabla , int dia) {
		
		int minimo = tabla[dia][0];
		int hora=0;
		
		for(int i =0; i<24;i++) {
			
			if(minimo >= tabla[dia][i]) {
				minimo= tabla[dia][i];
				hora=i;
			}
			
		}
		
		return hora;
	}
	
	
// dia y hora con consumo minimo
	public static void diaHora( int[][] tabla) {
		
		int minimo = tabla[0][0];
		int hora=0;
		int dia=0;
		
		for(int j= 0; j<7; j++) {
			for(int i =0; i<24;i++) {
				
				if(minimo >= tabla[j][i]) {
					minimo= tabla[j][i];
					dia= j+1;
					hora=i;
				}
			}	
		}
		
		System.out.printf("El dia con el consumo minimo de la semana fue el %d a las %d horas%n", dia, hora);
		
	}
	
	
	// cómo hago sino el metodo con dos salidas?
	// debería hacer dos metodos? y juntar en la respuesta sus salidas? 
	
	
// dia mas consumo
	
	public static int diaConsumo(int[][]tabla) {
		int maximo = tabla[0][0];
		int dia=0;
		
		for(int j= 0; j<7; j++) {
			for(int i =0; i<24;i++) {
				
				if(maximo < tabla[j][i]) {
					maximo= tabla[j][i];
					dia= j+1;
					
				}
			}	
		}
		
		return dia;
	}
	
	
	
// dia 
	
	
	
	
	
}
