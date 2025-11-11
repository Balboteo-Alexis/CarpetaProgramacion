package add2;

import java.util.Arrays;
import java.util.Scanner;

public class Add2 {

	public static void main(String[] args) {

		int opmenu, filas, columnas ;

		Scanner teclado = new Scanner(System.in);

		
		
		System.out.print("Esto es un programa que hace cambios en tablas, para ello crearemos la tabla, "
				+ "dime las dimensiones de la misma." + " \n\nCuantas filas quiere que tenga tu tabla: ");
		filas = teclado.nextInt();
		System.out.print("Cuantas columnas: ");
		columnas = teclado.nextInt();
		
		System.out.println("\n");
		
		
		int[][] tabla = new int[filas][columnas];
		
		
		System.out.println("MENU:\n");

//		Menu basico
		
		
		

		opmenu = mostarMenu( teclado);

		while (opmenu > 12 || opmenu < 0) {
			System.out.println("Error de selección");
			System.out.println("\nElige de nuevo: ");
			opmenu = teclado.nextInt();

		}

		while (opmenu != 0) {


			switch (opmenu) {
			case 1: {

				rellenarTablaRandom(tabla);
				System.out.println("\nListo.");
				break;
			}
			case 2: {

				int valor, x, y ;					// AQUI PUEDO HACER ESTO O MEJOR ARRIBA CON LAS VARIABLES DEL MAIN?
				
			
				System.out.println("\nDime en que posicion y que valor quieres poner en la tabla.");
				System.out.print("Valor: ");
				valor = teclado.nextInt();							// NO HAY QUE INICIALIZARLO? 
				System.out.print("En que fila (empezando en el 0): ");
				x = teclado.nextInt();
				System.out.print("En que posicion de esa fila (empezando en el 0): ");
				y = teclado.nextInt();
				
				cambiarUnValor(tabla, valor, x, y);
				
				
				break;
			}
			case 3: {

				int num;
				
				System.out.print("\nQué numero es el que quieres contar: ");
				num = teclado.nextInt();
				
				
				System.out.println("\nEl numero " + num + " se ha repetido " + repeticionesNumero(tabla, num) + " veces en la tabla creada.");
				
				
				break;
			}
			case 4: {

				int fila, num;
				
				System.out.print("\nQue fila quieres modificar(empezando en el 0): ");
				fila = teclado.nextInt();
				System.out.print("Que numero quieres poner en esta fila: ");
				num = teclado.nextInt();
				
				filaMismoValor(tabla, fila, num);
				
				
				break;
			}
			case 5: {
				
				System.out.println("El valor maximo de la tabla es: " + valorMaxTabla(tabla));
				System.out.println("El valor minimo de la tabla es: " + valorMinTabla(tabla));
				
				
				break;
			}
			case 6: {
				
				System.out.println("\nLa suma de todos los valores de la tabla es de: " + sumaTodosNumeros(tabla));
				
				break;
			}
			case 7: {
				
				System.out.println();
				for(int i =0 ; i < tabla.length; i++) {
					
						System.out.println("La media de la fila "+ i + " es: "+ mediaFila(tabla, i));
				}
				break;
			}
			case 8: {
				
				System.out.println();
				
				
				
				break;
			}
			case 9: {
				
				int fila;
				
				System.out.println("Digame que fila quieres ordenar");
				fila = teclado.nextInt();
				
				ordenarFilaMayor(tabla, fila);
				
				
				break;
			}
			case 10: {
				
				System.out.println();
				mostrarTabla(tabla);
				
				break;
			}
			case 11: {
				
				borrarTabla(tabla);
				System.out.println("\nListo.");
				break;
			}
			case 12: {
				System.out.println();
				mostarMenu(teclado);
				
				break;
			}
			default:{
				
			}

			}
			mostarMenu(teclado);
			
			System.out.print("\nDigame que quiere hacer: ");
			opmenu = teclado.nextInt();
		}
		
		teclado.close();
		

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

//Rellena tabla con numeros aleatorios del 0 al 99
	public static void rellenarTablaRandom(int[][] tablaCualquiera) {

		for (int i = 0; i < tablaCualquiera.length; i++) {

			for (int j = 0; j < tablaCualquiera[i].length; j++) {

				tablaCualquiera[i][j] = (int) (Math.random() * 100);
			}
		}
	}

//	Mostar menu basico.
	public static int mostarMenu( Scanner teclado  ) {
		
		int eleccion;
		
		System.out.println("0 - Salir");
		System.out.println("1 - Rellenar tabla con valores random");
		System.out.println("2 - Poner un valor concreto en una posicion concreta");
		System.out.println("3 - Dime un numero y te digo cuentas veces se repite en la tabla");
		System.out.println("4 - Poner que una fila tenga el mismo numero en todas sus posiciones");
		System.out.println("5 - Mostrar el valor máximo y mínimo de la tabla");
		System.out.println("6 - Calcula la suma de todos los valores");
		System.out.println("7 - Mostrar la media de cada fila");
		System.out.println("8 - Buscar número y mostrar su posición");
		System.out.println("9 - Ordenar cada fila de la tabla de menor a mayor");
		System.out.println("10 - Mostrar tabla");
		System.out.println("11 - Borrar tabla (Toda la tabla a 0)");
		System.out.println("12 - Mostar menu.");
		
		
		System.out.println("\nQué eliges: ");
		eleccion = teclado.nextInt();
		
		return eleccion;
		
	}
	
//	Cambiar un valor concreto de la tabla                                                           PREGUNTAR SI VALE LA PENA HACER ESTE METODO O PONERLO EN EL MAIN
	public static void cambiarUnValor(int[][] tablaCualquiera, int valor, int x, int y ) {
		
		tablaCualquiera[x][y] = valor;
		
	}
	
//	Muestra cuantas veces se repite un numero en una tabla.
	public static int repeticionesNumero(int[][] tablaCualquiera, int num) {
		
		int repetido=0;
		
		for(int i = 0; i< tablaCualquiera.length; i++) {
			for(int j =0 ; j < tablaCualquiera.length ; j++) {
				
				if(num == tablaCualquiera[i][j]) {
					repetido++;
				}
			}
		}
		
		return repetido;
	}
	
	
//	Una fila con el mismo valor en todas sus posiciones												PREGUNTAR SI VALE LA PENA HACER ESTE METODO O PONERLO EN EL MAIN
	
	public static void filaMismoValor(int[][] tabla ,int fila, int num) {
		
		for(int i = 0; i < tabla[fila].length; i++ ) {
			
			tabla[fila][i] = num;
		}
		
	}
	
	
//	Calcula la suma de todos los valores de la tabla.
	public static long sumaTodosNumeros(int[][] tabla) {
		
		int total = 0;
		
		for (int i = 0; i < tabla.length; i++) {

			for (int j = 0; j < tabla[i].length; j++) {

				total = total + tabla [i][j];
			}
		}
		
		
		return total;
	}
	
//	Muestra el valor maximo de la tabla.
	
	public static int valorMaxTabla(int[][]tabla) {
		
		int maximo = tabla[0][0];
		
		for (int i = 0; i < tabla.length; i++) {

			for (int j = 0; j < tabla[i].length; j++) {

				if(maximo < tabla[i][j]) {
					maximo = tabla[i][j];
				}
			}
		}
		
		
		return maximo;
		
	}
	
	
//	Muestra el valor minimo de la tabla.
	
	public static int valorMinTabla(int[][]tabla) {
		
		int minimo = tabla[0][0];
		
		for (int i = 0; i < tabla.length; i++) {

			for (int j = 0; j < tabla[i].length; j++) {

				if(minimo > tabla[i][j]) {
					minimo = tabla[i][j];
				}
			}
		}
		
		
		return minimo;
	}



//	Muestra la media de una fila 
	public static int mediaFila(int[][] tabla, int fila) {
		int media = tabla[fila][0];						// ESTA VARIABLE LA INICALIZO A LA PRIMERA POSICION Y LUEGO EL BUCLE EMPIEZA EN LA SEGUNDA, FUNCIONA, PERO HAY UN AMANERA MEJOR DE HACERL0?
		
		for(int i = 1; i<tabla[fila].length ; i++) {
			
			media = media + tabla[fila][i];
			
		}
		
		media = media / tabla[fila].length;
		
		return media;
	}
	
//	Buscar un numero y decir su posicion
	
	
//	Ordenar una fila de menor a mayor
	
	public static void rodenarFila(int[][] tabla, int fila) {
		
		Arrays.sort(tabla[fila]);
		
		
	}
	
	
	
//	Borrar tablam, todos los valores a 0.
	
	public static void borrarTabla(int[][ ]tabla) {
		
		for (int i = 0; i < tabla.length; i++) {

			for (int j = 0; j < tabla[i].length; j++) {

				tabla[i][j] = 0;
			}
		}
		
		
	}
	
//	Ordenar una fila de mayor a menor.
	
	
	public static void ordenarFilaMayor(int[][] tabla, int fila) {
		
		for( int i = 0 ; i < tabla[fila].length ; i++   ) {
			
			int mayor;
			mayor = tabla[fila][i];
			
			for(int j = 0 ; j < tabla[fila].length; j++) {
					
				int guardado;
				
				if(mayor<tabla[fila][j]) {
					
					guardado = mayor;
					tabla[fila][i] = guardado;
					
					mayor = tabla[fila][j];
					
					
				}
			}
			
			tabla[fila][i] = mayor;
		}
		
		
	}
	
	
	
	
	
	
	
}
