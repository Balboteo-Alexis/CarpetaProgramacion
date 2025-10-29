/*
 * Descripción: 
 * Autor: Alexis Balboteo González
 * Fecha: 29/10/2025
 */

package ejercicio2;

import java.util.Scanner;

public class Ejercicio2 {

	public static void main(String[] args) {
		
		int opcion, iva1,iva2,iva3, matricula, descuento;
		double pvp, precioFinal, precioBase1, precioBase2,precioBase3, precioBase;
		precioBase1 = 10;
		precioBase2 = 15;
		precioBase3 = 20;
		
		
		Scanner teclado= new Scanner(System.in);
		
		System.out.println("EJERCICIO 2: GESTIÓN DE UN GIMNASIO  \n-------------------------------------------");
		System.out.println("TIPOS DE MATRICULAS: 1. FITNESS - 2. YOGA - 3. MUSCULACIÓN");
		System.out.println("Precio de la matricula de tipo 1 (FITNESS): 10.0€");
		System.out.println("Precio de la matricula de tipo 2 (YOGA): 15.0€");
		System.out.println("Precio de la matricula de tipo 3 (MUSCULACIÓN): 20.0€");
		
		
		System.out.println("\n--- MENU  DE OPERACIONES ---");
		System.out.println("1. Calcular PVP de cada matricula.");
		System.out.println("2. Aplicar oferta a un tipo de matricula (sin iva).");
		System.out.println("3. Calcular el importe total de matriculas realizadas (sin iva).");
		System.out.println("4. Salir");
		
		System.out.println("Seleccione una opción:");
		opcion = teclado.nextInt();
		
		
		while(opcion != 4) {
			
			
			switch (opcion) {
			case 1:{
				System.out.print ("Ingrese el IVA para el tipo de matricula 1 (4 - 10 - 21): ");
				iva1 = teclado.nextInt();
				System.out.print("Ingrese el IVA para el tipo de matricula 2 (4 - 10 - 21): ");
				iva2 = teclado.nextInt();
				System.out.print ("Ingrese el IVA para el tipo de matricula 3 (4 - 10 - 21): ");
				iva3 = teclado.nextInt();
				
				pvp = 10 + (10*iva1/100.0);
				System.out.print("\nEl PVP de la activida de Fitness es: "+ pvp );
				
				pvp = 15 + (15*iva2/100.0);
				System.out.print("\nEl PVP de la activida de Fitness es: "+ pvp );
				
				pvp = 20 + (20*iva3/100.0);
				System.out.print("\nEl PVP de la activida de Fitness es: "+ pvp );
				
				
				break;
			}
			case 2:{
				
				System.out.println("Seleccione tipo de matricula (1. Fitness, 2. Yoga, 3. Musculación): ");
				matricula = teclado.nextInt();
				System.out.println("Ingrese el descuento a aplicar: ");
				descuento=teclado.nextInt();
				

				
	
				 
				System.out.println("El precio final (sin iva) con descuento para el tipo de matricula "+ matricula+ " es de: " );
				
				
				
				
				
				
				break;
			}
			case 3:{
				System.out.println ("dos");
				break;
			}
			default:{
				System.out.println ("Error de selección;");
			}
			}
			
			System.out.println("\n\nSeleccione una opción:");
			opcion = teclado.nextInt();
			
		}
		
		
		

	}

}
