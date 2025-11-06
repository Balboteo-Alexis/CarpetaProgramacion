package metodos;

import java.util.Scanner;

public class Metodos {

	public static void main(String[] args) {

//		
//		int num;
//		
//		System.out.println("Dame el factorial de: ");
//		num=teclado.nextInt();
//		
//		System.out.println("su factorial es: "+ factorial(num) );

		double a, b;
		String operacion;
		char op;

		Scanner teclado = new Scanner(System.in);

		System.out.println("Hagamos operaciones");
		System.out.println("Primer numero:");
		a = teclado.nextDouble();

		System.out.println("Segundo numero:");
		b = teclado.nextDouble();

		teclado.nextLine();

		System.out.println("Operación ( + - / * % ): ");
		operacion = teclado.nextLine();
		op = operacion.charAt(0);

		System.out.println("\nEl resultado es: " + operaciones(a, b, op));

	}

//	factorial es un metodo que dada una entrada te da su factorial

	public static long factorial(int num) {

		long factorial = 1;

		while (num > 0) {

			factorial = num * factorial;
			num--;
		}

		return factorial;
	}

//	operaciones es un metodo que realiza operaciones

	public static double operaciones(double a, double b, char op) {

		double result;

		switch (op) {
		case '+': {

			result = a + b;
			break;
		}
		case '-': {

			result = a - b;
			break;
		}
		case '*': {

			result = a * b;
			break;
		}
		case '/': {

			result = a / b;
			break;
		}

		default: {
			result = a % b;
		}
		}
		return result;

	}
}
