package ejercicio1;

import java.util.Comparator;

public class Comparador implements Comparator<Atleta> {

	@Override
	public int compare(Atleta a1, Atleta a2) {
		
		int result;
		
		
		if(a1.getEdad()>a2.getEdad()) {
			result = 1;
		}else if(a1.getEdad()<a2.getEdad()){
			
			result = -1;
		}else {
			result = 0;
		}
		
		
		return result ;
	}

	
	
	
}
