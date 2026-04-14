package ejercicio2;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Collections;
import java.util.LinkedList;
import java.util.Scanner;

import ejercicio1.Alumno;

public class Main {

	public static void main(String[] args) {

		
		LinkedList<Alumno> evaluacion = new LinkedList<Alumno>();
		
		
		// 1. Importa los registros contenidos en el documento notas1.txt, donde la
		// información tiene el siguiente formato:
		// grupo;nombre;matemáticas;lengua;física;química;inglés

		
		evaluacion = listaAlumnos("notas1.txt");
		
		System.out.println("[1] Añadiendo registros de notas1.txt a la lista...\n");
		
		// 2. Muestra el número de registros que contiene.

		int registros = evaluacion.size();
		System.out.printf("[2] Número de registros añadidos a la lista: %d %n%n" , registros);
		
		// 3. Ordena los registros por grupo y nombre.
		
		System.out.println("[3] Ordenamos la lista por grupo y nombre...");
		
		Collections.sort(evaluacion);
		
		
		System.out.println("Guardamos la lista ordenada en: LinkedList3.txt");
		
		
		File resultados1 = new File(" LinkedList3.txt");
		
		
		
		generarArchivo(evaluacion , resultados1);
		
		
		System.out.println();
		// 4. Añade el registro abajo indicado en la mitad de la lista:
		// 1º ESO A;Plaza Gallego, Juan;1;1;3;1;1

		
		System.out.println("[4] Añadimos un registro en mitad de la lista...");
		
		System.out.printf("Tamaño: %d Alumnos ", evaluacion.size());
		
		Alumno nuevo = new Alumno("1º ESO A", "Plaza Gallego, Juan", 1,1,3,1,1);
		
		int mitad = evaluacion.size()/2;
		
		evaluacion.add(mitad, nuevo);
		
		System.out.printf("Tamaño: %d Alumnos ", evaluacion.size());
		System.out.println("Posición del nuevo registro: "  + evaluacion.lastIndexOf(nuevo)  );
		
		System.out.println();
		// 5. Añade el mismo registro al principio de la lista.
		
		System.out.println("[5] Añadimos el registro...");
		
		
		evaluacion.addFirst(nuevo);
		
		System.out.printf("Tamaño: %d Alumnos ", evaluacion.size());
		System.out.println("Posición del nuevo registro: "  + evaluacion.indexOf(nuevo)  );
		
		
		System.out.println();
		// 6. Importa los registros contenidos en el documento notas2.txt en una lista
		// auxiliar.
		
		System.out.println("[6] Añadiendo registros de notas2.txt a la lista mediante una lista auxiliar... ");
		
		System.out.println("Total registros antes de añadir:" + evaluacion.size());
		
		LinkedList<Alumno> aux = new LinkedList<Alumno>();
		
		aux = listaAlumnos("notas2.txt");
		
		
		
		System.out.println("Total registros de la lista auxiliar: " +aux.size());
		
		System.out.println();
		// 7. Añade la lista auxiliar al principio de la lista original.
		
		System.out.println("[7] Añade la lista auxiliar al principio de la lista original.");
		
		evaluacion.addAll(aux);
		System.out.println("Total registros despues de añadir:" + evaluacion.size());
		
		System.out.println("Guardamos la lista completa en: LinkedList7.txt");
		
		
		File resultados2 = new File(" LinkedList7.txt");
		
		
		
		generarArchivo(evaluacion , resultados2);
		

		System.out.println();
		// 8. Muestra el registro que está en la primera posición de la lista.
		
		System.out.println("[8] Muestra el registro que está en la primera posición de la lista...");
		
		System.out.println(evaluacion.getFirst().toString());
		
		System.out.println();
		// 9. Muestra el registro que está en la última posición de la lista.

		System.out.println("[9] Muestra el registro que está en la última posición de la lista...");
		System.out.println(evaluacion.getLast().toString());
		
		System.out.println();
		
		
		// 10. Muestra el registro que está en la mitad de la lista.
		
		System.out.println("[10] Muestra el registro que está en la mitad de la lista...");
		
		mitad = evaluacion.size()/2;
		
		System.out.println(evaluacion.get(mitad).toString());

		System.out.println();
		
		// 11. ¿Qué posición ocupa la primera ocurrencia del registro insertado?				// ya se añadio al principio no entiendo
		
		System.out.println("[11] ¿Qué posición ocupa la primera ocurrencia del registro insertado?...");
		
		int posicion = evaluacion.indexOf(nuevo);
		
		System.out.println(posicion);
		
		
		
		System.out.println();
		// 12. ¿Qué posición ocupa la última ocurrencia del registro insertado?
		
		System.out.println("[12]  Qué posición ocupa la última ocurrencia del registro insertado?...");
		
		
		posicion = evaluacion.lastIndexOf(nuevo);
		
		System.out.println(posicion);
		
		
		
		

		// 13. ¿El siguiente registro está en la lista?
		
		System.out.println("[13] ¿El siguiente registro está en la lista? 1º ESO E;Postigo Vázquez, Salvador;3;6;5;3;4...");
		
		nuevo = new Alumno("1º ESO E", "Postigo Vázquez, Salvador",3,6,5,3,4);
		
		
		posicion = buscarRegistro(evaluacion, nuevo);
		
		
		
		if (posicion != -1) {
			System.out.printf("    Encontrado en la posición %d:    %s%n", posicion, evaluacion.get(posicion).toString());
		} else {
			System.out.printf("    Resultado: no está esta persona en la lista.%n");
		}
		
		
		
		System.out.println();
		// 14. ¿Y éste?
		// 1º ESO A;García Fernández, María;6;5;6;5;5
		
		System.out.println("[14] ¿El siguiente registro está en la lista? 1º ESO A;García Fernández, María;6;5;6;5;5...");
		
		nuevo = new Alumno("1º ESO A","García Fernández, María",6,5,6,5,5);
		

		posicion = buscarRegistro(evaluacion, nuevo);
		
		
		
		if (posicion != -1) {
			System.out.printf("    Encontrado en la posición %d:    %s%n", posicion, evaluacion.get(posicion).toString());
		} else {
			System.out.printf("    Resultado: no está esta persona en la lista.%n");
		}
		
		 
		System.out.println();

		// 15. Elimina la primera ocurrencia del registro insertado y muestra su
		// posición y contenido.

		System.out.println("[15] Elimina la primera ocurrencia del registro insertado y muestra su posición y contenido.");
		
		System.out.printf("Tamaño: %d Alumnos ", evaluacion.size());
		
		nuevo = new Alumno("1º ESO A", "Plaza Gallego, Juan", 1,1,3,1,1);
		
		posicion = evaluacion.indexOf(nuevo);  
		
		
		System.out.printf("La primera ocurrencia es en la posicion: %d %s",posicion,evaluacion.get(posicion).toString() );
		
		evaluacion.removeFirstOccurrence(nuevo);
		
		System.out.println("Borramos el registro..");
		System.out.printf("Tamaño: %d Alumnos ", evaluacion.size());
		
		System.out.println();
		
		// 16. Elimina el registro que ocupa la posición media de la lista mostrando su
		// contenido.
		
		
		System.out.println("[16] Elimina el registro que ocupa la posición media de la lista mostrando su contenido...");
		
		System.out.printf("Tamaño: %d Alumnos ", evaluacion.size());
		
		mitad = evaluacion.size()/2;
		
		System.out.println(evaluacion.get(mitad).toString());
		evaluacion.remove(mitad);
		
		System.out.println("Borramos el registro..");
		
		System.out.printf("Tamaño: %d Alumnos ", evaluacion.size());
		

		// 17. Elimina el registro cuyo nombre es: Carrillo Segura, Félix, indicando su
		// posición y contenido.

		// 18. Elimina el registro cuyo nombre es: Robles Ortiz, Rafael, indicando su
		// posición y contenido.

		// 19. Intenta simular una pila con la lista original. Realiza dos inserciones y
		// extracciones detallando su funcionamiento.
		
		
		
		 

		// 20. Intenta simular una cola con la lista original. Realiza dos inserciones y
		// extracciones detallando su funcionamiento.

	}
	
	
	// Metodos


	
	
	
	// devuelve la posicion y si no está devuelve -1
	public static int buscarRegistro ( LinkedList<Alumno> lista , Alumno alumnoBuscado) {
		
		int resultado;
			
		resultado = lista.indexOf(alumnoBuscado);
		

		return resultado;
	}
	
	
	
	
	
	
	
	public static boolean generarArchivo(LinkedList<Alumno> original, File destino) {

		boolean resultado = false;
		
		
		
		try {
			FileWriter escribir = new FileWriter(destino);
			
			for (int i = 0; i < original.size(); i++) {
				
				String linea = original.get(i).toString();
				
				escribir.write(linea);
				resultado = true;
				
			}
			
			escribir.close();
		} catch (IOException ex1) {
			
			System.out.println("Error: " + ex1.getMessage());
		}

		
		return resultado;
	}
	
	
	public static LinkedList<Alumno> listaAlumnos(String nombreFichero) {

		LinkedList<Alumno> evaluacion = new LinkedList<Alumno>();
		File archivo = new File(nombreFichero);

		try {
			Scanner lector = new Scanner(archivo);

			while (lector.hasNext()) {

				String linea = lector.nextLine();
				String[] valores = linea.split(";");
				Alumno nuevo = new Alumno(valores[0], valores[1], Integer.parseInt(valores[2]),
						Integer.parseInt(valores[3]), Integer.parseInt(valores[4]), Integer.parseInt(valores[5]),
						Integer.parseInt(valores[6]));

				evaluacion.add(nuevo);

			}

			lector.close();
		} catch (Exception ex1) {

			System.out.println("Error: " + ex1.getMessage());

		}
		return evaluacion;

	}

}
