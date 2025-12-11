/*
 * 
 *  Autor: Alexis
 */


package Ejercicios;

import libtarea3.Dado;

public class Ejercicio1 {

	public static void main(String[] args) {

		int[][] tiradas = new int[20][3];	// Para guardar los resultados de las tiradas
											// El tamaño está diseñado para que pueeda guardar todas las posibilidades.

		// 1 Numero maximo de puntos

		int ValorMax = (int) ((Math.random() * 30) + 30); 

		// 2 Creación de los jugadores

		Dado jugador1,jugador2,jugador3;
		
		
		try {
			
			 jugador1 = new Dado(6);
			
		} catch (IllegalArgumentException ex211) {
			 jugador1 = new Dado();
		}
		try {
			
			 jugador2 = new Dado(6);
			
		} catch (IllegalArgumentException ex22) {
			 jugador2 = new Dado();
		}
		try {
			
			 jugador3 = new Dado(6);
			
		} catch (IllegalArgumentException ex23) {
			 jugador3 = new Dado();
		}
			
			
			
		
		
		

		// 3 Lanzar dados

		// 3.1 y 3.2 ---Lanzamos los dados y Acumulamos puntuaciones

		int puntuacion = 0;

		int res1, res2, res3;   // res es abreviación de resultado

		int ronda = 0;

		do {

			res1 = jugador1.lanzar();
			tiradas[ronda][0] = res1;    // guardamos en un array los valores que van saliendo
			res2 = jugador2.lanzar();
			tiradas[ronda][1] = res2;    // guardamos en un array los valores que van saliendo
			res3 = jugador3.lanzar();
			tiradas[ronda][2] = res3;    // guardamos en un array los valores que van saliendo

			puntuacion = puntuacion + res1 + res2 + res3;

			ronda++;

		} while (puntuacion < ValorMax);

		// 4 Ganador:

		int ganador = 1;
		int resGanador = res1;

		if (res1 < res2) {
			if (res2 < res3) {

				ganador = 3;
				resGanador = res3;

			} else {

				ganador = 2;
				resGanador = res2;
			}
		} else if (res1 < res3) {

			ganador = 3;
			resGanador = res3;
		} else {
			ganador = 1;
			resGanador = res1;
		}

		// 5 resultados

		System.out.println("LANZAMIENTO DE DADOS: \n------------------\n ");

		// 5.1
		System.out.printf("Numero máximo de puntos: %d %n%n", ValorMax);

		// 5.2

		
		System.out.println("                        D1\tD2\tD3");
		
		for (int i = 0; i < jugador1.getNumeroLanzamientos(); i++) {

			System.out.printf("Lanzamiento nº: %d:\t", (i + 1));

			for (int j = 0; j < tiradas[i].length; j++) {

				System.out.print(tiradas[i][j] + "\t");
			}
			System.out.println();
		}

		// 5.3
		System.out.printf("El juego ha terminado, la suma de todas las tiradas es: %d %n", puntuacion);

		// 5.4

		System.out.printf("El dado ganador ha sido el dado %d, con %d puntos en la última tirada.%n", ganador,
				resGanador);

		// 5.5
		try {
			System.out.printf("El valor %d, ha salido un tota de %d veces en total.%n", resGanador,jugador1.getNumeroVecesCaraGlobal(resGanador));

		} catch (IllegalArgumentException ex55) {

		}

		// 5.6
		System.out.printf("Se han realizado un total de %d lanzamientos.%n", jugador1.getNumeroLanzamientosGlobal());

		// 5.7

		System.out.printf("Todos los lanzamientos del dado %d son: ", ganador);

		if (ganador == 1) {
			System.out.println(jugador1.getSerieHistoricaLanzamientos());
		} else if (ganador == 2) {
			System.out.println(jugador2.getSerieHistoricaLanzamientos());
		} else {
			System.out.println(jugador3.getSerieHistoricaLanzamientos());
		}

	}

}
