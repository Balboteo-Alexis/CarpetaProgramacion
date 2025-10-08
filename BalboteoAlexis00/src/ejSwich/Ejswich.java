/*
 * Descripción: Sustituimos el ifelse a swich
 * Autor:Alexis Balboteo
 * Fecha: 07/10/2025
 * 
 */

package ejSwich;

import java.util.Scanner;

public class Ejswich 
{
	public static void main(String[] args) 
	{
		
		int acierto, error;
		String notacualitativa;
		double notacuantitativa;
		
		Scanner teclado = new Scanner(System.in);
		
		System.out.print("Cuantas preguntas has acertado: ");
		acierto = teclado.nextInt();
		System.out.print("Cuantas preguntas has fallado: ");
		error = teclado.nextInt();
		
		if(acierto+error >20)
		{
			System.out.print("Datos erroneos");
		}
		else
		{
			
			notacuantitativa =(acierto - error/2)/2;
			int nota = (int )Math.round(notacuantitativa);
			
			System.out.print("\nNota cuantitativa: "+notacuantitativa+"\n");	
			
			
			switch (nota) 
			{
				case 0,1,2,3,4:
				{
					System.out.println ("Insuficiente");
					break;
				}
				case 5:
					System.out.println ("Suficiente");
					break;
				case 6:
					System.out.println ("Bien");
					break;
				case 7,8:
					System.out.println ("Notable");
					break;
				case 9,10:
					System.out.println ("Sobresaliente");
					break;
				default:
					System.out.println ("Cero");
					break;
			}
			
			

		}
		
		teclado.close();
	}
}
