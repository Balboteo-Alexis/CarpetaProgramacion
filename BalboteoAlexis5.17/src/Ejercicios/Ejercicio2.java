package Ejercicios;

import java.time.DateTimeException;
import java.time.LocalDate;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Ejercicio2 {

	public static void main(String[] args) {

		Scanner teclado = new Scanner(System.in);

		System.out.println("DIA DE CUMPLEAÑOS\n-----------------\n");

		int ano;

		do {

			try {

				System.out.println("Introduzca el año de su nacimiento(1900-2025):");
				ano = teclado.nextInt();

			} catch (InputMismatchException ex1) {

				teclado.nextLine();
				ano = 0;
			}

		} while (ano < 1900 || ano > 2025);

		int mes;

		do {

			try {

				System.out.println("Introduzca el mes de su nacimiento en numero:");
				mes = teclado.nextInt();

			} catch (InputMismatchException ex2) {

				teclado.nextLine();
				mes = 30;
			}

		} while (mes < 1 || mes > 12);

		int dia;

		boolean error = true;

		do {

			try {

				System.out.println("Introduzca el dia de su nacimiento:");
				dia = teclado.nextInt();

				if (dia > 1 && dia <= LocalDate.of(ano, mes, 1).lengthOfMonth()) {

					error = false;
				}

			} catch (InputMismatchException ex3) {

				teclado.nextLine();
				dia = 0;
			}

		} while (error != false);

		String diaNacimiento;
		
		try {
			diaNacimiento = LocalDate.of(ano, mes, dia).getDayOfWeek().toString();
		} catch (DateTimeException ex1) {
			System.out.println(ex1.getMessage());
			 diaNacimiento =" ";
		}
		
		
		LocalDate fechaNac;
		try {
			fechaNac= LocalDate.of(ano, mes, dia);
		} catch (DateTimeException ex1) {
			System.out.println(ex1.getMessage());
			fechaNac = LocalDate.now();
		}
		


		System.out.printf("El dia de la semana que naciste fue el: %s%n%n", diaNacimiento);

		System.out.printf("----------------------%nCuantas veces tu cumpleaños ha caido en %s:%n", diaNacimiento);

		int contCoincidencias = 0;
		ano++;
		while (ano <= 2025) {
			
			if(fechaNac.isLeapYear()) {
				
				if (ano % 4 == 0) {

					if (diaNacimiento.equals(LocalDate.of(ano, mes, dia).getDayOfWeek().toString())) {

						System.out.println(LocalDate.of(ano, mes, dia).toString());
						contCoincidencias++;
					}			
				}
			}else if (diaNacimiento.equals(LocalDate.of(ano, mes, dia).getDayOfWeek().toString())) {
			
					System.out.println(LocalDate.of(ano, mes, dia).toString());
					contCoincidencias++;
			}

			ano++;

		}
		System.out.printf("Número total de coincidencias: %d", contCoincidencias);
		
		

		
		teclado.close();
	}
}
