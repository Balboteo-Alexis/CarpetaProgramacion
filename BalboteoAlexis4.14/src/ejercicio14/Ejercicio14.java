package ejercicio14;

import java.util.Scanner;

public class Ejercicio14 {

	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		
		int altura;
		char caracter;
		String palabra;
		
		System.out.println("Vamos a hacer piramides.");
		
		System.out.println("De que tamaño quieres la piramide: ");
		altura = teclado.nextInt();
		teclado.nextLine();
		System.out.println("Con que caracter quieres la piramide: ");
		palabra = teclado.nextLine();
		caracter = palabra.charAt(0);
		
		hacerPiramide(altura, caracter);

	}
	
	public static void hacerPiramide( int altura, char a) {
		
		for(int i = 0 ; i<altura ; i++) {
			int k =i;
			for(int j = -1; j< i ; j++) {
				
				while(altura >k ) {
					System.out.print(" ");
					k++;
				}
				
				if(i!=0) {
					int cantidad = 	(2*i +1);
					
					for(int p = 1; p<cantidad; p++) {
						
						System.out.print(a);
					}
					
				}

				
				
				
			}
			System.out.println();
		}
		
		
		
//		
//		for(int i = 0 ; i < altura; i++ ) {
//			
//			for(int j = 0 ; j < i ; j++) {
//				
//				
//				(2*i +1)
//				System.out.print(a);
//			}
//			
//			System.out.println();
//			
//			
//		}
		
	}
	
	
	
	
	
	

}
