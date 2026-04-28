package ejercicioA2;

import java.io.File;
import java.util.Comparator;

public class comparadorFiles implements Comparator<File> {

	@Override
	public int compare(File o1, File o2) {
		// TODO Auto-generated method stub
		return o1.toString().compareTo(o2.toString());
	}

}
