/* Descripción: Es un programa que gestiona alumnos, recibiendo notas y dando medias y numero total de estudiantes registrados
 * Autor: Alexis Balboteo González
 * Fecha: 26/11/2025
 */

package ejercicio1;

import java.util.Scanner;

public class Ejercicio1 {

	public static void main(String[] args) {

		Scanner teclado = new Scanner(System.in);

		int contEstudiantes = 0;
		double nota, sumaNotas, media;
		String nombre;

		System.out.print("Vamos a ralizar la gestión de notas de unos estudiantes.\n\n");
		System.out.println("Ingresa el nombre y luego las notas de cada estudiante.\nEn el "
				+ "momento que quiera detener la secuencia en lugar del nombre escriba la palabra fin.");

		System.out.println("Nombre del alumno: ");
		nombre = teclado.nextLine();

		while (!nombre.equals("fin")) {

			contEstudiantes++;

			System.out.printf("Que notas ha sacado %s: ", nombre);

			System.out.print("Nota 1º evaluación: ");
			nota = teclado.nextDouble();
			while (nota < 0.0 || nota > 10.0) {
				System.out.println("Error al introducir la nota.");
				System.out.print("Nota 1º evaluación: ");
				nota = teclado.nextDouble();
			}
			sumaNotas = nota;

			System.out.print("Nota 2º evaluación: ");
			nota = teclado.nextDouble();
			while (nota < 0.0 || nota > 10.0) {
				System.out.println("Error al introducir la nota.");
				System.out.print("Nota 2º evaluación: ");
				nota = teclado.nextDouble();
			}
			sumaNotas = sumaNotas + nota;

			System.out.print("Nota 3º evaluación: ");
			nota = teclado.nextDouble();
			while (nota < 0.0 || nota > 10.0) {
				System.out.println("Error al introducir la nota.");
				System.out.print("Nota 3º evaluación: ");
				nota = teclado.nextDouble();
			}
			sumaNotas = sumaNotas + nota;

			System.out.print("Nota 4º evaluación: ");
			nota = teclado.nextDouble();
			while (nota < 0.0 || nota > 10.0) {
				System.out.println("Error al introducir la nota.");
				System.out.print("Nota 4º evaluación: ");
				nota = teclado.nextDouble();
			}
			sumaNotas = sumaNotas + nota;

			media = sumaNotas / 4.0;

			System.out.println("\n");
			System.out.printf("Nombre del estudiante: %s \n", nombre);
			System.out.printf("Media aritmetica: %.1f \n", media);

			if (media > 5) {
				System.out.println("Estado: Aprobado");
			} else {
				System.out.println("Estado: Suspenso");
			}

			System.out.println("--------------------------------------------\n");
			System.out.println("Digame el nombre del siguiente estudainte(fin para detener el programa):");

			teclado.nextLine();
			nombre = teclado.nextLine();
		}

		System.out.println("\nFinalmente se han registrado un total de: " + contEstudiantes + " estudiantes.");

	}

}
