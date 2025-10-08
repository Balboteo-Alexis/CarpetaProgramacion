/*
 *  Descripción: Sentencia usando ?, es condicional, es como el if. se usa muy poco porque el if es mejor y más claro.
 * Autor: Alexis Balboteo González 
 * Fecha: 26/09/2025
 */



package operadorCondicionalComparación;
import java.util.Scanner;

public class OperadorCondicional 
{

	public static void main(String[] args) 
	{
		Scanner teclado = new Scanner(System.in);
		
		int dato1, dato2;
		double dato3;
		String resultado;
		
		System.out.print("Dame dato 1: ");
		dato1 = teclado.nextInt();
		
		resultado = (dato1 > 18 ) ? "Mayor" : "Menor";
		System.out.print(resultado);
		
		
		
	}
	
	
	
}
