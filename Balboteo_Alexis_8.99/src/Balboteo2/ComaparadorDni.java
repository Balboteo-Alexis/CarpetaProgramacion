/*
 * Descripción: Comparador de DNI de la clase empleados
 *  Autor: Alexis Balboteo González
 * Fecha: 15/04/2026
 */


package Balboteo2;

import java.util.Comparator;

public class ComaparadorDni implements Comparator<Empleado>{

	@Override
	public int compare(Empleado e1, Empleado e2) {

		return e1.getDni().compareTo(e2.getDni());
		
	}

}
