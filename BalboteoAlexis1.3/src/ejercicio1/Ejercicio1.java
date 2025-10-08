/*
 * Descripción: Un programa que te calcula tu salario quitando irpf,calcula tambien teniendo en cuenta los años tu salario bruto.
 * Autor: Alexis Balboteo González.
 * Fecha: 1/10/2025
 */



package ejercicio1;
import java.util.Scanner;
public class Ejercicio1 
{

	public static void main(String[] args) 
	{
		
		Scanner teclado = new Scanner(System.in);
		
		String name, surname, bornData;
		double salary, salaryNeto,salaryFinal,aumento;
		int yearsWorked;
		
		System.out.println("Hola, vamos a calcular tú salario neto, para ello necesito algunos datos:");
		System.out.print("Digame su nombre: ");
		name = teclado.nextLine();
		System.out.print("Digame su apellido: ");
		surname = teclado.nextLine();
		System.out.print("Digame su fecha de nacimiento: ");
		bornData = teclado.nextLine();
		System.out.print("Digame su salario bruto: ");
		salary = teclado.nextDouble();
		System.out.print("Digame cuantos años lleva trabajando en la empresa: ");
		yearsWorked = teclado.nextInt();
		
		
		salaryNeto = salary * 0.85;
		aumento= yearsWorked * 2;
		salaryFinal= salary+ salary/aumento;
		
		
		System.out.print("Estimad@ "+ name+" "+surname+" su salario bruto es: " +salary+"$.\nTeniendo en cuenta un IRPF del 15% su salario neto es: "+salaryNeto+"$."
				+ "\nDebido a sus "+yearsWorked+" años trabajando en la empresa, su salario se incrementará en un 2% por cada año. El aumento es de: "+aumento+"% y el salario total es "+salaryFinal+".");
		
		teclado.close();
		
		
	}

}
