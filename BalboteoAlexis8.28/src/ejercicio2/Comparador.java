package ejercicio2;

import java.util.Comparator;

public class Comparador implements Comparator<Contacto> {

	@Override
	public int compare(Contacto c1, Contacto c2) {

		return c1.getNombre().compareTo(c2.getNombre());

	}

}
