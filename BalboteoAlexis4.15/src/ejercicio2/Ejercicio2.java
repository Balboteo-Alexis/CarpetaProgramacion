package ejercicio2;

import java.util.Scanner;

public class Ejercicio2 {

	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		String nombre;
		double precio;
		int cantidad, descuento;
		
		System.out.println("que articulo se lleva? ");
		nombre=teclado.nextLine();
		
		System.out.print("Qué precio tiene la unidad de ese articulo: ");
		precio = teclado.nextDouble();
		
		System.out.print("Cuantas unidades llevas: ");
		cantidad=teclado.nextInt();
		
		System.out.print("De cuanto es el descuento: ");
		descuento = teclado.nextInt();
		System.out.println(productosDescuento(precio, cantidad, descuento));
		
		System.out.printf("\n\nUsted ha adquirido %d de productos %s, a un precio de %.2f euros la unidad.\n\n"
				+ "El precio a pagar es %.2f, pero al aplicarle el descuento del %d %% el "
				+ "precio final a pagar es: %.2f.", cantidad, nombre, precio, (precio*cantidad),descuento, productosDescuento(precio, cantidad, descuento));
		
		
		

	}
	
	public static double productosDescuento(double precio, int cantidad, int descuento) {
		
		double total;
		
		total = (cantidad*precio) *((100.0-descuento)/100);
		
		
		return total;
	}
	

}
