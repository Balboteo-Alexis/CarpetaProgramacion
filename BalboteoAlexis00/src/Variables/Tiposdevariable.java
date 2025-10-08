/*
 * Descripción: ejemplos de variables
 * Autor: Alexis Balboteo González 
 * Fecha: 19/09/2025
 */

package Variables;

public class Tiposdevariable {

	public static void main(String[] args) {
		byte edadAlumno ;
		edadAlumno = 0;
		byte edadProfesor = 0 ;
		double alturaAlumno = 1.88, pesoAlumno = 92.5;
		char letraDni = 'B';
		String nombreAlumno = "Alberto";
		boolean mayorEdad = false;
		if(edadAlumno >= 18)
			mayorEdad = true;
		
		System.out.println("El alumno es mayor de edad: "+ mayorEdad);
		
		System.out.println("Valor de la variable alumno:" + edadAlumno);
		System.out.print("Peso:"+ pesoAlumno +"\nAltura:"+ alturaAlumno);
		
	}

}
