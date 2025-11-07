package metodos;

public class MetodosEjTemperaturas {

	public static void main(String[] args) {

		int[][] temperatura = new int[12][30];

		String[] Meses = { "Enero", "Febrero", "Marzo", "Abril", "Mayo", "Junio", "Julio", "Agosto", "Septiembre",
				"Octubre", "Noviembre", "Diciembre" };

		tablaRandom(temperatura);
		mostrarTabla(temperatura);

		for (int i = 0; i < 12; i++) {
			System.out.println(" Para el mes de " + Meses[i] + " el dia mas caluroso fue el día: "
					+ diaCalurosoMes(temperatura, i) + "Con una temperatura de: "
					+ tempDiaCaluroso(temperatura, i, diaCalurosoMes(temperatura, i)));
		}

	}
	
	
	
	
	
	

//	tablaRandom es un metodo para rellenar una tabla con numeros random
//  COGEMOS LA TABLA DEL MAIN PARA MODIFICARLA, EN ESTE CASO DARLE VALORES
	public static void tablaRandom(int[][] tablaCualquiera) {

		for (int i = 0; i < tablaCualquiera.length; i++) {

			for (int j = 0; j < tablaCualquiera[i].length; j++) {

				tablaCualquiera[i][j] = (int) (Math.random() * 40);
			}
		}
	}

//	mostrarTabla, muestra cualquier array de 2 dimentiones de tipo int
	public static void mostrarTabla(int[][] tablaCualquiera) {

		for (int i = 0; i < tablaCualquiera.length; i++) {

			System.out.print("Mes " + i + ":  ");

			for (int j = 0; j < tablaCualquiera[i].length; j++) {

				System.out.print(tablaCualquiera[i][j] + " ");
			}
			System.out.println("\n");
		}

	}

//	Buscaremos el dia caluroso del mes

	public static int diaCalurosoMes(int[][] tabla, int mes) {

		int diaCaluroso = tabla[mes][0];

		for (int i = 0; i < tabla[mes].length; i++) {
			if (diaCaluroso < tabla[mes][i]) {
				diaCaluroso = tabla[mes][i];
			}

		}

		return diaCaluroso;
	}

// La temperatura del dia caluroso

	public static int tempDiaCaluroso(int[][] tabla, int mes, int diaCaluroso) {
		int temperatura;
		temperatura = tabla[mes][diaCaluroso];

		return temperatura;
	}
	
	
	
	
	
//	Buscaremos el dia frio del mes

	public static int diaFrioMes(int[][] tabla, int mes) {

		int diaFrioso = tabla[mes][0];

		for (int i = 0; i < tabla[mes].length; i++) {
			if (diaCaluroso < tabla[mes][i]) {
				diaCaluroso = tabla[mes][i];
			}

		}

		return diaCaluroso;
	}
	
//	El día más frio
	
	public static int tempDiaFrio(int[][] tabla, int mes, int diaCaluroso) {
		int temperatura;
		temperatura = tabla[mes][diaCaluroso];

		return temperatura;
	}
	
	
	
	
	
	
	
	
	
	
	
}
