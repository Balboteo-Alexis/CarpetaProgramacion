package ejercicio1;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {

		Scanner teclado = new Scanner(System.in);
		
		Humano blanco;
		Ciudadano brayan, leonardo;
		
		blanco = new Humano("fede", "valdeverdde");
		brayan = new Ciudadano("Brayan", "Castillo","Sin papeles");
		leonardo = new Ciudadano("Leo","Castro","2321231E");
		
		
		
		
		System.out.println(blanco.getNombreCompleto());
		System.out.println(brayan.getNombreCompleto());
		System.out.println(leonardo.getNombreCompleto());
		System.out.println();
		System.out.println("Nuevo Humano");
		
		
		Humano lucia = new Humano();
		System.out.println(lucia.getNombreCompleto());
		System.out.println();
		
		System.out.println("Dime tu nombre: ");
		String nombre = teclado.nextLine();
		lucia.setNombre(nombre);
		System.out.println("Dime tu apellidos: ");
		String apellidos = teclado.nextLine();
		lucia.setApellidos(apellidos);
		
		
		System.out.println(lucia.getNombreCompleto());
		
		teclado.close();
		
	}

}
