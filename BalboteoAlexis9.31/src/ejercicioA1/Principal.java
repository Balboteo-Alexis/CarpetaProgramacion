package ejercicioA1;

import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {

		Scanner teclado = new Scanner(System.in);
		String texto;
		
		
		
		do {
			
			
			System.out.print("Dame una ruta de archivos: ");
			
			texto = teclado.nextLine();
			
			if(!texto.equals("")) {
				
				File ruta = new File(texto);
				
				muestrainfoRuta(ruta);
			}else {
				System.out.println("fin");
			}
			
			
			
			
			System.out.println();
		}while(!texto.equals(""));
		
		
		
		
		
		
		
	}

	public static void muestrainfoRuta(File ruta) {

		if (ruta.isFile()) {
			
			System.out.println("Archivo");
			System.out.println(    "A" + ruta.toString());

		} else if (ruta.isDirectory()) {

			
			
			System.out.println("Directorio");
			
			
			String[] lista = ruta.list();
			
			for (int i = 0; i < lista.length; i++) {
				
				
				
				System.out.println( "*" +lista[i].toString());
			}
			
			
		}else {
			System.out.println("no es ni ruta ni archivo");
		}

	}

}
