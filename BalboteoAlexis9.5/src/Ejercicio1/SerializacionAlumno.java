package Ejercicio1;


import java.io.*;

public class SerializacionAlumno {
	
	private FileOutputStream file;
	private ObjectOutputStream output;
	
	
	// Abrir el fichero
	public void abrir() throws IOException {
		file = new FileOutputStream( "Alumnos.ser" );
		output = new ObjectOutputStream(file);
	}
	
	// Cerrar el fichero
	public void cerrar() throws IOException {
		if (output!=null)
			output.close();
	}
	// Escribir en el fichero
	public void escribir (Alumno contacto) throws IOException {
		if (output!=null)
			output.writeObject(contacto);
	}

	
	

}
