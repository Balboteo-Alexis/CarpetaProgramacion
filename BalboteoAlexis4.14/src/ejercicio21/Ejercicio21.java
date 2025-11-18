package ejercicio21;

import java.util.Scanner;

public class Ejercicio21 {

	public static void main(String[] args) {

		Scanner teclado = new Scanner(System.in);

		double radio;

		int op = menu(teclado);
		
		while(op!=0) {
			

			if (op == 1) {

				radio = pideRadio(teclado);
				System.out.println("El resultado de la circunferencia es de: " + circunferencia(radio));

			} else if( op == 2) {

				radio = pideRadio(teclado);
				System.out.println("El resultado del área es de: " + area(radio));

			}else if(op==3){
				
				radio = pideRadio(teclado);
				System.out.println("El resultado del volumen es de: " + volumen(radio));
				
			}else {
				radio = pideRadio(teclado);
				System.out.println("El resultado de la circunferencia es de: " + circunferencia(radio));
				System.out.println("El resultado del área es de: " + area(radio));
				System.out.println("El resultado del volumen es de: " + volumen(radio));
				
			}
			System.out.println("\n");
			op = menu(teclado);
		}
		
	}

	public static int menu(Scanner entrada) {

		int opcion;

		System.out.print("Menu:\nOpción 0: Salir \nOpción 1: Circunferencia \nOpción 2: Área\nOpción 3: Volumen\n\n");

		System.out.print("Qué opcion eliges: ");
		opcion = entrada.nextInt();

		return opcion;
	}

	public static double pideRadio(Scanner entrada) {
		System.out.println("Dime el radio: ");
		double radio = entrada.nextDouble();

		return radio;
	}

	public static double circunferencia(double r) {

		double perimetro = 2 * Math.PI * r;
		return perimetro;

	}

	public static double area(double r) {

		double total = Math.PI * r * r;

		return total;
	}
	public static double volumen(double r) {
		
		double total = (4/3)*Math.PI*r*r*r;
		
		return total;
	}

}
