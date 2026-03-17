package ejercicio1;

import java.util.ArrayList;
import java.util.Collections;

public class Main {

	public static void main(String[] args) {

		ArrayList<Atleta> lista = new ArrayList<Atleta>();

		for (int i = 0; i < 25; i++) {

			lista.add(new Atleta());

		}

		double[] resultados = new double[2];

		resultados = promedio(lista);
		
		
		Collections.sort(lista, new Comparador());

		System.out.println(lista.toString());
		System.out.printf("Promedio de edad: %.2f %nPromedio de altura: %.2f", resultados[1], resultados[0]);
		System.out.println();
		System.out.printf("Menores en la lista: %d %nMayores de edad: %d", menores(lista),
				lista.size() - menores(lista));
		System.out.println();
		System.out.println("nombres de los atletas que son más altos que el promedio: \n" + nombresAtletasMejores(lista));

	}

	public static ArrayList<String> nombresAtletasMejores(ArrayList<Atleta> lista) {

		ArrayList<String> nombres = new ArrayList<String>();

		double[] resultados = new double[2];

		resultados = promedio(lista);

		for (Atleta atleta : lista) {

			if (atleta.getAltura() > resultados[0]) {

				nombres.add(atleta.getNombre());
				
			}

		}

		return nombres;

	}

	public static int menores(ArrayList<Atleta> lista) {

		int menores = 0;

		for (Atleta atleta : lista) {

			if (atleta.getEdad() < 18) {

				menores++;
			}
		}

		return menores;
	}

	public static double[] promedio(ArrayList<Atleta> lista) {

		double[] resultados = new double[2];

		int alturaMedia = 0;
		int edadMedia = 0;

		int contador = 0;

		for (Atleta i : lista) {
			alturaMedia += i.getAltura();
			edadMedia += i.getEdad();

			contador++;
		}

		alturaMedia = alturaMedia / contador;
		edadMedia = edadMedia / contador;

		resultados[0] = alturaMedia;
		resultados[1] = edadMedia;

		return resultados;

	}

}
