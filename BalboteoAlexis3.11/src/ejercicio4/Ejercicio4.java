package ejercicio4;

import java.util.Scanner;

public class Ejercicio4 {

	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		
		int[][] notas = { {2,3,4,5,6},{2,3,4,5,6},{2,3,4,5,6},{2,3,4,5,6} };
		
		String[] nombre = {"Alumno 1","Alumno 2","Alumno 3","Alumno 4"};
		
		
		for (int i = 0; i < 4; i++) {

			for (int j = 0; j < 5; j++) {

				System.out.print(notas[i][j]);

			}
			System.out.println();
		}
		
		
		for (int j = 0; j < 4; j++) {

			System.out.print(nombre[j] + " \n");

		}
		

		
		
		
	}
}
