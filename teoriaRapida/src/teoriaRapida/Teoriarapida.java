package teoriaRapida;



import java.util.Scanner;    // para poder pedir por teclado hay que ponerlo
     //IMPORTANTEEEE//




import java.util.Scanner;

public class Teoriarapida 
{
	

	public static void main(String[] args) 
	{
		Scanner teclado = new Scanner(System.in); // Pedir por teclado, esto es indispensable y luego usaremos el teclado.loquesea
		int a = teclado.nextInt();
		System.out.print(a);
	
		teclado.close();
		
	}

}
