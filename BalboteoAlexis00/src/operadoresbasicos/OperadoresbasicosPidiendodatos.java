package operadoresbasicos;

import java.util.Scanner;

public class OperadoresbasicosPidiendodatos 
{

	public static void main(String[] args) 
	{
		
		Scanner teclado = new Scanner(System.in);
		
		int dato1, dato3;
		double dato2;
		System.out.println("Vamos a hacer cuentas, dame el primer dato: ");
		dato1 = teclado.nextInt();
		System.out.println("Vamos a hacer cuentas, dame el Segundo dato: ");
		dato2= teclado.nextDouble();
		System.out.println("Tercer dato: ");						
		dato3 = teclado.nextInt();
		
		double suma= dato1+dato2;
		System.out.println("la suma de dato 1 y dato 2 es: " + suma);
		
		double mult = dato1*dato2;
		System.out.println("la multiplicación de dato 1 y dato 2 es: " + mult);
		
		double div = dato1/dato2;
		System.out.println("la división de dato 1 y dato 2 es: " + div);
		
		int resto = dato1 %dato3;
		System.out.println("el resto de la división de dato 1 y dato 2 es: " + resto);
		
		
		
		int num1,num2;
		num2=2;
		num1 = 2;
		System.out.println(num1==num2);
		
		
		int valor1,valor2;
		
		System.out.println("Ddame valores para valor 1 y valor 2 \nValor1:");
		valor1 = teclado.nextInt();
		System.out.println("Valor2: ");
		valor2= teclado.nextInt();
		
		boolean dato1mayor10, dato2mayor10, resultado;
		dato1mayor10 = (valor1>10);
		dato2mayor10 = (valor2 > 10);
		
		resultado = dato1mayor10 && dato2mayor10;
		System.out.println(resultado);
		
		teclado.close();
		
	}
	
	
	
}
