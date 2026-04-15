/*
 * Descripción: Un ejercicico donde creamos un arraylist de empleados y hacemos varias operaciones con ellos
 * Autor: Alexis Balboteo González
 * Fecha: 15/04/2026
 */

package Balboteo1;

import java.time.LocalDate;

public class Principal {

	public static void main(String[] args) {

		
		System.out.println("[1]");
		
		Libros miLibro = new Libros("Balboteo");
		
		System.out.println(miLibro.toString());
		
		
		System.out.println();
		System.out.println("[2]");
		
		double cantidad = miLibro.calcularPrecioPrestamo(10);
		
		System.out.printf("costará %.2f", cantidad);
		
		
		System.out.println();
		System.out.println("[3]");
		
		Revistas RevsinParametros = new Revistas();
		
		System.out.println(RevsinParametros.toString());
		
		System.out.println();
		
		System.out.println("[4]");
		
		cantidad = RevsinParametros.calcularPrecioPrestamo(5);
		
		System.out.printf("costará %.2f", cantidad);
		
		System.out.println();
		System.out.println("[5]");
		
		
		
		boolean fechaCorrecta = false;
		
		do {
			int fecha = fechaRandom();
			try {
				
				
				
				miLibro.setFechaPublica(LocalDate.of( fecha, 1, 1));
				
				fechaCorrecta = true;
				
			} catch (Exception e) {
				System.out.printf("Fecha %d incorrecta, vuelve a intentarlo", fecha);
				fechaCorrecta = false;
			}
			
			
			
			}while (!fechaCorrecta) ;
		
		
		
		
		System.out.println(miLibro.toString());
		
	}
	
	
	// metodos
	
	public static int fechaRandom(){
		
		int fecha = (int)(Math.random()*20) + 1940;
		
				return fecha;
		
	}
	

}
