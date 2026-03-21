package ejercicio5;

import java.util.Comparator;


public class Comparador implements Comparator<Ciudadano>  {

	@Override
	public int compare(Ciudadano c1, Ciudadano c2) {
		
		return c1.getNombre().compareTo(c2.getNombre());
		
		
	}

}
