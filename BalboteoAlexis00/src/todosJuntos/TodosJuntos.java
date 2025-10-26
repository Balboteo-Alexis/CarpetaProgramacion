/*
 * Descripcion: En este programa estan todos los ejemplos resumidos 
 * Autor: Alexis Balboteo González
 * Fecha: 
 */

package todosJuntos;

import java.util.Scanner; // Clase escaner 

public class TodosJuntos {

	public static void main(String[] args) {

		// Primero variables
		int entero = 7; // enteros
		double decimales = 7.23; // decimales
		boolean SIoNO = true; // true or false
		final int CONSTANTE = 55; // Esto es una constante y tiene que ir mayusculas

		// Clase Scanner IMPORTANTE DECLARAR ARRIBA

		Scanner teclado = new Scanner(System.in);

		entero = teclado.nextInt();

		//////////////////////////////////////////////////////         IF (    )     {         } 

		int edad;

		System.out.print("Digame su edad por favor: ");
		edad = teclado.nextInt();

		if (edad >= 18) {
			System.out.print("Eres amyor de edad");
			int monedero = 100;
		}

		/////////////////////////////////////////////////////////      IF ELSE 

		int num1 = 60;

		if (num1 > 0) {
			System.out.print("\nel numero es positivo");
			if (num1 > 50) {
				System.out.print("\nA demás es mayor que 50");
			}
		} else {
			if (num1 == 0) {
				System.out.print("el numero es 0");
			} else {
				System.out.print("el numero es negtivo");
			}
		}

		////////////////////////////////////////////////               Swich 

		int nota = 7;
		switch (nota) {
		case 0, 1, 2, 3, 4: {
			System.out.println("Insuficiente");
			break;
		}
		case 5:
			System.out.println("Suficiente");
			break;
		case 6:
			System.out.println("Bien");
			break;
		case 7, 8:
			System.out.println("Notable");
			break;
		case 9, 10:
			System.out.println("Sobresaliente");
			break;
		default:
			System.out.println("Cero");
			break;
		}

		////////////////////////////////////////////////////       Array 

		final int TOTAL_NUM = 20;

		int[] numeros = new int[TOTAL_NUM]; // Declarción arrays

		for (int posicion = 0; posicion < TOTAL_NUM; posicion++) {
			numeros[posicion] = (int) (Math.random() * 50);

		}
		for (int posicion = 0; posicion < TOTAL_NUM; posicion++) {
			System.out.println("El valor que hay en la posición: " + posicion + " es: " + numeros[posicion]);

		}

		//////////////////////////////////// array multidimensional

		int[][] temperatura = new int[12][30];

		////////////////////////////////////// Bucle while 

		int num, num1, contador = 0;

		num = teclado.nextInt();
		num1 = num;
		contador = contador + 1;

		while (num != 0 && contador < 8) {

			contador = contador + 1;

			System.out.print("Numero: ");
			num = teclado.nextInt();
			num1 = num1 + num;

		}

		/////////////////////////////////////////  Bucle FOR

		int numero;
		for (int i = 0; i < 10; i++) {

			int vueltas = 0;

			while (vueltas < numero) {

				numeros[i] = numero;
				System.out.print(numeros[i] + " ");
				vueltas++;
			}

			numero++;

		}

		///////////////////////////////////////////    Bucle DO While

		do {

		} while (SIoNO);

		///////////////////////////////  Combinacion  INT y CHAR

		char c;

		c = (char) 69;
		numero = (int) 'A';

		System.out.println(numero);
		System.out.print(c);

		/////////////////////////////      Operadores Basicos

		int dato1 = 5, dato3 = 1;
		double dato2 = 3;

		double suma = dato1 + dato2;
		System.out.println("la suma de dato 1 y dato 2 es: " + suma);

		double mult = dato1 * dato2;
		System.out.println("la multiplicación de dato 1 y dato 2 es: " + mult);

		double div = dato1 / dato2;
		System.out.println("la división de dato 1 y dato 2 es: " + div);

		int resto = dato1 % dato3;
		System.out.println("el resto de la división de dato 1 y dato 2 es: " + resto);

		///////////////////////////////////////   Operaciones en cadenas   STRING 

		int longitud;

		String name;
		System.out.print("Dime tu nombre: ");
		name = teclado.nextLine();
		
		longitud = name.length();// Calcula la longitud
		
		System.out.println("Tú nombre es: " + name + " y su longitud es de : " + longitud);
		
		name = name.trim(); // borra espacios en blanco
		
		longitud = name.length();// Calcula la longitud
		
		System.out.println("Tú nombre es: " + name + " y su longitud es de : " + longitud);

		String nameminusculas;

		nameminusculas = name.toLowerCase(); // todo a minusculas
		
		System.out.print("\n" + nameminusculas);

		System.out.print("\n" + name.toUpperCase()); // todo a mayusculas

	}

}
