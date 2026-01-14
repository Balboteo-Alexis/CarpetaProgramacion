package a2;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);

		
		Persona alumno1 = new Persona("Alexis", "Balboteo",(byte) 12);
		Persona alumno2 = new Persona("Alexis", "Balboteo",(byte) 12);
		
//		
//		System.out.println("Persona1: \nnombre: ");
//		alumno1.nombre = teclado.nextLine();
//		System.out.println("apellido: ");
//		alumno1.apellidos = teclado.nextLine();
//		System.out.println("DNI: ");
//		alumno1.dni = teclado.nextLine();
//		System.out.println("Edad: ");
//		alumno1.edad = teclado.nextByte();
//		
//		
//		teclado.nextLine();
//		System.out.println("Persona2: \nnombre: ");
//		alumno2.nombre = teclado.nextLine();
//		System.out.println("apellido: ");
//		alumno2.apellidos = teclado.nextLine();
//		System.out.println("DNI: ");
//		alumno2.dni = teclado.nextLine();
//		System.out.println("Edad: ");
//		alumno2.edad = teclado.nextByte();
		
		
		System.out.printf("La primera persona con nombre: %s %s cuyo DNI es: %s,%n¿Es mayor de edad? %b", alumno1.nombre,alumno1.apellidos,alumno1.dni, mayorEdad(alumno1.edad));
		
		
		
		
	}
	
	public static boolean mayorEdad(int edad) {
		
		boolean mayor =false;
		
		if (edad>18) {
			mayor=true;
		}
		
		return mayor;
	}
	
	

}
