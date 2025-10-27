/*
 * 
 * 
 * 
 */


package ejercicio16;

import java.util.Arrays;
import java.util.Scanner;

public class Ejercicio16 {

	public static void main(String[] args) {
		


		Scanner teclado = new Scanner(System.in);

		final int TAMANO;
		TAMANO=55;
		
		int inicio ,fin;
		
		int[] tabla = new int[TAMANO];
		
	
		inicio = 0;
		fin = 0;
		
		
		for (int i = 1; i < 11; i++) {

			fin= inicio+i;
			
			Arrays.fill(tabla, inicio, fin, i);
			inicio=fin;
		}
		 
		for (int i = 0; i < TAMANO; i++) {

			System.out.print(tabla[i]);
		}

		
		
		
		
		
		teclado.close();

	}
		
		



}
