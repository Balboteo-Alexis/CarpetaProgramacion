package ejercicio2;

import java.util.Comparator;

import ejercicio1.Alumno;

public class Comparador implements Comparator<Alumno> {

	@Override
	public int compare(Alumno o1, Alumno o2) {
		
		int result = o1.getCurso().compareTo(o2.getCurso());
		
		if(result == 0) {
			
			result = o1.getNombre().compareTo(o2.getNombre());
		}
		
		return result;
	}
	
	

	
}

