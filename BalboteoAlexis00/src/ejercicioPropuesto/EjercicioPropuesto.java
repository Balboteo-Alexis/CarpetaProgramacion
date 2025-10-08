/*
 * Descripcion: ejercicio de clase usando conceptos hasta ahora
 * Autor: Alexis Balboteo
 * Fecha: 07/10/2025
 */

package ejercicioPropuesto;
import java.util.Scanner;
public class EjercicioPropuesto 
{
	public static void main(String[] args) 
	{
		
		int acierto, error;
		double notacuantitativa;
		String notacualitativa;
		
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
			
			notacuantitativa =((double)acierto - (double)error/2)/2;
			
			if(notacuantitativa <5) 
				notacualitativa = "Insuficiente";
			else if(notacuantitativa<6) 
				notacualitativa= "Suficiente";
			else if (notacuantitativa<7)
				notacualitativa = "Bien";
			else if (notacuantitativa<9)
				notacualitativa = "Notable";
			else
				notacualitativa = "Sobresaliente";
			
			
			
			System.out.print("\n\nNotas:\nNota cualitativa: "+notacualitativa);
			System.out.print("\nNota cuantitativa: "+notacuantitativa);
		}
		
		teclado.close();
	}
	
	
	
}
