package jardinBotanico;

import java.util.HashSet;

/**
 * Ejercicio 1. Creando jardín botánico
 * 
 * @author Profesor
 */
public class Ejercicio01 {

	public static void main(String[] args) {

		// ----------------------------------------------
		// Declaración de variables
		// ----------------------------------------------

		final int CANTIDAD_ESPECIES_PLANTAS = 5;

		HashSet<String> primero = new HashSet<String>();
		HashSet<String> segundo = new HashSet<String>();
		HashSet<String> tercero = new HashSet<String>();
		HashSet<String> cuarto = new HashSet<String>();
		HashSet<String> quinto = new HashSet<String>();

		// ----------------------------------------------
		// Entrada de datos
		// ----------------------------------------------

		// No hay, pues se usa un número fijo de elementos aleatorios

		System.out.println("CONJUNTOS DE ESPECIES DE PLANTAS");
		System.out.println("--------------------------------");

		// ----------------------------------------------
		// Procesamiento
		// ----------------------------------------------

		// Rellenamos los conjuntos con especies de plantas aleatorias hasta que haya
		// CANTIDAD_ESPECIES_PLANTAS

		while (primero.size() != CANTIDAD_ESPECIES_PLANTAS) {

			primero.add(Utilidades.especiePlantaAleatoria());

		}
		while (segundo.size() != CANTIDAD_ESPECIES_PLANTAS) {

			segundo.add(Utilidades.especiePlantaAleatoria());

		}

		// Unión de los dos conjuntos

		
		
		try {
			tercero.addAll(primero);
			
		} catch (UnsupportedOperationException ex1) {
			
			System.out.println(ex1.getMessage());
			
		} catch (ClassCastException ex2) {
			System.out.println(ex2.getMessage());
		
		} catch (NullPointerException ex3) {
			System.out.println(ex3.getMessage());
			
		}catch (IllegalArgumentException ex4) {
			System.out.println(ex4.getMessage());
			
		}catch (IllegalStateException ex5) {
			System.out.println(ex5.getMessage());
		}
		
		try {
			tercero.addAll(segundo);
			
		} catch (UnsupportedOperationException ex1) {
			
			System.out.println(ex1.getMessage());
			
		} catch (ClassCastException ex2) {
			System.out.println(ex2.getMessage());
		
		} catch (NullPointerException ex3) {
			System.out.println(ex3.getMessage());
			
		}catch (IllegalArgumentException ex4) {
			System.out.println(ex4.getMessage());
			
		}catch (IllegalStateException ex5) {
			System.out.println(ex5.getMessage());
		}
		

		// Intersección de los conjuntos

		
		
		try {
			
			cuarto.addAll(primero);
			
		} catch (UnsupportedOperationException ex1) {
			
			System.out.println(ex1.getMessage());
			
		} catch (ClassCastException ex2) {
			System.out.println(ex2.getMessage());
		
		} catch (NullPointerException ex3) {
			System.out.println(ex3.getMessage());
			
		}catch (IllegalArgumentException ex4) {
			System.out.println(ex4.getMessage());
			
		}catch (IllegalStateException ex5) {
			System.out.println(ex5.getMessage());
		}
		
		

		try {
			cuarto.retainAll(segundo);
		}

		catch (UnsupportedOperationException ex21) {
			System.out.println(ex21.getMessage());

		} catch (ClassCastException ex22) {
			System.out.println(ex22.getMessage());
		} catch (NullPointerException ex23) {
			System.out.println(ex23.getMessage());
		}

		// Diferencia de los conjuntos

		try {
			
			quinto.addAll(segundo);
			
		} catch (UnsupportedOperationException ex1) {
			
			System.out.println(ex1.getMessage());
			
		} catch (ClassCastException ex2) {
			System.out.println(ex2.getMessage());
		
		} catch (NullPointerException ex3) {
			System.out.println(ex3.getMessage());
			
		}catch (IllegalArgumentException ex4) {
			System.out.println(ex4.getMessage());
			
		}catch (IllegalStateException ex5) {
			System.out.println(ex5.getMessage());
		}
		
		
		try {
			
			quinto.removeAll(primero);
			
		} catch (UnsupportedOperationException ex1) {
			
			System.out.println(ex1.getMessage());
			
		} catch (ClassCastException ex2) {
			System.out.println(ex2.getMessage());
		
		} catch (NullPointerException ex3) {
			System.out.println(ex3.getMessage());
			
		}
		
		
		

		// ----------------------------------------------
		// Salida de Resultados
		// ----------------------------------------------

		// Recorremos el conjunto y mostramos su contenido por pantalla

		System.out.println(primero.toString());
		System.out.println(segundo.toString());
		System.out.println(tercero.toString());
		System.out.println(cuarto.toString());
		System.out.println(quinto.toString());

	}
}