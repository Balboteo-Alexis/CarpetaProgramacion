package ejercicio3_3;

import java.util.Scanner;

public class Ejercicio3_3 {

	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("dime un numero del 1 al 12 refirindonos a los meses");
		int num= teclado.nextInt();
		
		System.out.println(indicaMesDias(num));
		
	}
	
	public static String indicaMesDias(int num) {
		
		String texto;
		
		String[] meses = {"Enero","Febrero","Marzo","Abril","Mayo","Junio","Julio", "Agosto", "Septiembre","Octubre","Noviembre","Diciembre"};
		
		if(num>12||num<1) {
			texto= "Mes incorrecto";
		}else {
			
			
			texto = meses[num-1];
			
			switch (num) 
			{
				case 1,3,5,7,8,10,12:
				{
					texto=texto + ", 31 días";
					break;
				}
				case 4,6,9,11:
				{
					texto=texto +", 30 días";
					break;
				}
				default:
					texto= texto + ", 28 días";
			
			}
			
		}
		
		 
		return texto;
	}
	
	
	

}
