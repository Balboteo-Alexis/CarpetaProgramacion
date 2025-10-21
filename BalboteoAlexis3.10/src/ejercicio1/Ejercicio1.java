/*
 * 
 * 
 * 
 */


package ejercicio1;

import java.util.Scanner;

public class Ejercicio1 {

	public static void main(String[] args) {
		
		
		final int TOTAL_NUM = 10;
		
		int[] numeros = new int[TOTAL_NUM]; //Declarción arrays
		
		Scanner teclado = new Scanner(System.in);
		
		
		System.out.println("Dame 10 valores.");
		
		
		for (int i = 0; i <10 ; i++  ) {
			
			int num;
			
			System.out.print(i+1 +"º Valor: ");
			num = teclado.nextInt();
			numeros[i] = num;
			
		}
		
		
		}
		
		
		

	}

