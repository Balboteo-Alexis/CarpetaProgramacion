package operadorescadenas;
import java.util.Scanner;


public class OperacioneCadenas 
{

	public static void main(String[] args) 
	{
	
		Scanner teclado = new Scanner(System.in);
		int longitud;
		
		
		String name;
		System.out.print("Dime tu nombre: ");
		name = teclado.nextLine();
		longitud = name.length();// Calcula la longitud
		System.out.println("Tú nombre es: "+ name+ " y su longitud es de : "+ longitud);
		name= name.trim(); // borra espacios en blanco
		longitud = name.length();// Calcula la longitud
		System.out.println("Tú nombre es: "+ name+ " y su longitud es de : "+ longitud);
		
		String nameminusculas;
		
		nameminusculas = name.toLowerCase(); // todo a minusculas
		System.out.print("\n"+nameminusculas);
		
		
		System.out.print("\n"+name.toUpperCase()); // todo a mayusculas
		
		
		teclado.close();
	}

}
