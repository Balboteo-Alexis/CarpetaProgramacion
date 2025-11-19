package ejercicio4;

import java.util.Scanner;

public class Ejercicio4 {

	public static void main(String[] args) {
		

		
		Scanner teclado = new Scanner(System.in);
		
		String frase;
		int contA=0, contE=0 , contI=0, contU=0, contO=0; 
		
		System.out.println("Vamos a contar vocales, ");
		
		System.out.println("introduzca una frase: ");
		frase= teclado.nextLine();
		frase = frase.toLowerCase();
		
		for(int i =0;  i< frase.length(); i++) {
			 
			
			switch (frase.charAt(i)) {
			case 'a': {
				contA++;
				break;
				
			}
			case 'e': {
				contE++;
				break;
				
			}
			case 'i': {
				contI++;
				break;
				
			}
			case 'o': {
				contO++;
				break;
				
			}
			case 'u': {
				contU++;
				break;
				
			}
			default:
				
			}
		}
		
		
		
		System.out.println("Nº de A´s: "+ contA);
		System.out.println("Nº de E´s: "+ contE);
		System.out.println("Nº de I´s: "+ contI);
		System.out.println("Nº de O´s: "+ contO);
		System.out.println("Nº de U´s: "+ contU);
		


	}

}
