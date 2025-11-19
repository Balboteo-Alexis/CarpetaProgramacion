package ejercicio1;

import java.util.Scanner;

public class Ejercicio1 {

	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		
		String frase;
		
		
		
		System.out.println("introduzca una frase: ");
		frase = teclado.nextLine();
		
		for(int i =0; i< frase.length(); i++) {
			
			System.out.print(frase.charAt(i));
			if( frase.charAt(i) == ' ' ) {
				System.out.println();
			}
			
			
			
		}
		
		

	}

}
