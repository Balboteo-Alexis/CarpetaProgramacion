package ejercicio6;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner teclado = new Scanner(System.in);

		ArrayList<Alumnos> alumnado = new ArrayList<Alumnos>();

		// 1 incorporar un nuevo alumno

		System.out.println("Agregamos un nuevo alumno:");
		System.out.println("nombre");
		String nombre = teclado.nextLine();

		System.out.println("apellidos");
		String apellidos = teclado.nextLine();

		System.out.println("direccion");
		String direccion = teclado.nextLine();

		System.out.println("telefono");
		String telefono = teclado.nextLine();

		System.out.println("codigoCiclo");
		int codigoCiclo = teclado.nextInt();

		System.out.println("cursosAprobados");
		int cursosAprobados = teclado.nextInt();

		teclado.nextLine();
		System.out.println("fechaIngreso (YYYY-MM-DD)");
		String fecha = teclado.nextLine();

		LocalDate fechaIngreso = LocalDate.parse(fecha, DateTimeFormatter.ISO_LOCAL_DATE);

		if (alumnado
				.add(new Alumnos(nombre, apellidos, direccion, telefono, codigoCiclo, cursosAprobados, fechaIngreso))) {

			System.out.println("Se ha añadido el alumno");

		} else {
			System.out.println("No se pudo añadir");
		}

		// 2 Mostrar en pantalla la información sobre un alumno a partir de su código de
		// alumno solicitado
		// al usuario.

		System.out.println("Dime un codigo de alumno y te dare su info:");

		int codigo = teclado.nextInt();

		System.out.println(alumnado.get(codigo - 1).toString());

		// 3 Dar de baja a un alumno a partir de su nombre y apellidos solicitados al
		// usuario. d. Modificar la
		// dirección y/o teléfono de un alumno, dado su código de alumno.

		System.out.println("Daremos a un usuario de baja:");
		teclado.nextLine();
		System.out.println("Nombre:");
		String nombre3 = teclado.nextLine();

		System.out.println("Apellidos:");
		String apellidos3 = teclado.nextLine();

		if (darBaja(alumnado, nombre3, apellidos3)) {

			System.out.println("Borrado con exito");

		}else {
			System.out.println("No se pudo borrar el alumno");
		}

		// 4 Modificar la dirección y/o teléfono de un alumno, dado su código de alumno.

		System.out.println("Modificaremos  la direccion y telefono del alumno con id:");

		int id4 = teclado.nextInt();
		teclado.nextLine();
		System.out.println("Telefono:");
		String telefono4 = teclado.nextLine();
		System.out.println("Direccion:");
		String direccion4 = teclado.nextLine();

		modificarDirTel(alumnado, id4, telefono4, direccion4);

		System.out.println(alumnado.get(id4 - 1).toString());

		// 5 Realizar las modificaciones necesarias en los datos de un alumno en caso de
		// que solicite un
		// cambio de Carrera

		System.out.println("Para solicitar un cambio de carrera dime el id del alumno:");

		int id5 = teclado.nextInt();

		System.out.println("A qué carrera vas(codigo nuevo):");

		int cogigoCarrera5 = teclado.nextInt();

		System.out.println("Cantidad de cursos aprobados:");

		int cursosAprobados5 = teclado.nextInt();
		
		cambioCarrera(alumnado, id5, cogigoCarrera5, cursosAprobados5);
		
		System.out.println(alumnado.get(id5 - 1).toString());
		
		

	}

	public static boolean cambioCarrera(ArrayList<Alumnos> lista, int idAlumno, int codigoCarrera,
			int cusrosAprobados) {

		boolean resultado = false;

		for (Alumnos alumnos : lista) {

			if (idAlumno == alumnos.getCodigoAlumno()) {

				alumnos.setCodigoCiclo(codigoCarrera);
				alumnos.setCursosAprobados(cusrosAprobados);
				resultado = true;

			}

		}

		return resultado;
	}

	public static boolean modificarDirTel(ArrayList<Alumnos> lista, int codigo, String telefono, String direccion) {

		boolean resultado = false;

		for (Alumnos alumnos : lista) {

			if (alumnos.getCodigoAlumno() == codigo) {

				alumnos.setDireccion(direccion);
				alumnos.setTelefono(telefono);

				resultado = true;

			}

		}

		return resultado;
	}

	public static boolean darBaja(ArrayList<Alumnos> alumnado, String nombre, String apellidos) {

		boolean resultado = false;

		Iterator<Alumnos> it = alumnado.iterator();

		while (it.hasNext()) {
			Alumnos a = it.next();

			if (a.getNombre().equals(nombre) && a.getApellidos().equals(apellidos)) {
				it.remove();
				resultado = true;
			}
		}

		return resultado;

	}

}
