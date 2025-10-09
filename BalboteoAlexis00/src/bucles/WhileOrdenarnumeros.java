/*
 * Descripcion: Programa usando While en un if para ordenar numeros
 * Autor: Alexis 
 * Fecha: 9/10/2025
 */

package bucles;

import java.util.Scanner;

public class WhileOrdenarnumeros {

	public static void main(String[] args) 
	{
		int contador, fin, inicio;
		
		Scanner teclado = new Scanner(System.in);
		
		System.out.print("Introduzca el inicio: ");
		inicio = teclado.nextInt();
		System.out.print("Introduzca el final: ");
		fin = teclado.nextInt();
		contador = inicio;
		System.out.print("\nSecuencia de numeros desde el "+inicio+" hasta "+fin + "\n\n");
		
		if(contador<fin)
		{
			while(contador != fin +1) // el +1 es un ajuste para que pare en el valor final y no en uno anterior
			{
				System.out.print(contador+ " ");
				contador = contador +1;
			}
		}
		else
		{
			while(contador != fin-1) // el -1 es un ajuste para que pare en el valor final y no en uno anterior
			{
				System.out.print(contador+ " ");
				contador = contador -1;
			}
		}
		
		teclado.close();
		
	}

}
