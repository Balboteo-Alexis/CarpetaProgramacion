/*
 * Descripcion: Usamos ifelse anidados
 * Autor: Alexis 
 * Fecha: 9/10/2025
 */

package ejercicio2;

import java.util.Scanner;

public class Ejercicio2 {

	public static void main(String[] args) 
	{
		
		Scanner teclado = new Scanner(System.in);
		
		
		String name, surname;
		int age, salary, experience, proyects;
		
		
		System.out.print("Cual es su nombre: ");
		name = teclado.nextLine();
		System.out.print("Cual es su apellidos: ");
		surname = teclado.nextLine();
		System.out.print("Cual es su edad: ");
		age = teclado.nextInt();
		System.out.print("Cual es el salario deseado: ");
		salary = teclado.nextInt();
		
		if(salary > 30000 || age>45)
		{
			System.out.print("\nLo sentimos pero no cumple nuestro perfil");
		}
		else
		{
			
			System.out.print("Cuantos años de experiencia tiene: ");
			experience = teclado.nextInt();
			System.out.print("Cuantos proyectos has realizado: ");
			proyects = teclado.nextInt();
			
			if(experience > 2 &&  proyects >3)
			{
				
				System.out.println("\nEnhorabuena. Ha sido contratado.");
				
				if(experience > 5 || proyects > 5)
				{
					
					System.out.println("\nSe le asignará como salario anual: 30.000 euros.");
				}
				else
				{
					System.out.println("\nSe le asignará como salario anual: 25.000 euros.");
				}
			}
			else
			{
				System.out.print("\nLo sentimos pero no cumple nuestro perfil");
			}
			
		}
		
		
		
		teclado.close();
		
	}

}
