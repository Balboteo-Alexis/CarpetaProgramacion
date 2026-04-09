package ejercicio1;

import java.io.File;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		ArrayList<Alumno> evaluacion = new ArrayList<Alumno>();

		evaluacion = listaAlumnos("notas1.txt");
		
		
		System.out.println(evaluacion.size());

		evaluacion.sort(new Comparador());

		System.out.println(evaluacion.toString());

		// 4

		Alumno nuevo = new Alumno("1º ESO D", "López Muro, Rosario", 3, 3, 4, 4, 3);

		evaluacion.add(nuevo);

		// 5
		
		nuevo = new Alumno("1º ESO B", "Duarte Durán, Alba", 2, 3, 4, 1, 3);
		
		int mitad = evaluacion.size()/2;
		
		evaluacion.add(mitad, nuevo);
		
		// 6 
		
		System.out.println(evaluacion.indexOf(nuevo));
		
		
		// 7 
		
		ArrayList<Alumno> auxiliar = new ArrayList<Alumno>();
		
		auxiliar = listaAlumnos("notas2.txt");
		
		
		evaluacion.addAll(auxiliar);
		
		
		System.out.println(evaluacion.size());
		
		
		
		//8
		
		String personaBuscada = "Cordero Benítez, Alejandro";
		
		boolean enBusca = true;
		while(enBusca) {
			
			for (Alumno alumno : evaluacion) {
				
				if(alumno.equals(personaBuscada)) {
					
					System.out.println(alumno.toString());
				}
					
				
				
			}
			
			
		}
		

	}

	public static ArrayList<Alumno> listaAlumnos(String nombreFichero) {

		ArrayList<Alumno> evaluacion = new ArrayList<Alumno>();

		try {
			File archivo = new File(nombreFichero);
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
