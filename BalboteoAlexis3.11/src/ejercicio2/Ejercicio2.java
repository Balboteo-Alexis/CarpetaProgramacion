package ejercicio2;

public class Ejercicio2 {

	public static void main(String[] args) {
		
		final int TAMANO = 10;
		
		int[][] tablas = new int[TAMANO][TAMANO];
		
		for(int i = 0 ; i<10 ; i++) {
			
			for(int j = 0; j<10 ; j++) {
				
				tablas[i][j] = i*j;
				System.out.print(tablas[i][j] + "\t");
			
				
			}
			
			System.out.println();
		}
		

	}

}
