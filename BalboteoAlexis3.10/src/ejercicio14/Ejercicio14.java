/*
 * 
 * 
 * 
 */

package ejercicio14;
import java.util.Scanner;

public class Ejercicio14 {
	
	public static void main(String[] args) {
		
		final int TAMANO ;
		TAMANO = 55;
		int numero;
		numero = 1;
		
		Scanner teclado = new Scanner(System.in);
		
		int[] numeros = new int[TAMANO];
		
		for (int i = 0  ; i<10 ; i++) {
			
			int vueltas=0;
			
			while(vueltas < numero) {
				
				numeros[i] = numero;
				System.out.print(numeros[i] + " ");
				vueltas++;
			}
				
			numero++;
					
		}
		
		teclado.close();
	}
	
		
	

}
