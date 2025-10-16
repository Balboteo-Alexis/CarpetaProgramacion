/*
 * Descripcion: Usamos switch para hacer un selector de operaciones
 * Autor: Alexis 
 * Fecha: 14/10/2025
 */

package ejercicio5;

import java.util.Scanner;

public class Ejercicio5 {
	

	public static void main(String[] args) 
	{
	
		double num1, num2, resultado;
		int operacion;
		
		resultado = 0; //Se inicializa en 0 para que si no se hace nminguna operación no quede la variable vacía.
		
		Scanner teclado = new Scanner(System.in);
			
		System.out.print("Introduzca el valor 1: ");
		num1 = teclado.nextDouble();
		System.out.print("Introduzca el valor 2: ");
		num2 = teclado.nextDouble();
		
		System.out.println("\n      OPERACIONES\n-----------------------      \n(1)Suma \n(2)Resta \n(3)Multiplicación \n(4)División \n-----------------------");
		
		System.out.println("Qué operación quieres realizar:(Inserte numero) ");
		operacion = teclado.nextInt();
		
		
		switch (operacion) {
		case 1: {
			resultado = num1 + num2;
			break;
		}
		case 2: {
			resultado = num1 - num2;
			break;
		}
		case 3: {
			resultado = num1 * num2;
			break;
		}
		case 4: {
			resultado = num1 / num2;
			break;
		}
		default:
			System.out.println("Valor de operación no esperado");
			
		}
		
		System.out.println("Resultado: " + resultado);
		
			
		teclado.close();
			
	}

}
