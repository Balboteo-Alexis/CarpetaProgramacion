package Ejercicio1;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

public class Principal {

	public static void main(String[] args) {

		ArrayList<Alumno> alumnos10 = new ArrayList<Alumno>();

		for (int i = 0; i < 10; i++) {

			Alumno nuevo = new Alumno("1dww2", "faasfsaf", 0, 3, 0, 0, 0);
			alumnos10.add(nuevo);
			nuevo = new Alumno("a12", "faasfsaf", 0, 3, 0, 0, 1);
			alumnos10.add(nuevo);
			nuevo = new Alumno("avvvv2", "faafsafwwww", 2, 3, 0, 0, 0);
			alumnos10.add(nuevo);

		}

		System.out.println(alumnos10.size());
		
		
		try {
			
			
			ObjectOutputStream salida = new ObjectOutputStream (new FileOutputStream("Alumnos.obj"));

			salida.writeObject("Datos de los alumnos\n");
			
			for (Alumno alumno : alumnos10) {
				
				salida.writeObject(alumno);
				
			}
			
			salida.close();
			
			
			
			DeserializacionAlumno  entrada = new DeserializacionAlumno();
			
			entrada.abrir();
			
			Alumno recuperado = entrada.leer();
			entrada.cerrar();
			
			System.out.println(recuperado.toString());
			
			
		} catch (Exception e) {
			// TODO: handle exception
		}
		
		

	}

}
