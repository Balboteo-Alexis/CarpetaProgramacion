package Ejercicio1;

import java.io.*;

public class DeserializacionAlumno {

	private FileInputStream file;
	private ObjectInputStream input;

	public void abrir() throws IOException {
		file = new FileInputStream("Alumnos.obj");
		input = new ObjectInputStream(file);
	}

	public void cerrar() throws IOException {
		if (input != null)
			input.close();
	}

	public Alumno leer() throws IOException, ClassNotFoundException {
		Alumno Alumno = null;
		if (input != null) {
			try {
				Alumno = (Alumno) input.readObject();
			} catch (EOFException eof) {// Fin del fichero }
			}
			
		}
		
		return Alumno;

	}

}
