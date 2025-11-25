package metodos_varios;

import java.util.Scanner;

public class Invertir_frase {

	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Digame su frase favorita: ");
		
		String frase = teclado.nextLine();
		
		
		System.out.println(invertirFrase(frase));
		
	}
	
	
	public static String invertirFrase(String frase) {
		
		String invertida="";
		
		for(int i = frase.length()-1; i>=0 ; i--) {
			
			invertida = invertida +frase.charAt(i);
			
		}
		return invertida;
	}

}
