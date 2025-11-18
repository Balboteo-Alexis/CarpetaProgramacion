package ejercicio20;

import java.util.Scanner;

public class Ejercicio20 {

	public static void main(String[] args) {
		
		Scanner teclado =new Scanner(System.in);
		
		tablasPrincipales();
		
		System.out.println("Dime un numero y te digo su tabla: ");
		int num = teclado.nextInt();
		tablaPedida(num);
		

	}

	
	
	public static void tablasPrincipales() {
		
		for(int i =0 ; i<10 ; i++) {
			
			System.out.println("Tabla del " + i);
			
			for(int j =0; j<10 ; j++) {
				
				System.out.print(i*j + " ");
			}
			System.out.println("\n");
			
		}
	}
	
		
	public static void tablaPedida (int a) {
		
		System.out.println("Tabla del " + a);
		
		for (int i=0 ; i<10 ;i++) {
			
			System.out.print(i*a + " ");
			
		}
		
		
		
	
	
	}
	
}
