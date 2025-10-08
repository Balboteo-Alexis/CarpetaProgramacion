/*
 * Descripción: Usamos la clase math
 * Autor: Alexis Balboteo
 * Fecha:3/10/2025
 */
package ejercicio5;
import java.util.Scanner;
public class Ejercicio5 {
	public static void main(String[] args) 
	{
		
		Scanner teclado = new Scanner(System.in);
		System.out.print("dame el numero1: ");
		double  num1, num2;
		
		num1 = teclado.nextDouble();
		System.out.print("dame el numero2: ");
		num2 = teclado.nextDouble();
		
		System.out.println("Qué número es menor? \nEs el : "+Math.min(num1, num2));
		System.out.println("El valor del primer número elevado al segundo es: "+Math.pow(num1, num2));
		System.out.println("La raíz cuadrada del primer número es: "+Math.sqrt(num1));
		System.out.print("Un valor random del segundo número es: "+Math.random()*num2);
		
		
		teclado.close();
		
	}
}
