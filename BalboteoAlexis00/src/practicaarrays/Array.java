package practicaarrays;



public class Array {
	
	
	

	

	public static void main(String[] args) {
		
		
		int[] ubicacion = new int[2];
		
		int[][] tabla = new int[10][10];
		
		valoresTabla(tabla);
		mostarTabla(tabla);
		
		
		ubicacion= posicionDelNumero(tabla, 4);
		int x=ubicacion[0];
		int y=ubicacion[1];
		
		
		System.out.println(x +" "+ y);
		
		
		

	}
	
	
	public static void valoresTabla(int[][]tabla) {
		int valorR;
		for (int i = 0; i<10;i++) {
			for(int j = 0; j<10 ;j++) {
				valorR = (int) (Math.random() * 10);
				tabla[i][j] = valorR;
				
			}
		}
		
	}
	
	public static void mostarTabla(int[][]tabla) {
		
		for (int i = 0; i<10;i++) {
			System.out.print(i + " ");
			for(int j = 0; j<10 ;j++) {
				
				 System.out.print(tabla[i][j] + " ");
				
			}
			System.out.println();
			
		}
		
	}
	
	
	public static int[] posicionDelNumero(int[][]tabla, int num) {
		
		int[] ubicacion = new int[2];
		ubicacion[0]= 0;
		ubicacion[1] = 0;
		
		for (int i = 0; i<10;i++) {
			for(int j = 0; j<10 ;j++) {
				
				  
				if(tabla[i][j]==num && ubicacion[0] ==0 &&ubicacion[1]==0 ) {
					
					ubicacion[0]= i;
					ubicacion[1] = j;
				}
				
			}
		}
		
		return ubicacion;
		
		
	}
	
	
	

}
