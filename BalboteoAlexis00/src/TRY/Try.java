package TRY;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Try {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		
		int num;
		boolean error;
		
		
		
		do {
			try {
				teclado.close();
				System.out.println("Dame un numero: ");
				num= teclado.nextInt();
				error=false;
				
			}catch (InputMismatchException ex1){
				
				
				System.out.println("Valor incorrecto");
				error=true;
				num=0;
				teclado.nextLine();
			
			}
			
		}while(error==true);
		
		
		System.out.println("El entero es: "+ num);

	}

}
