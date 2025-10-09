package bucles;
import java.util.Scanner;
public class While 
{
	
	public static void main(String[] args) 
	{
	
		int num, num1 = 0, contador = 0;
		
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("dime numeros par sumarlos, si quieres parar me das el 0");
		System.out.print("\nNumero: ");
		num = teclado.nextInt();
		num1 = num;
		contador=contador+1;
		while (num != 0 &&contador <8)
		{
			
			
			contador = contador +1;
		
			System.out.print("Numero: ");
			num = teclado.nextInt();
			num1 = num1 +num ;
			
			
		}
		
		
		System.out.print("\nLa suma de tus numeros es : "+num1);
		teclado.close();
		
	}
	
}
