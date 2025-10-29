package ejercicio13;



public class Ejercicio13 {

	public static void main(String[] args) {
		
		int num, cont1,cont2,cont3,cont4,cont5,cont6;
		
		cont1=cont2=cont3=cont4=cont5=cont6 = 0;
		int max = 100;
		
		
		
		for(int i=0 ; i<max; i++) {
			
			
			num= (int) (Math.random()*6+1);
			
			System.out.println( "Dado: "+(i+1)+" " + num);
			
			switch (num) {
			case 1: {
				cont1++;
				break;
			}
			case 2: {
				cont2++;
				break;
			}
			case 3: {
				cont3++;
				break;
			}
			case 4: {
				cont4++;
				break;
			}
			case 5: {
				cont5++;
				break;
			}
			default:
				cont6++;
				break;
			}
						
			
		}
		
		
			System.out.println("El numero: " + 1+ " ha salido un " + cont1%max + "%");
			System.out.println("El numero: " + 2+ " ha salido un " + cont2%max + "%");
			System.out.println("El numero: " + 3+ " ha salido un " + cont3%max + "%");
			System.out.println("El numero: " + 4+ " ha salido un " + cont4%max + "%");
			System.out.println("El numero: " + 5+ " ha salido un " + cont5%max + "%");
			System.out.println("El numero: " + 6+ " ha salido un " + cont6%max + "%");
			
			
	}

}


