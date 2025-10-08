/*
 * Descripción: En este ejercicio aprendemos a crear tipos enumerados.
 * Autor:Alexis Balboteo
 * Fecha: 26/09/2025
 */

package ejercicio4;

public class Ejercicio4
{

	public enum Tamanos{PEQUEÑA, MEDIANA, GRANDE, EXTRAGRANDE}
	
	public static void main(String[] args) 
	{
		
		Tamanos peque = Tamanos.PEQUEÑA;
		Tamanos med = Tamanos.MEDIANA;
		Tamanos grand = Tamanos.GRANDE;
		Tamanos xxl = Tamanos.EXTRAGRANDE;
		
		
		System.out.print("He creado un tipo enumerado al que le he llamado \"Tamanos\".\nDentro de este grupo están: "+peque+", "+med+", "+grand+" y "+xxl+ ".");

	}

}
