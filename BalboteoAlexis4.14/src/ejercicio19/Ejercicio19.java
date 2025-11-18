package ejercicio19;

import java.util.Scanner;

public class Ejercicio19 {

	public static void main(String[] args) {

		Scanner teclado = new Scanner(System.in);

		int x, y, z;

		System.out.println("Comprobemos pitagoras, digame el valor de la X: ");
		x = teclado.nextInt();
		System.out.println("El valor de la Y:");
		y = teclado.nextInt();
		System.out.println("El valor de la Z:");
		z = teclado.nextInt();

		
		
		if(pitagoras(x, y, z) ==true) {
			System.out.println("Con los valores que me has dado podemos decir que si cumple el teorema");
		}else {
			System.out.println("Con los valores que me has dado podemos decir que no cumple el teorema");
		}
		
	}

	public static boolean pitagoras(int x, int y, int z) {

		boolean cumple;

		if ((x * x) + (y * y) == z * z) {
			cumple = true;
		} else {
			cumple = false;
		}

		return cumple;

	}

}
