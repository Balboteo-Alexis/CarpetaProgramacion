package ejercicio5;

import java.util.Scanner;

public class Ejercicio5 {

	public static void main(String[] args) {
		
		Scanner teclado =new Scanner(System.in);
		
		int personas, contHombre, contMujer;
		double sueldoMujer,sueldoMediaMujer, sueldoHombre,sueldoMediaHombre;
		
		
		System.out.print("Digame cuantas personas hay en la empresa: ");
		personas = teclado.nextInt();
		System.out.println();
		int[][] tabla = new int[personas][2];
		
	
		
		for( int i =0 ; i<personas ; i++ ) {
			
			System.out.print("Digame el sexo de la persona " + (i+1)+" ( 0 = Mujer, 1 = Hombre): ");
			tabla[i][0] = teclado.nextInt();
			
			System.out.print("Digame el sueldo de la persona " + (i+1) + ": ");
			tabla[i][1] = teclado.nextInt();
			System.out.println();
					
		
		}
		
		
		contHombre = contMujer = 0;
		sueldoMujer = sueldoHombre = 0;
		
		
		
		for( int i =0 ; i<personas ; i++ ) {
			
			if(tabla[i][0] == 0) {
				
				sueldoMujer = sueldoMujer + tabla[i][1] ;
				contMujer++;
			}
			else {
				sueldoHombre = sueldoHombre + tabla[i][1] ;
				contHombre++;
			}
		}
		
		sueldoMediaMujer = sueldoMujer/contMujer;
		sueldoMediaHombre = sueldoHombre/ contHombre;
		
		
		System.out.println("Para las mujeres el sueldo medio es de: "+ sueldoMediaMujer);
		System.out.println("Para los hombres el sueldo medio es de: "+ sueldoMediaHombre);
		
	}

}
