package ejercicio1;


public class Ejercicio1 {

	public static void main(String[] args) {
		
		int cont;
		cont =1;
		int[][] numeros = new int[5][5];
		
		for(int i =0 ; i<5 ; i++) {
			
			for(int j = 0; j<5 ; j++) {
				
				numeros[i][j] = cont;
				System.out.print(numeros[i][j] +"\t");
				cont++;
			}
			
			System.out.println();
		}
		
		
		
		
		

	}

}
