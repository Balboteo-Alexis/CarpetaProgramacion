package ejercicio3;

import java.util.Scanner;

public class Ejercicio3 {

	public static void main(String[] args) {
		
		
		Scanner teclado = new Scanner(System.in);
		
		String nombre, apellido1, apellido2, compuesto;
		
		
		
		System.out.println("introduzca su nombre: ");
		nombre= teclado.nextLine();
		System.out.println("introduzca sua primer apellido: ");
		apellido1 = teclado.nextLine();
		System.out.println("introduzca su segundo apellido: ");
		apellido2 = teclado.nextLine();

		
		compuesto= nombre.substring(0, 3) + apellido1.substring(0, 3) + apellido2.substring(0, 3);
		
		System.out.println(compuesto.toUpperCase());
		
	}

}
