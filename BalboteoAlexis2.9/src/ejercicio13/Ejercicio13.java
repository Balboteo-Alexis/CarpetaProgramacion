package ejercicio13;

import java.util.Scanner;

public class Ejercicio13 {

	public static void main(String[] args) {
		
		int num;
		String compara;
		
		Scanner teclado = new Scanner(System.in);
		
	
		
		num = (int) (Math.random()*100);
		
		System.out.print("Piensa en un numero del 1 al 100, lo adivinaré");
		System.out.println("He pensado en el número: "+ num + ".  Es mayor, menor o igual?");
		compara = teclado.nextLine();
		
		while(compara != "igual") {
			
			System.out.println("He pensado en el número: "+ num + ".  Es mayor, menor o igual?");
		
			compara = teclado.nextLine();
			
			switch (compara) {
			case "mayor": {
				
				
				break;
			}
			case "menor": {
				
				
				break;
			}
			case "igual": {
				
				
				break;
				
			}
			default:
				System.out.println("No te he entendido");
			}
		
		
			
		
		}
		
		System.out.println("Lo adivine jeje");
		
		
		
	}

}
