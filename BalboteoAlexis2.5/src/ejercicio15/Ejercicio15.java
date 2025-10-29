/*
 * Descripción:
 * Fecha:
 * Autor:
 */


package ejercicio15;

import java.util.Scanner;

public class Ejercicio15 {
	
	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		
		int num, billetes, resto;
		
		System.out.print("Digame una cantidad de euros (multiplo de 5):");
		num = teclado.nextInt();
		resto=num;
		
/*		while(resto>=500) {
		
			billetes =resto/500;
			resto = resto%500;
			
			if(resto < 500) {
				
				System.out.println("numero de billetes de 500:" + billetes);
				
			}
		}
		while(resto>=200) {
			
			billetes =resto/200;
			resto = resto%200;
			
			if(resto < 200) {
				
				System.out.println("numero de billetes de 200:" + billetes);
				
			}
		}
		
		while(resto>=100) {
			
			billetes =resto/100;
			resto = resto%100;
			
			if(resto < 100) {
				
				System.out.println("numero de billetes de 100:" + billetes);
				
			}
		}
*/
		double n =500;
		
		while(resto>=5) {
			
			while(resto>=n) {
				
				billetes = (int) (resto/ n);
				resto = (int) (resto%n);
				
				if(resto < n) {
					
					System.out.println("numero de billetes de "+n+": "+ billetes);
					
				}
				if(n==500 || n == 50) {
					n=n/2.5;
				}
				else {
					n=n/2;
				}
			}
			
			
			
		}
		
	}
	
	
	

}
