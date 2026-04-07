package pruebas;

import java.util.HashSet;
import java.util.Set;

public class Main {

	public static void main(String[] args) {
		        Set<Alumno> alumnos = new HashSet<>();

		        alumnos.add(new Alumno("12345678A", "Ana", 20));
		        alumnos.add(new Alumno("12345678A", "Ana Cambiada", 21)); // mismo DNI -> duplicado lógico
		        alumnos.add(new Alumno("99999999Z", "Luis", 19));

		        System.out.println(alumnos.size()); // 2
		        System.out.println(alumnos);
	}

}
