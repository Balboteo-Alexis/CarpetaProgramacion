package ejercicio7;

import java.util.Comparator;

public class Comparador implements Comparator<Venta> {

	@Override
	public int compare(Venta v1, Venta v2) {

		int result;

		if (v1.getVentaCochesMes() > v2.getVentaCochesMes()) {
			result = 1;
		} else if (v1.getVentaCochesMes() < v2.getVentaCochesMes()) {
			result = -1;
		} else {
			result = 0;
		}

		return result;
	}

}
