package hashSet;

import java.util.HashSet;
import java.util.Scanner;

public class primero {

	public static void main(String[] args) {

		int num = (int) (Math.random() * 50)+20 ;

		HashSet<Integer> conjunto = new HashSet<Integer>(num);

		for (int i = 0; i < num; i++) {

			int valor = (int) (Math.random() * 100);

			if (!conjunto.add(Integer.valueOf(valor))) {

				System.out.println("numero: " + valor + " no se ha introducido por duplicado");

			}

		}
		
		
		
		System.out.println("\nNuestro conjunto tiene tamaño: "+ conjunto.size());
		
		
		System.out.println(conjunto.toString());
		
		System.out.println("\ndime un numero del 1 al 100");
		Scanner teclado = new Scanner(System.in);
		
		num = teclado.nextInt();
		
		
		System.out.println(conjunto.contains(num));


		System.out.println("Dime otro numerin: ");
		num = teclado.nextInt();
		
		if(conjunto.remove(Integer.valueOf(num))) {
			System.out.println("Borrado con exito");
			System.out.println(conjunto.size());
			System.out.println(conjunto.toString());
			
		}
		else {
			System.out.println("No está , no se borro nada.");
		}
		
		
		
		HashSet<Integer> conjunto2 = new HashSet<Integer>(10);
		
		
		for (int i = 0; i < 10; i++) {

			int valor = (int) (Math.random() * 100);
			conjunto2.add(valor);
			

		}
		
		
		System.out.println(conjunto.toString());
		System.out.println(conjunto.size());
		System.out.println(conjunto2.toString());
		System.out.println(conjunto2.size());
		
		
		System.out.println("fusion de los dos");
		
		try {
			conjunto.addAll(conjunto2);
			
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

		
		System.out.println(conjunto.size());
		
		
		
		System.out.println("Interseccion");
		
		
		try {
			
			conjunto.retainAll(conjunto2);
			
		} catch (UnsupportedOperationException ex21) {
			System.out.println(ex21.getMessage());
			
		}catch (ClassCastException ex22) {
			System.out.println(ex22.getMessage());
		}catch (NullPointerException ex23) {
			System.out.println(ex23.getMessage());
		}
	
		
		System.out.println(conjunto);
		
		
		
		
		
		

	}

}
