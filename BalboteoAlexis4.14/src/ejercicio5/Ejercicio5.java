package ejercicio5;

import java.util.Scanner;

public class Ejercicio5 {

	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Dime cuantas millas has recorrido");
		
		int millas = teclado.nextInt();
		
		System.out.println("Has recorrido " + millas_a_kilometros(millas) + " km");
		teclado.close();

	}
	
//  
	
	public static double millas_a_kilometros(int millas) {
		
		double kilom;
		
		kilom = millas * 1.60934 ;
		
		
		return kilom;	
		
		
	}
}
