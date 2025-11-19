package ejercicio2;

import java.util.Scanner;

public class Ejercicio2 {

	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		
		String frase1, frase2;
		
		
		
		System.out.println("introduzca una frase: ");
		frase1 = teclado.nextLine();
		System.out.println("introduzca otra frase: ");
		frase2 = teclado.nextLine();
		
		
		if(frase1.equals(frase2)) {
			
			System.out.println("Las frases son iguales");
			
		}else if(frase1.equalsIgnoreCase(frase2)) {
			
			
			System.out.println("Las frases sin tener en cuenta minusculas o mayusculas son identicas");
			

		}else {
			System.out.println("Son diferentes");
		}

	}

}
