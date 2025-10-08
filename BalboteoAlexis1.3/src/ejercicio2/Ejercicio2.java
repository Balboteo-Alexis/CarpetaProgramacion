/*
 * Descripción: Vamos a hacer un programa que transforme euros en pesetas y viceversa.
 * Autor: Alexis Balboteo González
 * Fecha: 1/10/2025
 * 
 */


package ejercicio2;
import java.util.Scanner;
public class Ejercicio2 
{
	public static void main(String[] args) 
	{
		
		Scanner teclado = new Scanner(System.in);
		
		double euros1,euros2, pesetas1, pesetas2;
		
		System.out.print("Este programa convierte euros en pesetas, por favor indique una cantidad de euros y lo convertiremos en pesetas.\nEuros: ");
		euros1 = teclado.nextDouble();
		pesetas1 = euros1 * 166.386;
		System.out.print("La cantidad de euros indicada son: "+pesetas1+" pesetas.");
		System.out.print("\n\nAhora agamoslo al reves, indica el numero de pesetas que desee: ");
		pesetas2 = teclado.nextDouble();
		euros2 = pesetas2/166.386;
		System.out.print("La cantidad de pesetas indicada son: "+euros2+" euros.");

		
		teclado.close();
	
	}
}
