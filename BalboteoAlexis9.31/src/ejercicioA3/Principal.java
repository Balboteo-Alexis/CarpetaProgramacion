package ejercicioA3;

import java.io.File;
import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {

		Scanner teclado = new Scanner(System.in);

		
		
		
		System.out.println("Que ruta quieres cambiar: ");
		
		File rutaCambiar ;
		
		String ruta = teclado.nextLine();
		
		rutaCambiar = new File(ruta);
		
		
		
		System.out.println("Que nombre le quieres poner: ");
		String nuevoNombre = teclado.nextLine();
		File rutaNueva = new File(nuevoNombre);
		rutaCambiar.renameTo(rutaNueva);
		
		
		
		
		
		
	}
	
	
	
	
	
	

}
