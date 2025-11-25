package ejercicio3;

import java.util.Scanner;

public class Ejercicio3 {

	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("dime un numero del 1 al 12 refirindonos a los meses");
		int num= teclado.nextInt();
		
		System.out.println(indicaMesDias(num));
		
		
	}
	
	
	public static String indicaMesDias(int num) {
		
		String texto;
		
		if(num>12 || num<1) {
			
			
			texto="El més es incorrecto";
			
		}else {
			
			switch (num) 
			{
				case 1:
				{
					texto="Eneroo, 31 días";
					break;
				}
				case 2:
				{
					texto="Febreroo, 18 días";
					break;
				}
				case 3:
				{
					texto="Marzoo, 31 días";
					break;
				}
				case 4:
				{
					texto="Abrilo, 31 días";
					break;
				}
				case 5:
				{
					texto="Mayoo, 31 días";
					break;
				}
				case 6:
				{
					texto="Junioo, 31 días";
					break;
				}
				case 7:
				{
					texto="Julioo, 31 días";
					break;
				}
				case 8:
				{
					texto="Agostoo, 31 días";
					break;
				}
				case 9:
				{
					texto="Septiembreo, 31 días";
					break;
				}
				case 10:
				{
					texto="Octubreo, 31 días";
					break;
				}
				case 11:
				{
					texto="Noviembreo, 31 días";
					break;
				}
				default:{
					texto="Diciembreo, 31 días";
					break;
				}	
			}
			
		}
		
		
		
		 
		return texto;
	}

}
