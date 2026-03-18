package ejercicio2;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Collections;
import java.util.LinkedList;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner teclado = new Scanner(System.in);

		LinkedList<Contacto> agenda = new LinkedList<Contacto>();

		for (int i = 0; i < 30; i++) {

			agenda.add(generarContacto());

		}

		int op = 0;

		do {
			System.out.println("Elige una de las opciones: ");
			System.out.println("1 - Ingresar contacto\n2 - Consultar un nombre y mostrar todos sus datos\n"
					+ "3 - Mostrar todos los datos de los contactos ordenados por nombre.\n"
					+ "4 - Dada una fecha mostrar aquellos contactos que hayan nacido en ese año.\n" + "5 - Salir. ");

			System.out.print("Opcion: ");
			op = teclado.nextInt();

			switch (op) {
			case 1: {

				ingresarContacto(agenda, teclado);

				break;
			}
			case 2: {

				teclado.nextLine();

				System.out.print("Dime el nombre que quieres consultar:");

				String nombre = teclado.nextLine();

				for (Contacto contacto : agenda) {

					if (contacto.getNombre() == nombre) {

						System.out.println(contacto.toString());

					}

				}

				break;
			}
			case 3: {

				Collections.sort(agenda, new Comparador());

				System.out.println(agenda);

				break;
			}
			case 4: {

				teclado.nextLine();
				System.out.print("Dime una fecha(\"dd/MM/yyyy\"):  ");
				
				String fecha = teclado.nextLine();

				DateTimeFormatter formato = DateTimeFormatter.ofPattern("dd/MM/yyyy");
				LocalDate	fechaNac = LocalDate.parse(fecha, formato);
				
				for (Contacto contacto : agenda) {
					
					
					if(contacto.getFechaNac().getYear()== fechaNac.getYear()) {
						
						System.out.println(contacto.toString());
					}
				}
				
				
				break;
			}
			case 5: {
				System.out.println("Adiosss");

				break;
			}
			default:
				System.out.println("Te has equivocado");
			}

		} while (op != 5);

		teclado.close();

	}

	public static boolean ingresarContacto(LinkedList<Contacto> agenda, Scanner teclado) {

		String telefono, nombre, email, fecha;
		LocalDate fechaNac;
		teclado.nextLine();
		System.out.println("Telefono:");
		telefono = teclado.nextLine();
		System.out.println("Nomobre:");
		nombre = teclado.nextLine();
		System.out.println("Email:");
		email = teclado.nextLine();
		System.out.println("Fecha de nacimiento(dd/MM/yyyy):");
		fecha = teclado.nextLine();

		DateTimeFormatter formato = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		fechaNac = LocalDate.parse(fecha, formato);

		return agenda.add(new Contacto(telefono, nombre, email, fechaNac));
	}

	public static Contacto generarContacto() {

		String[] nombres = { "USER", "pepe", "jose", "manolo", "fede", "arnau", "blizcrank", "rana", "loco", "camilo" };
		String[] telefonos = { "647654456", "65465848", "1646848" };
		String[] fechas = { "01/01/2020", "14/02/2021", "30/03/2022", "05/04/2023", "19/05/2024", "07/06/2025",
				"18/07/2026", "09/08/2027", "22/09/2028", "31/12/2029" };

		String nombre = nombres[(int) (Math.random() * 10)];
		String telefono = telefonos[(int) (Math.random() * 3)];
		String fechanac = fechas[(int) (Math.random() * 10)];

		DateTimeFormatter formato = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		LocalDate fechaNacimiento = LocalDate.parse(fechanac, formato);

		Contacto uno = new Contacto(telefono, nombre, nombre + "@gmail", fechaNacimiento);

		return uno;

	}

}
