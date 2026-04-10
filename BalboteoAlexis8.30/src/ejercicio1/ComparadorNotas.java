package ejercicio1;

import java.util.Comparator;

public class ComparadorNotas implements Comparator<Alumno>{

	@Override
	public int compare(Alumno o1, Alumno o2) {

		int result;
		
		if(o1.getMates() > o2.getMates()) {
			
			result = -1;
			
		}else if(o1.getMates() < o2.getMates()) {
			
			
			result = 1;
		}else {
			
			result = o1.getNombre().compareTo(o2.getNombre());
			
		}
		
		
		
		return result;
	}

	
	
	
}
