package Ejercicios;

import libtarea3.Dado;

public class Ejercicio1 {

	public static void main(String[] args) {
		
		System.out.println("Lanzamiento de dados \n------------------\n ");
		
		int[][] almacen = new int[20][3];
		
		
		
		// 1 
		
		int ValorMax =  ( int ) ((Math.random()*30) + 30);
		

		// 2  
		
		Dado jugador1 = new Dado(6);
		Dado jugador2 = new Dado(6);
		Dado jugador3 = new Dado(6);
		
		
		
		
		
		int puntuacion = 0;
		
		int res1, res2, res3;
		
		int i = 0;
		
		do {
			
			
			res1 =  jugador1.lanzar();
			almacen[i][0] = res1;
			res2 =  jugador2.lanzar();
			almacen[i][1] = res2;
			res3 =  jugador3.lanzar();
			almacen[i][2] = res3;
			
			puntuacion = puntuacion +res1 +res2+res3;
			
			
			i++;
			
		} while (puntuacion< ValorMax);
		
		
		
		
		
		//4 Ganador:
		
		
		Dado ganador= new Dado();
		
		
		if(res1<res2) {
			if(res2<res3) {
				System.out.println("dado 3 es el ganador");
				ganador = jugador3;
				
			}else {
				System.out.println("dado 2 es el ganador");
				ganador = jugador2;
			}
		}else if(res1<res3) {
			System.out.println("dado 2 es el ganador");
			ganador = jugador2;
		}else {
			System.out.println("dado 1 es el ganador");
			ganador = jugador1;
		}
		
		
		
		
		
		// 5 resultados
		
		
		//5.1
		System.out.printf("El valor maximo es: %d %n", ValorMax);
		
		//5.2
		
		mostrarTabla(almacen);
		
		
		
		
		//5.3
		System.out.println("Puntuacion: " + puntuacion);
		
		//5.4 
		
		
		
		ganador.
		
		
		//5.6
		
		
		//5.7
		
		System.out.println(jugador1.getSerieHistoricaLanzamientos()); 
		System.out.println(jugador2.getSerieHistoricaLanzamientos());
		System.out.println(jugador3.getSerieHistoricaLanzamientos());
		
		
		
		
		

	}
	
	//Muestra la tabla por pantalla
		public static void mostrarTabla(int[][] tablaCualquiera) {

			for (int i = 0; i < tablaCualquiera.length; i++) {

				for (int j = 0; j < tablaCualquiera[i].length; j++) {

					System.out.print(tablaCualquiera[i][j] + " ");
				}
				System.out.println("\n");
			}
		}


}
