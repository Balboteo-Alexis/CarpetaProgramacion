/*
 * Autor: Alexis Balboteo
 * Fecha: 29/04/2026
 * Descripcion: Administramos y hacemos varias operaciones con una lista de socios
 * 
 */



package balboteo;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.HashSet;
import java.util.Scanner;



public class Ejercicio {

	public static void main(String[] args) {

		
			// -----------Apartado 1-----------
		
		System.out.println("1 Importa los socios");
		
		HashSet<Socio> listaSocios = new HashSet<Socio>();
		
		listaSocios = listarALosSocios("socios.txt");
		
		System.out.println(listaSocios.toString());
		
		System.out.printf( "Se han guardado: %d " ,listaSocios.size());

		System.out.println("\n");
		
		
		// -----------Apartado 2-----------
		System.out.println("2 Creamos un socio");
		
		Socio hugo1 = new Socio(10, "Hugo", (byte)4);
		
		System.out.println("Mostramos al nuevo socio: " + hugo1.toString());
		
		System.out.println("Añadimos a Hugo, el resultado de añadirlo es: " + listaSocios.add(hugo1));
		
		System.out.printf( "Hay %d socios guardados" ,listaSocios.size());
		
		
		System.out.println("\n");
		
		// -----------Apartado 3-----------
		System.out.println("3 Creamos a hugo pero con otros valores");
		
		Socio hugo2 = new Socio(15, "Hugo", (byte)4);
		
		System.out.println("Mostramos al nuevo socio: " + hugo2.toString());
		
		System.out.println("Añadimos a Hugo, el resultado de añadirlo es: " + listaSocios.add(hugo2));
		
		System.out.printf( "Hay %d socios guardados %n%n" ,listaSocios.size());
		
		
		// -----------Apartado 4-----------
		System.out.println("4 compruba el id 5");

		// creamos un socio de id 5 y que nos lo devuelva de la lista
		
		
		Socio socioId5 = new Socio(5, null, (byte)0);
		
		
		
		System.out.println("Existe el socio con id 5? " + listaSocios.contains(socioId5));
		
		if(listaSocios.contains(socioId5)) {
			
			for (Socio socio : listaSocios) {
				
				if(socio.equals(socioId5)) {
					
					System.out.println(socio.toString());
				}
				
			}
			
		}
		
		// -----------Apartado 5-----------
		System.out.println("\n\n5 Cuantos socios tienen el nombre de Ana");
		
		
		int contadorAnas = 0;
		
		for (Socio socio : listaSocios) {
			
			if(socio.getNombre().contains("Ana")) {
				contadorAnas++;
				System.out.println(socio.toString());
				
				
			}
			
		}
		
		System.out.printf("En total hay: %d Ana/s en la lista", contadorAnas);
		
		System.out.println("\n\n");
		
		
		
		// -----------Apartado 6-----------
		System.out.println("6 Elimina el socio con id 15");
		
		// creamos un socio con id 15 y será el que eliminemos, gracias al equals borraremos al socio de la lista
		
		
		Socio socioId15 = new Socio(15, null, (byte)0);
		
		for (Socio socio : listaSocios) {
			
			if(socio.equals(socioId15)) {
				
				System.out.println(socio.toString());
			}
			
		}
		
		
		
		
		System.out.printf("El resultado de la operacion es: %b %n" , listaSocios.remove(socioId15));
		
		System.out.printf( "Hay %d socios guardados %n%n" ,listaSocios.size());
		
		
		
		// -----------Apartado 7-----------
		System.out.println("7 implementa un metodo para la antigüedad");
		
		
		double media  = mediaAntig(listaSocios);
		
		System.out.printf("La media de la antigüedad es de %.2f años" , media);
		
		
		System.out.println("\n\n");
		
		
		// -----------Apartado 8-----------
		
		System.out.println("8 Implementa un metodo para exportarlo");
		
		
		File sociosAntiguos = new File("socios_antiguos.txt");
		
		
		System.out.println("Se ha exportado bien? "+ generarArchivo(listaSocios, sociosAntiguos));
		
		
		
	}

	public static boolean generarArchivo(HashSet<Socio> original, File destino) {

		boolean resultado = false;

		try {
			FileWriter escribir = new FileWriter(destino);

			for (Socio socio : original) {

				double antiguo = (double) socio.getAntiguedad();

				if (mediaAntig(original) < antiguo) {

					String linea = socio.toString();

					escribir.write(linea);
					resultado = true;
				}

			}

			escribir.close();
		} catch (IOException ex1) {

			System.out.println("Error: " + ex1.getMessage());
		}

		return resultado;
	}

	public static double mediaAntig(HashSet<Socio> lista) {
		
		double resultado;
		double contadorSocios = 0;
		double suma = 0 ;
		
		for (Socio socio : lista) {
			
			suma  = (int) socio.getAntiguedad() + suma;
			contadorSocios++;
		}
		
		resultado = suma/contadorSocios;
		
		return resultado;
		
	}
	
	

	public static HashSet<Socio> listarALosSocios(String nombreFichero) {

		HashSet<Socio> evaluacion = new HashSet<Socio>();
		File archivo = new File(nombreFichero);

		try {
			Scanner lector = new Scanner(archivo);

			while (lector.hasNext()) {

				String linea = lector.nextLine();
				String[] valores = linea.split(";");
				
				int idSocio =  Integer.valueOf( valores[0])   ;
				String nombreSocio = valores[1];
				int antiguedadSocioInt =  Integer.valueOf(valores[2]);
				byte antiguedadSocio =  (byte) (antiguedadSocioInt);
				
				Socio nuevo = new Socio(idSocio,nombreSocio,antiguedadSocio);

				evaluacion.add(nuevo);

			}

			lector.close();
		} catch (Exception ex1) {

			System.out.println("Error: " + ex1.getMessage());

		}
		return evaluacion;

	}

	
	
	
	
	
	

}
