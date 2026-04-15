/*
 * Descripción: Un ejercicico donde creamos un arraylist de empleados y hacemos varias operaciones con ellos
 * Autor: Alexis Balboteo González
 * Fecha: 15/04/2026
 */



package Balboteo2;

import java.util.ArrayList;
import java.util.Iterator;



public class Main {

	public static void main(String[] args) {

		
		
		//// 1
		
		System.out.println("[1]");
		
		ArrayList<Empleado> plantilla = new ArrayList<Empleado>();
		
		for (int i = 0; i < 10; i++) {
			
			plantilla.add(Empleado.generarAleatorio());
			
			
		}
		
		System.out.printf("Hay %d empleados en total %n",  plantilla.size());
		System.out.println("\n PLANTILLA: ");
		for (Empleado empleado : plantilla) {
			System.out.println(empleado.toString());
		}
		
		System.out.println();
		//// 2
		
		System.out.println("[2]");
		
		Empleado nuevo = Empleado.generarAleatorio();
		
		System.out.printf("El nuevo empleado es: %s %n", nuevo.toString());
		
		int mitad = plantilla.size()/2;
		
		plantilla.add(mitad, nuevo);
		
		System.out.println("\n PLANTILLA: ");
		for (Empleado empleado : plantilla) {
			System.out.println(empleado.toString());
		}
		
		
		
		System.out.println();
		//// 3
		System.out.println("[3]");
		
		plantilla.sort(new ComaparadorDni());
		
		
		System.out.println("\n PLANTILLA: ");
		for (Empleado empleado : plantilla) {
			System.out.println(empleado.toString());
		}
		
		System.out.println();
		///// 4 
		
		System.out.println("[4]");
		
		nuevo = new Empleado("101010101Z", null, mitad, null);
		
		
		int posicion = buscarEmpleado(plantilla, nuevo);
		
		if (posicion != -1) {
			System.out.printf("    Encontrado en la posición %d:    %s%n", posicion, plantilla.get(posicion).toString());
		} else {
			System.out.printf("    Resultado: no está esta persona en la lista.%n");
		}
		
		///// 5 
		
		System.out.println("[5]");
		
		int contadorAna =0;
		
		for (Empleado empleado : plantilla) {
			
			if(empleado.getNombre() == "Ana") {
				
				System.out.println(empleado.toString());
				contadorAna++;
				
			}
			
			
		}
		
		System.out.printf("En la plantilla hay %d Anas", contadorAna);
		
		System.out.println();
		System.out.println();
		//// 6 
		
		System.out.println("[6]");
		
		Iterator<Empleado> it = plantilla.iterator();

		boolean encontrado = false;
		System.out.println("Eliminaremos a : ");
		while (it.hasNext()  ) {
			Empleado empleado = it.next();
			
			if (empleado.getNombre() == "Luis") {
				
				if(!encontrado) {
					System.out.println(empleado.toString());
					encontrado = true;
					posicion = plantilla.indexOf(empleado);
					
				}
			}
		}
		
		
		plantilla.remove(posicion);
		
		System.out.println("\n PLANTILLA: ");
		for (Empleado empleado : plantilla) {
			System.out.println(empleado.toString());
		}
		
	}

	
	// metodos
	// devuelve la posicion y si no está devuelve -1
		public static int buscarEmpleado ( ArrayList<Empleado> lista , Empleado empleadoBuscado) {
			
			int resultado;
				
			resultado = lista.indexOf(empleadoBuscado);
			

			return resultado;
		}
		
		
	
	
}
